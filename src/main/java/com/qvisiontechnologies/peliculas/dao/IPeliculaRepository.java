package com.qvisiontechnologies.peliculas.dao;

import org.springframework.data.repository.CrudRepository;

import com.qvisiontechnologies.peliculas.entities.Pelicula;

public interface IPeliculaRepository extends CrudRepository<Pelicula, Long>{

}
