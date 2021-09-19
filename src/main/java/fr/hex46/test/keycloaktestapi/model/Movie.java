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
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Movie implements Serializable {
    @Id @GeneratedValue
    private Long id;
    @Column(nullable = false)
    @JsonView(value = {MovieJsonView.Public.class, ActorJsonView.Public.class})
    private String title;
    @JsonView(value = {MovieJsonView.Public.class, ActorJsonView.Public.class})
    private String description;
    @Temporal(TemporalType.DATE)
    @JsonView(value = {MovieJsonView.Public.class, ActorJsonView.Public.class})
    private Date created;
    @ManyToMany
    @JsonView(value = {MovieJsonView.Public.class})
    private Set<Actor> actors = new HashSet<>();
}
