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

import com.unab.tienda_a_la_mano.entity.CuponEntity;
import com.unab.tienda_a_la_mano.service.ICuponService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/cupon")
public class CuponController {
	
	//Accedemos a los metodos de la interface de ProductoService
	@Autowired
	private ICuponService service;
	
	//Con el metodo GET sin parametros consultamos todos los registros
	@GetMapping
	public List<CuponEntity> all(){
		return service.all();
	}
	
	//Con el metodo GET con parametros consultamos los registros por ID
	@GetMapping("{id}")
	public Optional<CuponEntity> show(@PathVariable Long id){
		return service.findById(id);
	}
	
	//Con el metodo POST creamos los registros
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public CuponEntity save (@RequestBody CuponEntity CuponEntity) {
		return service.save(CuponEntity);
	}
	
	//Con el metodo PUT actualizamos los registros por ID
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public CuponEntity update(@PathVariable Long id, @RequestBody CuponEntity cuponEntity) {
		Optional<CuponEntity> op = service.findById(id);
		
		if (!op.isEmpty()) {
			CuponEntity cuponEntityUpdate = op.get();
			cuponEntityUpdate.setDescripcion(cuponEntity.getDescripcion());
			cuponEntityUpdate.setTipo(cuponEntity.getTipo());
			cuponEntityUpdate.setEstado(cuponEntity.getEstado());
			cuponEntityUpdate.setCategoria(cuponEntity.getCategoria());
			cuponEntityUpdate.setMarca(cuponEntity.getMarca());			
			
			return service.save(cuponEntityUpdate);	
		}
		
		return cuponEntity;
	}
	
	//Con el metodo DELETE eliminamos los registros por ID
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}
}
