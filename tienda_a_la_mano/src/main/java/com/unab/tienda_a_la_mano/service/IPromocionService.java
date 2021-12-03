package com.unab.tienda_a_la_mano.service;

import java.util.List;
import java.util.Optional;

import com.unab.tienda_a_la_mano.entity.PromocionEntity;


public interface IPromocionService {
	
	
	//Listar todos
	public List<PromocionEntity> all();
	
	//Listar por ID
	public Optional<PromocionEntity> findById(Long id);
	
	//Guardar-actualizar
	public PromocionEntity save(PromocionEntity promocionEntity);	

	//Eliminar por ID
	public void deleteById(Long id);
}
