package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ItemRecomendado;

import com.example.demo.repositories.ItemRecomendadoRepository;

@RequestMapping (value = "/itemrecomendado")
@RestController
public class ItemRecomendadoControlador {
		
	@Autowired
	private ItemRecomendadoRepository repository;
	
	@GetMapping
	public List<ItemRecomendado> findAll(){
		List<ItemRecomendado> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public ItemRecomendado findById(@PathVariable Long id){
		ItemRecomendado result = repository.findById(id).get();
		return result;
	}
	
	@PostMapping(value = "/{id}")
	public ItemRecomendado insert(@RequestBody ItemRecomendado itemRecomendado){
		ItemRecomendado result = repository.save(itemRecomendado);
		return result;
	}
}

