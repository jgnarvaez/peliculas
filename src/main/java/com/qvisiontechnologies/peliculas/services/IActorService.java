package com.qvisiontechnologies.peliculas.services;

import java.util.List;

import com.qvisiontechnologies.peliculas.entities.Actor;

public interface IActorService {
    public List<Actor> findAll();
    public List<Actor> findAllById(List<Long> ids);
}
