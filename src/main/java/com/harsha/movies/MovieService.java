package com.harsha.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepo repo;

    public List<Movie> getAllMovies(){
        return repo.findAll();
    }

    public Optional<Movie> getMovieByImdbId(String imdb){
        return repo.findByImdbId(imdb);
    }
}
