package com.unab.tienda_a_la_mano.service;

import java.util.List;
import java.util.Optional;


import com.unab.tienda_a_la_mano.entity.TiendaEntity;


public interface ITiendaService {
	
	//Listar todos
	public List<TiendaEntity> all();
	
	//Listar por ID
	public Optional<TiendaEntity> findById(Long id);
	
	//Guardar-actualizar
	public TiendaEntity save(TiendaEntity tiendaEntity);	

	//Eliminar por ID
	public void deleteById(Long id);
}
