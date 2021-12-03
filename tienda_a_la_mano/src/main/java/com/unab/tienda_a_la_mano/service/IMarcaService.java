package com.unab.tienda_a_la_mano.service;

import java.util.List;
import java.util.Optional;

import com.unab.tienda_a_la_mano.entity.MarcaEntity;


public interface IMarcaService {
	
	//Listar todos
	public List<MarcaEntity> all();
	
	//Listar por ID
	public Optional<MarcaEntity> findById(Long id);
	
	//Guardar-actualizar
	public MarcaEntity save(MarcaEntity marcaEntity);	

	//Eliminar por ID
	public void deleteById(Long id);
	
}
