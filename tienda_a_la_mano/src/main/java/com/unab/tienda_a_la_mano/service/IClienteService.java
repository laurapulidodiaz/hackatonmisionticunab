package com.unab.tienda_a_la_mano.service;

import java.util.List;
import java.util.Optional;

import com.unab.tienda_a_la_mano.entity.ClienteEntity;



public interface IClienteService {
	
	//Listar todos
	public List<ClienteEntity> all();
	
	//Listar por ID
	public Optional<ClienteEntity> findById(Long id);
	
	//Guardar-actualizar
	public ClienteEntity save(ClienteEntity clienteEntity);	

	//Eliminar por ID
	public void deleteById(Long id);
}
