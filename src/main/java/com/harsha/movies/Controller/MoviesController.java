package com.harsha.movies.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoviesController {

    @GetMapping("/")
    public String hello(){
        return "Hello";
    }
}
