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

import com.unab.tienda_a_la_mano.entity.CategoriaEntity;
import com.unab.tienda_a_la_mano.service.ICategoriaService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/categoria")
public class CategoriaController {
	
	//Accedemos a los metodos de la interface de CategoriaService
	@Autowired
	private ICategoriaService service;
	
	//Con el metodo GET sin parametros consultamos todos los registros
	@GetMapping
	public List<CategoriaEntity> all(){
		return service.all();
	}
	
	//Con el metodo GET sin parametros consultamos todos los registros
	@GetMapping("/disponibles")
	public List<CategoriaEntity> hola(){
		return service.allActivos();
	}
	
	
	//Con el metodo GET con parametros consultamos los registros por ID
	@GetMapping("{id}")
	public Optional<CategoriaEntity> show(@PathVariable Long id){
		return service.findById(id);
	}
	
	//Con el metodo POST creamos los registros
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public CategoriaEntity save (@RequestBody CategoriaEntity categoriaEntity) {
		return service.save(categoriaEntity);
	}
	
	//Con el metodo PUT actualizamos los registros por ID
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public CategoriaEntity update(@PathVariable Long id, @RequestBody CategoriaEntity categoriaEntity) {
		Optional<CategoriaEntity> op = service.findById(id);
		
		if (!op.isEmpty()) {
			CategoriaEntity categoriaEntityUpdate = op.get();
			categoriaEntityUpdate.setDescripcion(categoriaEntity.getDescripcion());
			return service.save(categoriaEntityUpdate);	
		}
		
		return categoriaEntity;
	}
	
	//Con el metodo DELETE eliminamos los registros por ID
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}
}
