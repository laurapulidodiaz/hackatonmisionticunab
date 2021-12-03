package com.unab.tienda_a_la_mano.service;

import java.util.List;
import java.util.Optional;

import com.unab.tienda_a_la_mano.entity.CiudadEntity;


public interface ICiudadService {
	
	
	//Listar todos
	public List<CiudadEntity> all();
	
	//Listar por ID
	public Optional<CiudadEntity> findById(Long id);
	
	//Guardar-actualizar
	public CiudadEntity save(CiudadEntity ciudadEntity);	

	//Eliminar por ID
	public void deleteById(Long id);
}
