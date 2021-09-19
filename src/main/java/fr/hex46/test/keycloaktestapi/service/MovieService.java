/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.hex46.test.keycloaktestapi.service;

import fr.hex46.test.keycloaktestapi.model.Movie;
import fr.hex46.test.keycloaktestapi.repository.MovieRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepo;
    
    public List<Movie> findAll() {
        return this.movieRepo.findAll();
    }
    
    public Optional<Movie> findById(Long id) {
        return this.movieRepo.findById(id);
    }
}
