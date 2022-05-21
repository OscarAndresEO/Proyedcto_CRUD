package com.example.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.crud.modelo.Estudiante;
import com.example.crud.interfaces.IEstudiante;
import com.example.crud.interfaceServices.IEstudianteService;

@Service
public class EstudianteService implements IEstudianteService {

	@Autowired
	private IEstudiante data;
	
	@Override
	public List<Estudiante> listar() {
		return (List<Estudiante>) data.findAll();
	}

	@Override
	public Optional<Estudiante> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Estudiante e) {
		int res = 0;
		Estudiante estudiante  =data.save(e);
		if(!estudiante.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
	}

}
