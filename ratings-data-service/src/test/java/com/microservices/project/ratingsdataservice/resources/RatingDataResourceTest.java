package com.microservices.project.ratingsdataservice.resources;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@WebMvcTest
class RatingDataResourceTest {
    @Autowired
    MockMvc mockMvc;
    @Test
    void getRating() throws Exception {

        MockHttpServletRequestBuilder requestBuilder = get("/ratingsData/1")
                .accept(MediaType.APPLICATION_JSON);
        ResultActions resultActions = mockMvc.perform(requestBuilder)
                .andDo(print());

        resultActions.andExpect(MockMvcResultMatchers.status().isOk());
    }
}