package com.unab.tienda_a_la_mano.service;

import java.util.List;
import java.util.Optional;

import com.unab.tienda_a_la_mano.entity.ConversionEntity;


public interface IConversionService {
	
	
	//Listar todos
	public List<ConversionEntity> all();
	
	//Listar por ID
	public Optional<ConversionEntity> findById(Long id);
	
	//Guardar-actualizar
	public ConversionEntity save(ConversionEntity conversionEntity);	

	//Eliminar por ID
	public void deleteById(Long id);
}
