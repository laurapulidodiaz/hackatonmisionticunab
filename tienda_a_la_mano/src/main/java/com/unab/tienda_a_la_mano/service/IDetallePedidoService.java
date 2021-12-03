package com.unab.tienda_a_la_mano.service;

import java.util.List;
import java.util.Optional;

import com.unab.tienda_a_la_mano.entity.DetallePedidoEntity;


public interface IDetallePedidoService {
	
	//Listar todos
	public List<DetallePedidoEntity> all();
	
	//Listar por ID
	public Optional<DetallePedidoEntity> findById(Long id);
	
	//Guardar-actualizar
	public DetallePedidoEntity save(DetallePedidoEntity detallePedidoEntity);	

	//Eliminar por ID
	public void deleteById(Long id);
	
}
