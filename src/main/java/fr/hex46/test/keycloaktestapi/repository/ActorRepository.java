/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.hex46.test.keycloaktestapi.repository;

import fr.hex46.test.keycloaktestapi.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface ActorRepository extends JpaRepository<Actor, Long>{
    @Query("SELECT a FROM Actor a WHERE LOWER(a.lastname) = LOWER(:lastname)"
            + "and LOWER(a.firstname) = LOWER(:firstname)")
    Actor findByLastnameAndFirstname(String lastname, String firstname);
}
