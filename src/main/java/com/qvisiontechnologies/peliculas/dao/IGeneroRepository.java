package com.qvisiontechnologies.peliculas.dao;

import org.springframework.data.repository.CrudRepository;

import com.qvisiontechnologies.peliculas.entities.Genero;

public interface IGeneroRepository extends CrudRepository<Genero, Long>{
    
}
