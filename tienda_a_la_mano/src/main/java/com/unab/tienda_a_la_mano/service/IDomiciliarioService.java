package com.unab.tienda_a_la_mano.service;

import java.util.List;
import java.util.Optional;

import com.unab.tienda_a_la_mano.entity.DomiciliarioEntity;


public interface IDomiciliarioService {
	
	
	//Listar todos
	public List<DomiciliarioEntity> all();
	
	//Listar por ID
	public Optional<DomiciliarioEntity> findById(Long id);
	
	//Guardar-actualizar
	public DomiciliarioEntity save(DomiciliarioEntity domiciliarioEntity);	

	//Eliminar por ID
	public void deleteById(Long id);
}
