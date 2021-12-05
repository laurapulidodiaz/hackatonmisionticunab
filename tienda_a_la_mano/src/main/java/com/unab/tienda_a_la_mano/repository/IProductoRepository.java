package com.unab.tienda_a_la_mano.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.unab.tienda_a_la_mano.entity.ProductoEntity;

public interface IProductoRepository extends JpaRepository<ProductoEntity, Long>{
	
	@Query(value = "SELECT p FROM ProductoEntity p WHERE p.nombre LIKE %:filtro% OR p.marca.descripcion LIKE %:filtro%")
	List<ProductoEntity> allByNombreOMarca(@Param("filtro") String filtro);
	
	
	
	//@Query(value = "SELECT p FROM ProductoEntity p WHERE p.stock <=0")
	@Query(value = "SELECT * FROM productos p JOIN categorias c ON p.categoria_id = c.id JOIN kardex k ON k.producto_id = p.id WHERE k.stock<=0", nativeQuery = true)
	List<ProductoEntity> allSinStock();
	
	
	

}
