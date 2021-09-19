/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.hex46.test.keycloaktestapi.service;

import fr.hex46.test.keycloaktestapi.model.Actor;
import fr.hex46.test.keycloaktestapi.repository.ActorRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActorService {
    @Autowired
    private ActorRepository actorRepo;
    
    public List<Actor> findAll() {
        return this.actorRepo.findAll();
    }
    
    public Optional<Actor> findById(Long id) {
        return this.actorRepo.findById(id);
    }
}
