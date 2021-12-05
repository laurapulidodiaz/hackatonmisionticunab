package com.unab.tienda_a_la_mano.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.unab.tienda_a_la_mano.entity.DireccionEntregaEntity;
import com.unab.tienda_a_la_mano.service.IDireccionEntregaService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/direccionEntrega")
public class DireccionEntregaController {
	
	//Accedemos a los metodos de la interface de DireccionEntregaService
	@Autowired
	private IDireccionEntregaService service;
	
	//Con el metodo GET sin parametros consultamos todos los registros
	@GetMapping
	public List<DireccionEntregaEntity> all(){
		return service.all();
	}
	
	
	//Con el metodo GET con parametros consultamos los registros por ID
	@GetMapping("{id}")
	public Optional<DireccionEntregaEntity> show(@PathVariable Long id){
		return service.findById(id);
	}
	
	//Con el metodo POST creamos los registros
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public DireccionEntregaEntity save (@RequestBody DireccionEntregaEntity direccionEntregaEntity) {
		return service.save(direccionEntregaEntity);
	}
	

}
