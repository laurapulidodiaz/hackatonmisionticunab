package com.unab.tienda_a_la_mano.service;

import java.util.List;
import java.util.Optional;

import com.unab.tienda_a_la_mano.entity.RangoEntregaEntity;


public interface IRangoEntregaService {
	
	//Listar todos
	public List<RangoEntregaEntity> all();
	
	//Listar por ID
	public Optional<RangoEntregaEntity> findById(Long id);
	
	//Guardar-actualizar
	public RangoEntregaEntity save(RangoEntregaEntity rangoEntregaEntity);	

	//Eliminar por ID
	public void deleteById(Long id);
}
