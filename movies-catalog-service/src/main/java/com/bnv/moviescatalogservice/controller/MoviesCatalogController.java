package com.bnv.moviescatalogservice.controller;

import com.bnv.moviescatalogservice.model.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MoviesCatalogController {

     @GetMapping("/{id}")
    public List<Movie> getMovies(@PathVariable Long id)
     {
         return Collections.singletonList(new Movie("After","Test",4.5));
     }

}
