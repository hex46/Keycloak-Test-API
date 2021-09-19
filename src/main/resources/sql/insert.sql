insert into actor(id, firstname, lastname) values
    (1, 'Keanu','Reeves'),
    (2, 'Laurence','Fishburne'),
    (3, 'Carrie-Anne','Moss'),
    (4, 'Moss','Weisz');

insert into movie(id, created, title, description) values
    (1, '03/31/1999' , 'The Matrix', 'Wake up Neo...'),
    (2, '02/07/2005' , 'Constantine', 'You should. He believes in you.');


insert into movie_actors(actors_id, movies_id) values
    (1, 1),
    (1, 2),
    (2, 1),
    (3, 1),
    (4, 2);
