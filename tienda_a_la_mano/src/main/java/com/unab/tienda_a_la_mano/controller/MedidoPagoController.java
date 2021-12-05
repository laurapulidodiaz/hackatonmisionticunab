package com.unab.tienda_a_la_mano.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.unab.tienda_a_la_mano.entity.MedioPagoEntity;
import com.unab.tienda_a_la_mano.service.IMedioPagoService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/medioPago")
public class MedidoPagoController {
	
	//Accedemos a los metodos de la interface de ProductoService
	@Autowired
	private IMedioPagoService service;
	
	//Con el metodo GET sin parametros consultamos todos los registros
	@GetMapping
	public List<MedioPagoEntity> all(){
		return service.all();
	}
	
	//Con el metodo GET con parametros consultamos los registros por ID
	@GetMapping("{id}")
	public Optional<MedioPagoEntity> show(@PathVariable Long id){
		return service.findById(id);
	}
	
	//Con el metodo POST creamos los registros
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public MedioPagoEntity save (@RequestBody MedioPagoEntity MedioPagoEntity) {
		return service.save(MedioPagoEntity);
	}
	
	//Con el metodo PUT actualizamos los registros por ID
	@PutMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public MedioPagoEntity update(@RequestParam("id") Long id, @RequestParam("estado") String estado) {
		Optional<MedioPagoEntity> op = service.findById(id);
		
			MedioPagoEntity medioPagoEntityUpdate = op.get();
			medioPagoEntityUpdate.setEstado(estado);		
			
			return service.save(medioPagoEntityUpdate);	

	}
	
	//Con el metodo DELETE eliminamos los registros por ID
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}
}
