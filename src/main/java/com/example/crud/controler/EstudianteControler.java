package com.example.crud.controler;

import org.springframework.validation.annotation.Validated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.crud.modelo.Estudiante;
import com.example.crud.interfaceServices.IEstudianteService;

import java.util.Optional;

@Controller
@RequestMapping
public class EstudianteControler {
	@Autowired
	private IEstudianteService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		model.addAttribute ("estudiantes", service.listar());
		return "index";
	}

	
	@GetMapping("/Crear")
	public String nuevo(Model model) {
		model.addAttribute("estudiante", new Estudiante());
		return "form";
	}
	
	@PostMapping("/Guardar")
	public String agregar(@Validated Estudiante estudiante, Model model) {
		int id =service.save(estudiante);
		if(id == 0) {
			return "form";
		}
		return "redirect:/listar";
	}

	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Estudiante> estudiante = service.listarId(id);
		model.addAttribute("estudiante",estudiante);
		return "form";
	}


	@GetMapping("/delete/{id}")
	public String eliminar(@PathVariable int id,Model model) {
		service.delete(id);
		return "redirect:/listar";
	}
}
