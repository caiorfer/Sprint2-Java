package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Preferencia;
import com.example.demo.repositories.PreferenciaRepository;

@RequestMapping (value = "/preferencia")
@RestController
public class PreferenciaControlador {
	@Autowired
	private PreferenciaRepository repository;
	
	@GetMapping
	public List<Preferencia> findAll(){
		List<Preferencia> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public Preferencia findById(@PathVariable Long id){
		Preferencia result = repository.findById(id).get();
		return result;
	}
	
	@PostMapping(value = "/{id}")
	public Preferencia insert(@RequestBody Preferencia preferencia){
		Preferencia result = repository.save(preferencia);
		return result;
	}
}
