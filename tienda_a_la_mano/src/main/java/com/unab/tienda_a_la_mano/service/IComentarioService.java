package com.unab.tienda_a_la_mano.service;

import java.util.List;
import java.util.Optional;

import com.unab.tienda_a_la_mano.entity.ComentarioEntity;


public interface IComentarioService {
	
	//Listar todos
	public List<ComentarioEntity> all();
	
	//Listar por ID
	public Optional<ComentarioEntity> findById(Long id);
	
	//Guardar-actualizar
	public ComentarioEntity save(ComentarioEntity comentarioEntity);	

	//Eliminar por ID
	public void deleteById(Long id);
}
