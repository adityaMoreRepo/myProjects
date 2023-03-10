package com.example.service;

import io.micrometer.observation.Observation;
import io.micrometer.observation.ObservationRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.function.Supplier;

@SpringBootApplication
public class ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);

        //create a bean that listens to the event
    }

    @Bean
    ApplicationListener<ApplicationReadyEvent> readyEventApplicationListener(CustomerService cs) {
        return event -> cs.all().forEach(System.out::println);
    }

}

@Service
class CustomerService {
    private final JdbcTemplate jdbcTemplate;
    private final RowMapper<Customers> customersRowMapper =
            (rs, rowNum) -> new Customers(rs.getInt("id"),
                    rs.getString("name"));

    public CustomerService(@Autowired JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    Collection<Customers> all() {
        return this.jdbcTemplate.query("select * from customers",
                this.customersRowMapper);
    }

    Customers byId(Integer id) {
        return this.jdbcTemplate.queryForObject("select * from customers where id=?",
                this.customersRowMapper, id);
    }

    public Customers getByName(String name) {
        return this.jdbcTemplate.queryForObject("select * from customers where name=?",
                customersRowMapper, name);
    }
}

@RestController
class Customerhttp {
    private final CustomerService service;
    private final ObservationRegistry registry;

    @Autowired
    public Customerhttp(CustomerService service, ObservationRegistry registry) {
        this.service = service;
        this.registry = registry;
    }

    @GetMapping("/customers")
    Collection<Customers> getAll() {
        return this.service.all();
    }

    @GetMapping("/customer/{id}")
    Customers getById(@PathVariable Integer id) {
        return this.service.byId(id);
    }


    @GetMapping("/customerByName/{name}")
    Customers getByName(@PathVariable("name") String name) {
        //By new features you can assert that Name starts with capital letter. We can deal with the error!
        Assert.state(Character.isUpperCase(name.charAt(0)), "The name must start with a capital letter!");
//        return this.service.getByName(name);
        //Now for monitoring and observability purposes we have new features
        return Observation
                .createNotStarted("byName", this.registry)
                .observe(() -> service.getByName(name));
        //Resume the video : https://www.youtube.com/live/Y2gZz8-yK7Y?feature=share&t=1465
    }
}

// == For centralized error Handling ==
@ControllerAdvice
class ErrorHandlingComponent {
    @ExceptionHandler
    public ProblemDetail handleIllegalStateException(IllegalStateException illegalStateException) {
        //returning the problem details arose from that exception
        var pd = ProblemDetail.forStatus(HttpStatusCode.valueOf(404));
        pd.setDetail("The name must start with capital letter!");
        return pd;
    }
}

//no Lombok!
record Customers(Integer id, String name) {
}
