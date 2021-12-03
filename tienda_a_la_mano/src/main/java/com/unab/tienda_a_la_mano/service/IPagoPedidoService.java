package com.unab.tienda_a_la_mano.service;

import java.util.List;
import java.util.Optional;

import com.unab.tienda_a_la_mano.entity.PagoPedidoEntity;


public interface IPagoPedidoService {
	
	//Listar todos
	public List<PagoPedidoEntity> all();
	
	//Listar por ID
	public Optional<PagoPedidoEntity> findById(Long id);
	
	//Guardar-actualizar
	public PagoPedidoEntity save(PagoPedidoEntity pagoPedidoEntity);	

	//Eliminar por ID
	public void deleteById(Long id);
}
