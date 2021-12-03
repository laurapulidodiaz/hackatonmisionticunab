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

import com.unab.tienda_a_la_mano.entity.ProductoEntity;
import com.unab.tienda_a_la_mano.service.IProductoService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/producto")
public class ProductoController {
	
	//Accedemos a los metodos de la interface de ProductoService
	@Autowired
	private IProductoService service;
	
	//Con el metodo GET sin parametros consultamos todos los registros
	@GetMapping
	public List<ProductoEntity> all(){
		return service.all();
	}
	
	//Con el metodo GET con parametros consultamos los registros por ID
	@GetMapping("{id}")
	public Optional<ProductoEntity> show(@PathVariable Long id){
		return service.findById(id);
	}
	
	//Con el metodo POST creamos los registros
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public ProductoEntity save (@RequestBody ProductoEntity ProductoEntity) {
		return service.save(ProductoEntity);
	}
	
	//Con el metodo PUT actualizamos los registros por ID
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public ProductoEntity update(@PathVariable Long id, @RequestBody ProductoEntity productoEntity) {
		Optional<ProductoEntity> op = service.findById(id);
		
		if (!op.isEmpty()) {
			ProductoEntity productoEntityUpdate = op.get();
			productoEntityUpdate.setNombre(productoEntity.getNombre());
			productoEntityUpdate.setPrecio(productoEntity.getPrecio());
			productoEntityUpdate.setCant_min(productoEntity.getCant_min());
			productoEntityUpdate.setPuntos(productoEntity.getPuntos());
			productoEntityUpdate.setStock(productoEntity.getStock());
			productoEntityUpdate.setCategoria(productoEntity.getCategoria());
			productoEntityUpdate.setMarca(productoEntity.getMarca());
			
			return service.save(productoEntityUpdate);	
		}
		
		return productoEntity;
	}
	
	//Con el metodo DELETE eliminamos los registros por ID
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}
}
