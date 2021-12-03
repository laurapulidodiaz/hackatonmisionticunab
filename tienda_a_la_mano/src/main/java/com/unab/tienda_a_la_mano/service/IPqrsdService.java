package com.unab.tienda_a_la_mano.service;

import java.util.List;
import java.util.Optional;

import com.unab.tienda_a_la_mano.entity.PqrsdEntity;


public interface IPqrsdService {
	
	
	//Listar todos
	public List<PqrsdEntity> all();
	
	//Listar por ID
	public Optional<PqrsdEntity> findById(Long id);
	
	//Guardar-actualizar
	public PqrsdEntity save(PqrsdEntity pqrsdEntity);	

	//Eliminar por ID
	public void deleteById(Long id);
}
