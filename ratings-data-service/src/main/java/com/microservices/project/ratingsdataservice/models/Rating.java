package com.microservices.project.ratingsdataservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Rating {
    private String movieId;
    private float rating;
}
