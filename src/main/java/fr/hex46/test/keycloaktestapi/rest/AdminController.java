/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.hex46.test.keycloaktestapi.rest;

import com.fasterxml.jackson.annotation.JsonView;
import fr.hex46.test.keycloaktestapi.jsonview.ActorJsonView;
import javax.annotation.security.RolesAllowed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    
    @RolesAllowed(value = { "admin" })
    @GetMapping(path = "/")
    @JsonView(value = ActorJsonView.Public.class) 
    public String hello() {
        return "Hello Admin!";
    }
}
