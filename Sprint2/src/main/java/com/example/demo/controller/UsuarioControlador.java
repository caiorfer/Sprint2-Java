package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Usuario;
import com.example.demo.repositories.UsuarioRepository;

@RequestMapping (value = "/usuario")
@RestController
public class UsuarioControlador {
	
	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping
	public List<Usuario> findAll(){
		List<Usuario> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public Usuario findById(@PathVariable Long id){
		Usuario result = repository.findById(id).get();
		return result;
	}
	
	@PostMapping(value = "/{id}")
	public Usuario insert(@RequestBody Usuario usuario){
		Usuario result = repository.save(usuario);
		return result;
	}
}
