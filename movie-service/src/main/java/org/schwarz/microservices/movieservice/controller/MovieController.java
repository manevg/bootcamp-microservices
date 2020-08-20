package org.schwarz.microservices.movieservice.controller;

import org.schwarz.microservices.movieservice.domain.Movie;
import org.schwarz.microservices.movieservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping("/")
    public Movie saveMovie() {
        Movie movie = Movie.builder().id(1).name("Top Movie, bro!").director("Me, ofc").rating(10).build();
        return movieService.saveMovie(movie);
    }

}
