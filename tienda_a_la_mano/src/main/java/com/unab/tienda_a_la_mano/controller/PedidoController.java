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

import com.unab.tienda_a_la_mano.entity.PedidoEntity;
import com.unab.tienda_a_la_mano.service.IPedidoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/pedido")
public class PedidoController {

	//Accedemos a los metodos de la interface de MarcaService
	@Autowired
	private IPedidoService service;
	
	//Con el metodo GET sin parametros consultamos todos los registros
	@GetMapping
	public List<PedidoEntity> all(){
		return service.all();
	}
	
	//Con el metodo GET con parametros consultamos los registros por ID
	@GetMapping("{id}")
	public Optional<PedidoEntity> show(@PathVariable Long id){
		return service.findById(id);
	}
	
	//Con el metodo POST creamos los registros
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public PedidoEntity save (@RequestBody PedidoEntity entidad) {
		return service.save(entidad);
	}
	
	//Con el metodo PUT actualizamos los registros por ID
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public PedidoEntity update(@PathVariable Long id, @RequestBody PedidoEntity entidad) {
		Optional<PedidoEntity> op = service.findById(id);
		
		if (!op.isEmpty()) {
			PedidoEntity tabla = op.get();
			//actualizar cada propiedad
			
			tabla.setCalificacion	(entidad.getCalificacion());
			tabla.setFecha			(entidad.getFecha());
			tabla.setCosto_envio	(entidad.getCosto_envio());
			tabla.setPago_entrega	(entidad.getPago_entrega());
			tabla.setCliente		(entidad.getCliente());
			tabla.setDomiciliario	(entidad.getDomiciliario());
			tabla.setEstado			(entidad.getEstado());
			tabla.setObservacion	(entidad.getObservacion());
			tabla.setPago_entrega	(entidad.getPago_entrega());
			tabla.setRango_entrega	(entidad.getRango_entrega());
			tabla.setTienda			(entidad.getTienda());
			tabla.setTipo_entrega	(entidad.getTipo_entrega());
			tabla.setTotal_descuento(entidad.getTotal_descuento());
			tabla.setTotal_impuesto	(entidad.getTotal_impuesto());
			tabla.setTotal_pedido	(entidad.getTotal_pedido());
			
			return service.save(tabla);	
		}
		
		return entidad;
	}
	
	//Con el metodo DELETE eliminamos los registros por ID
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}
	
}
