package com.unab.tienda_a_la_mano.service;

import java.util.List;
import java.util.Optional;

import com.unab.tienda_a_la_mano.entity.CuponEntity;


public interface ICuponService {
	
	
	//Listar todos
	public List<CuponEntity> all();
	
	//Listar por ID
	public Optional<CuponEntity> findById(Long id);
	
	//Guardar-actualizar
	public CuponEntity save(CuponEntity cuponEntity);	

	//Eliminar por ID
	public void deleteById(Long id);
}
