package com.unab.tienda_a_la_mano.service;

import java.util.List;
import java.util.Optional;

import com.unab.tienda_a_la_mano.entity.MedioPagoEntity;


public interface IMedioPagoService {
	
	//Listar todos
	public List<MedioPagoEntity> all();
	
	//Listar por ID
	public Optional<MedioPagoEntity> findById(Long id);
	
	//Guardar-actualizar
	public MedioPagoEntity save(MedioPagoEntity medioPagoEntity);	

	//Eliminar por ID
	public void deleteById(Long id);
}
