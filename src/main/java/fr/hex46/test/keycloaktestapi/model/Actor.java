/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.hex46.test.keycloaktestapi.model;

import com.fasterxml.jackson.annotation.JsonView;
import fr.hex46.test.keycloaktestapi.jsonview.ActorJsonView;
import fr.hex46.test.keycloaktestapi.jsonview.MovieJsonView;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Actor implements Serializable {
    @Id @GeneratedValue
    private Long id;
    @Column(nullable = false)
    @JsonView(value = {ActorJsonView.Public.class, MovieJsonView.Public.class})
    private String firstname;
    @Column(nullable = false)
    @JsonView(value = {ActorJsonView.Public.class, MovieJsonView.Public.class})
    private String lastname;
    @ManyToMany(mappedBy = "actors")
    @JsonView(value = {ActorJsonView.Public.class})
    private Set<Movie> movies = new HashSet<>();
}
