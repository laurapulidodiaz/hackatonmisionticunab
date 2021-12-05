package com.unab.tienda_a_la_mano.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	
	//Con el metodo GET en la ruta "/buscar?filtro=#Filtro" buscamos productos especificos
	@GetMapping("/buscar")
	public List<ProductoEntity> allByNombreOMarca(@RequestParam String filtro){
		return service.allByNombreOMarca(filtro);
	}
	
	//Con el metodo GET en la ruta /sinStock listamos los productos sin stock
	@GetMapping("/sinStock")
	public List<ProductoEntity> allSinStock(){
		return service.allSinStock();
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
	
	@PutMapping("/cantMin")
	public ResponseEntity<?> updateCantidadMinima(@RequestParam("id_producto") Long id, @RequestParam("cantidad") Double cant_min) {
		Map<String, Object> respuesta = new HashMap<>();
		try {
			Optional<ProductoEntity> op = service.findById(id);
			
			if (!op.isEmpty()) {
				ProductoEntity productoEntityUpdate = op.get();
				productoEntityUpdate.setCant_min(cant_min);
				service.save(productoEntityUpdate);	
			}
		} catch (DataAccessException e) {
			respuesta.put("ERROR", "Producto no encontrado");
			return new ResponseEntity<Map<String, Object>>(respuesta, HttpStatus.NOT_FOUND);
		}
		respuesta.put("Excelente", "Se asignó la cantidad minima al producto");
		return new ResponseEntity<Map<String, Object>>(respuesta, HttpStatus.OK);
		
	
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
			productoEntityUpdate.setCategoria(productoEntity.getCategoria());
			productoEntityUpdate.setMarca(productoEntity.getMarca());
			
			return service.save(productoEntityUpdate);	
		}
		
		return productoEntity;
	}
	
	//Con el metodo DELETE eliminamos los registros por ID
	@DeleteMapping("{id}")
	//@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public ResponseEntity<?> delete(@PathVariable("id") Long id) {
		Map<String, Object> respuesta = new HashMap<>();
		try {
			service.deleteById(id);
		} catch (DataAccessException e) {
			respuesta.put("Holaaaaaaa", "Errorrrr");
			return new ResponseEntity<Map<String, Object>>(respuesta, HttpStatus.NOT_ACCEPTABLE);
		}
		respuesta.put("Holaaaaaaa", "Se elimino");
		return new ResponseEntity<Map<String, Object>>(respuesta, HttpStatus.NO_CONTENT);
		
	
	}
}
