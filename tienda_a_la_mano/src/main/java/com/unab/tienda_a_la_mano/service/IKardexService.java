package com.unab.tienda_a_la_mano.service;

import java.util.List;
import java.util.Optional;

import com.unab.tienda_a_la_mano.entity.KardexEntity;


public interface IKardexService {
	
	
	//Listar todos
	public List<KardexEntity> all();
	
	//Listar por ID
	public Optional<KardexEntity> findById(Long id);
	
	//Guardar-actualizar
	public KardexEntity save(KardexEntity kardexEntity);	

	//Eliminar por ID
	public void deleteById(Long id);
}
