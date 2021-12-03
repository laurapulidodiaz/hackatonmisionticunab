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

import com.unab.tienda_a_la_mano.entity.PromocionEntity;
import com.unab.tienda_a_la_mano.service.IPromocionService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/promocion")
public class PromocionController {
	
	//Accedemos a los metodos de la interface de ProductoService
	@Autowired
	private IPromocionService service;
	
	//Con el metodo GET sin parametros consultamos todos los registros
	@GetMapping
	public List<PromocionEntity> all(){
		return service.all();
	}
	
	//Con el metodo GET con parametros consultamos los registros por ID
	@GetMapping("{id}")
	public Optional<PromocionEntity> show(@PathVariable Long id){
		return service.findById(id);
	}
	
	//Con el metodo POST creamos los registros
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public PromocionEntity save (@RequestBody PromocionEntity PromocionEntity) {
		return service.save(PromocionEntity);
	}
	
	//Con el metodo PUT actualizamos los registros por ID
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public PromocionEntity update(@PathVariable Long id, @RequestBody PromocionEntity promocionEntity) {
		Optional<PromocionEntity> op = service.findById(id);
		
		if (!op.isEmpty()) {
			PromocionEntity promocionEntityUpdate = op.get();
			promocionEntityUpdate.setTipo(promocionEntity.getTipo());
			promocionEntityUpdate.setValor(promocionEntity.getValor());
			promocionEntityUpdate.setFecha_inicial(promocionEntity.getFecha_inicial());
			promocionEntityUpdate.setFecha_final(promocionEntity.getFecha_final());
			promocionEntityUpdate.setProducto(promocionEntity.getProducto());			
			
			return service.save(promocionEntityUpdate);	
		}
		
		return promocionEntity;
	}
	
	//Con el metodo DELETE eliminamos los registros por ID
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}
}
