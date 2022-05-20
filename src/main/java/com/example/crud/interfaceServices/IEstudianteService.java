package com.example.crud.interfaceServices;

import java.util.List;
import java.util.Optional;

import com.example.crud.modelo.Estudiante;

public interface IEstudianteService {
	public List<Estudiante> listar();

	public Optional<Estudiante> listarId(int id);

	public int save(Estudiante p);

	public void delete(int id);
}
