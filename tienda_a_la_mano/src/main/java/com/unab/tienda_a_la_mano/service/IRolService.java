package com.unab.tienda_a_la_mano.service;

import java.util.List;
import java.util.Optional;

import com.unab.tienda_a_la_mano.entity.RolEntity;



public interface IRolService {
	
	//Listar todos
	public List<RolEntity> all();
	
	//Listar por ID
	public Optional<RolEntity> findById(Long id);
	
	//Guardar-actualizar
	public RolEntity save(RolEntity rolEntity);	

	//Eliminar por ID
	public void deleteById(Long id);
}
