package com.example.crud.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.crud.modelo.Estudiante;
@Repository
public interface IEstudiante extends CrudRepository<Estudiante, Integer>{

}
