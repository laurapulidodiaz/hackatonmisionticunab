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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.unab.tienda_a_la_mano.entity.MarcaEntity;
import com.unab.tienda_a_la_mano.service.IMarcaService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/marca")
public class MarcaController {
	
	//Accedemos a los metodos de la interface de MarcaService
	@Autowired
	private IMarcaService service;
	
	//Con el metodo GET sin parametros consultamos todos los registros
	@GetMapping
	public List<MarcaEntity> all(){
		return service.all();
	}
	
	//Con el metodo GET con parametros consultamos los registros por ID
	@GetMapping("{id}")
	public Optional<MarcaEntity> show(@PathVariable Long id){
		return service.findById(id);
	}
	
	//Con el metodo POST creamos los registros
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public MarcaEntity save (@RequestBody MarcaEntity marcaEntity) {
		return service.save(marcaEntity);
	}
	
	//Con el metodo PUT actualizamos los registros por ID
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public MarcaEntity update(@PathVariable Long id, @RequestBody MarcaEntity marcaEntity) {
		Optional<MarcaEntity> op = service.findById(id);
		
		if (!op.isEmpty()) {
			MarcaEntity marcaEntityUpdate = op.get();
			marcaEntityUpdate.setDescripcion(marcaEntity.getDescripcion());
			return service.save(marcaEntityUpdate);	
		}
		
		return marcaEntity;
	}
	
	//Con el metodo DELETE eliminamos los registros por ID
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}
}
