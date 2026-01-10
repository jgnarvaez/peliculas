package com.qvisiontechnologies.peliculas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qvisiontechnologies.peliculas.dao.IActorRepository;
import com.qvisiontechnologies.peliculas.entities.Actor;

@Service
public class ActorServiceImpl implements IActorService{

    @Autowired
    private IActorRepository repo;

    @Override
    public List<Actor> findAll() {
        return (List<Actor>) repo.findAll();
    }

    @Override
    public List<Actor> findAllById(List<Long> ids) {
        return (List<Actor>) repo.findAllById(ids);
    }

}
