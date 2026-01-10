package com.qvisiontechnologies.peliculas.dao;

import org.springframework.data.repository.CrudRepository;

import com.qvisiontechnologies.peliculas.entities.Actor;

public interface IActorRepository extends CrudRepository<Actor, Long>{

}
