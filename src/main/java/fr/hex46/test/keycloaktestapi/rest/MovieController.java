/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.hex46.test.keycloaktestapi.rest;

import com.fasterxml.jackson.annotation.JsonView;
import fr.hex46.test.keycloaktestapi.jsonview.MovieJsonView;
import fr.hex46.test.keycloaktestapi.model.Movie;
import fr.hex46.test.keycloaktestapi.service.MovieService;
import java.util.List;
import javax.annotation.security.RolesAllowed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {
    
    @Autowired
    private MovieService movieService;
    
    @RolesAllowed(value = { "user", "admin" })
    @GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    @JsonView(value = MovieJsonView.Public.class) 
    public List<Movie> findAll() {
        return movieService.findAll();
    }
}
