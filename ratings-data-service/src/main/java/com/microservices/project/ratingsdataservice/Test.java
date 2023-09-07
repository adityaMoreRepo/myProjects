package com.microservices.project.ratingsdataservice;

import com.microservices.project.ratingsdataservice.models.Rating;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Rating> ratings = List.of();
        for(Rating rating : ratings){
            System.out.println(rating.getMovieId());
        }
    }
}
