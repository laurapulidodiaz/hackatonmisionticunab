package com.unicartagena.producto.service;

import java.util.List;
import java.util.Optional;

import com.unicartagena.producto.entity.ProductoEntity;

public interface IProductoService{

	//Listar todo
	public List<ProductoEntity> all();
	
	
	//Listar por ID
	public Optional<ProductoEntity> findById(Long id);
	
	//Guardar-Actualizar
	public ProductoEntity save(ProductoEntity productoEntity);
	
	//Eliminar por ID
	public void deleteById(Long id);
	
}