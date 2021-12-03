package com.unab.tienda_a_la_mano.service;

import java.util.List;
import java.util.Optional;

import com.unab.tienda_a_la_mano.entity.ProductoEntity;


public interface IProductoService {
	
	
	//Listar todos
	public List<ProductoEntity> all();
	
	//Listar por ID
	public Optional<ProductoEntity> findById(Long id);
	
	//Guardar-actualizar
	public ProductoEntity save(ProductoEntity productoEntity);	

	//Eliminar por ID
	public void deleteById(Long id);
}
