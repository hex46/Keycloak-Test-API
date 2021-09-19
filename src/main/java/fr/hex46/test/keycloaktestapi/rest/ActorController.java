/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.hex46.test.keycloaktestapi.rest;

import com.fasterxml.jackson.annotation.JsonView;
import fr.hex46.test.keycloaktestapi.jsonview.ActorJsonView;
import fr.hex46.test.keycloaktestapi.model.Actor;
import fr.hex46.test.keycloaktestapi.service.ActorService;
import java.util.List;
import javax.annotation.security.RolesAllowed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actors")
public class ActorController {
    
    @Autowired
    private ActorService actorService;
    
    @RolesAllowed(value = { "user", "admin" })
    @GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    @JsonView(value = ActorJsonView.Public.class) 
    public List<Actor> findAll() {
        return actorService.findAll();
    }
}
