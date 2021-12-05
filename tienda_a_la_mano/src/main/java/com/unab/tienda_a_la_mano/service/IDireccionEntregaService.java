package com.unab.tienda_a_la_mano.service;

import java.util.List;
import java.util.Optional;

import com.unab.tienda_a_la_mano.entity.DireccionEntregaEntity;


public interface IDireccionEntregaService {
	
	
	//Listar todos
	public List<DireccionEntregaEntity> all();
	
	//Listar por ID
	public Optional<DireccionEntregaEntity> findById(Long id);
	
	//Guardar-actualizar
	public DireccionEntregaEntity save(DireccionEntregaEntity direccionEntregaEntity);	

	//Eliminar por ID
	public void deleteById(Long id);
}
