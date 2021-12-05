package com.unab.tienda_a_la_mano.service;

import java.util.List;
import java.util.Optional;


import com.unab.tienda_a_la_mano.entity.CategoriaEntity;


public interface ICategoriaService {
	
	//Listar todos
	public List<CategoriaEntity> all();
	
	public List<CategoriaEntity> allActivos();
	
	//Listar por ID
	public Optional<CategoriaEntity> findById(Long id);
	
	//Guardar-actualizar
	public CategoriaEntity save(CategoriaEntity categoriaEntity);	

	//Eliminar por ID
	public void deleteById(Long id);
}
