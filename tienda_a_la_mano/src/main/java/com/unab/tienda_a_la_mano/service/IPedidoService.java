package com.unab.tienda_a_la_mano.service;

import java.util.List;
import java.util.Optional;

import com.unab.tienda_a_la_mano.entity.PedidoEntity;


public interface IPedidoService {
	
	//Listar todos
	public List<PedidoEntity> all();
	
	//Listar por ID
	public Optional<PedidoEntity> findById(Long id);
	
	//Guardar-actualizar
	public PedidoEntity save(PedidoEntity pedidoEntity);	

	//Eliminar por ID
	public void deleteById(Long id);
}
