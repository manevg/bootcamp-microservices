package org.schwarz.microservices.movieservice.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    private int id;
    private String name;
    private String director;
    private List<String> actors;
    private float rating;

}
