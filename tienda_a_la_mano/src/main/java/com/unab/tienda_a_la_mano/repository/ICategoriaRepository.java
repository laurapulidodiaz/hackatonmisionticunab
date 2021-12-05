package com.unab.tienda_a_la_mano.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.unab.tienda_a_la_mano.entity.CategoriaEntity;

public interface ICategoriaRepository extends JpaRepository<CategoriaEntity, Long>{

	//@Query(value ="SELECT * FROM categorias c JOIN productos p ON p.categoria_id = c.id WHERE p.stock>0", nativeQuery = true)
	@Query(value = "SELECT * FROM categorias c JOIN productos p ON p.categoria_id = c.id JOIN kardex k ON k.producto_id = p.id WHERE k.stock>0", nativeQuery = true)
	List<CategoriaEntity> allActivos();
}
