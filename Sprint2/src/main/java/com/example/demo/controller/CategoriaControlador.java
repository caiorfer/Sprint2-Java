package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Categoria;
import com.example.demo.repositories.CategoriaRepository;

@RequestMapping (value = "/categoria")
@RestController
public class CategoriaControlador {
	
	@Autowired 
	private CategoriaRepository repository;
	
	@GetMapping
	public List<Categoria> findAll(){
		List<Categoria> result = repository.findAll();
		return result;

	}
	
	@GetMapping(value = "/{id}")
	public Categoria findById(@PathVariable Long id){
		Categoria result = repository.findById(id).get();
		return result;
	}
	
	@PostMapping(value = "/{id}")
	public Categoria insert(@RequestBody Categoria categoria){
		Categoria result = repository.save(categoria);
		return result;
	}
}

