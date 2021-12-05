package com.unab.tienda_a_la_mano.service;

import java.util.List;
import java.util.Optional;

import com.unab.tienda_a_la_mano.entity.CambioPedidoEntity;


public interface ICambioPedidoService {
	
	
	//Listar todos
	public List<CambioPedidoEntity> all();
	
	//Listar por ID
	public Optional<CambioPedidoEntity> findById(Long id);
	
	//Guardar-actualizar
	public CambioPedidoEntity save(CambioPedidoEntity cambioPedidoEntity);	

	//Eliminar por ID
	public void deleteById(Long id);
}
