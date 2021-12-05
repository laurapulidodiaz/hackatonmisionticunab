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

import com.unab.tienda_a_la_mano.entity.ClienteEntity;
import com.unab.tienda_a_la_mano.service.IClienteService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/cliente")
public class ClienteController {

	// Accedemos a los metodos de la interface de MarcaService
	@Autowired
	private IClienteService service;

	// Con el metodo GET sin parametros consultamos todos los registros
	@GetMapping
	public List<ClienteEntity> all() {
		return service.all();
	}

	// Con el metodo GET con parametros consultamos los registros por ID
	@GetMapping("{id}")
	public Optional<ClienteEntity> show(@PathVariable Long id) {
		return service.findById(id);
	}

	// Con el metodo POST creamos los registros
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public ClienteEntity save(@RequestBody ClienteEntity pedidEntity) {
		return service.save(pedidEntity);
	}

	// Con el metodo PUT actualizamos los registros por ID
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public ClienteEntity update(@PathVariable Long id, @RequestBody ClienteEntity pedidEntity) {
		Optional<ClienteEntity> op = service.findById(id);

		if (!op.isEmpty()) {
			ClienteEntity pedidoEntityUpdate = op.get();
			// actualizar cada propiedad

			pedidoEntityUpdate.setNombre(pedidEntity.getNombre());
			pedidoEntityUpdate.setTelefono(pedidEntity.getTelefono());
			pedidoEntityUpdate.setCedula(pedidEntity.getCedula());
			pedidoEntityUpdate.setClave(pedidEntity.getClave());
			pedidoEntityUpdate.setUsuario(pedidEntity.getUsuario());
			pedidoEntityUpdate.setEstado(pedidEntity.getEstado());
			pedidoEntityUpdate.setPuntos(pedidEntity.getPuntos());
			pedidoEntityUpdate.setSaldo(pedidEntity.getSaldo());
			pedidoEntityUpdate.setSesion(pedidEntity.getSesion());
			pedidoEntityUpdate.setCupo(pedidEntity.getCupo());
			pedidoEntityUpdate.setCuotas(pedidEntity.getCuotas());
			pedidoEntityUpdate.setRol(pedidEntity.getRol());
			pedidoEntityUpdate.setCiudad(pedidEntity.getCiudad());

			return service.save(pedidoEntityUpdate);
		}

		return pedidEntity;
	}

	// Con el metodo DELETE eliminamos los registros por ID
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}

}
