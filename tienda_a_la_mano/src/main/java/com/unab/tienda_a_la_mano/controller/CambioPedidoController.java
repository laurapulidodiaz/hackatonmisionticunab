package com.unab.tienda_a_la_mano.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unab.tienda_a_la_mano.entity.CambioPedidoEntity;
import com.unab.tienda_a_la_mano.service.ICambioPedidoService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/cambioPedido")
public class CambioPedidoController {
	
	//Accedemos a los metodos de la interface de ProductoService
	@Autowired
	private ICambioPedidoService service;
	
	//Con el metodo GET sin parametros consultamos todos los registros
	@GetMapping
	public List<CambioPedidoEntity> all(){
		return service.all();
	}
	
	//Con el metodo GET con parametros consultamos los registros por ID
	@GetMapping("{id}")
	public Optional<CambioPedidoEntity> show(@PathVariable Long id){
		return service.findById(id);
	}
	
	
}
