package com.qvisiontechnologies.peliculas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.qvisiontechnologies.peliculas.entities.Pelicula;

public interface IPeliculaRepository extends JpaRepository<Pelicula, Long>{

}
