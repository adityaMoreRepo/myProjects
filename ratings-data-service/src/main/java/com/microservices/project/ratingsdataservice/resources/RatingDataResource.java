package com.microservices.project.ratingsdataservice.resources;

import com.microservices.project.ratingsdataservice.models.Rating;
import com.microservices.project.ratingsdataservice.models.UserRating;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ratingsData")
public class RatingDataResource {
    @GetMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 8.3F);
    }

    @GetMapping("/users/{userID}")
    public UserRating getRatings(@PathVariable("userID") String userID) {
        return new UserRating(List.of(new Rating("123", 7.2F),
                new Rating("234", 8.1F)));
    }
}
