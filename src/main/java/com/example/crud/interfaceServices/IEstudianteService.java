package com.example.crud.interfaceServices;

import java.util.List;
import java.util.Optional;

import com.example.crud.modelo.Estudiante;

public interface IEstudianteService {
	public List<Estudiante> listar();
	public List<Estudiante> listarA();

	public Optional<Estudiante> listarId(int id);

	public int save(Estudiante p);
	public int update(String nombre, String telefono, String email,  int id);
	public void delete(int id);


}
