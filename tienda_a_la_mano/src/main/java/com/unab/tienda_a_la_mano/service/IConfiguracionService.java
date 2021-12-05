package com.unab.tienda_a_la_mano.service;

import java.util.List;
import java.util.Optional;

import com.unab.tienda_a_la_mano.entity.ConfiguracionEntity;


public interface IConfiguracionService {
	
	
	//Listar todos
	public List<ConfiguracionEntity> all();
	
	//Listar por ID
	public Optional<ConfiguracionEntity> findById(Long id);
	
	//Guardar-actualizar
	public ConfiguracionEntity save(ConfiguracionEntity configuracionEntity);	

	//Eliminar por ID
	public void deleteById(Long id);
}
