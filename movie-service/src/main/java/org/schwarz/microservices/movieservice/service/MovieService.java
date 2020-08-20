package org.schwarz.microservices.movieservice.service;

import org.schwarz.microservices.movieservice.domain.Movie;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    // Repository relations here.
    public Movie saveMovie(Movie movie) {
        return movie;
    }

}
