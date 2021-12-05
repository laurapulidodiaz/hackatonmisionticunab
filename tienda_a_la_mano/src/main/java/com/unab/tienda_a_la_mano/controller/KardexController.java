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

import com.unab.tienda_a_la_mano.entity.KardexEntity;
import com.unab.tienda_a_la_mano.service.IKardexService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/kardex")
public class KardexController {
	
	//Accedemos a los metodos de la interface de ProductoService
	@Autowired
	private IKardexService service;
	
	//Con el metodo GET sin parametros consultamos todos los registros
	@GetMapping
	public List<KardexEntity> all(){
		return service.all();
	}
	
	//Todos los productos disponibles
	@GetMapping("/disponibles")
	public List<KardexEntity> allProductos(){
		return service.allProductos();
	}
	
	//Con el metodo GET con parametros consultamos los registros por ID
	@GetMapping("{id}")
	public Optional<KardexEntity> show(@PathVariable Long id){
		return service.findById(id);
	}
	
	//Con el metodo POST creamos los registros
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public KardexEntity save (@RequestBody KardexEntity KardexEntity) {
		return service.save(KardexEntity);
	}
	
	//Con el metodo PUT actualizamos los registros por ID
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public KardexEntity update(@PathVariable Long id, @RequestBody KardexEntity kardexEntity) {
		Optional<KardexEntity> op = service.findById(id);
		
		if (!op.isEmpty()) {
			KardexEntity kardexEntityUpdate = op.get();
			kardexEntityUpdate.setFecha(kardexEntity.getFecha());
			kardexEntityUpdate.setStock(kardexEntity.getStock());
			kardexEntityUpdate.setProducto(kardexEntity.getProducto());
			kardexEntityUpdate.setTienda(kardexEntity.getTienda());		
			
			return service.save(kardexEntityUpdate);	
		}
		
		return kardexEntity;
	}
	
	//Con el metodo DELETE eliminamos los registros por ID
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}
}
