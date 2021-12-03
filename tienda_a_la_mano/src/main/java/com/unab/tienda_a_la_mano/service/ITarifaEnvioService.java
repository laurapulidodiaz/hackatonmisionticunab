package com.unab.tienda_a_la_mano.service;

import java.util.List;
import java.util.Optional;

import com.unab.tienda_a_la_mano.entity.TarifaEnvioEntity;


public interface ITarifaEnvioService {
	
	
	//Listar todos
	public List<TarifaEnvioEntity> all();
	
	//Listar por ID
	public Optional<TarifaEnvioEntity> findById(Long id);
	
	//Guardar-actualizar
	public TarifaEnvioEntity save(TarifaEnvioEntity tarifaEnvioEntity);	

	//Eliminar por ID
	public void deleteById(Long id);
}
