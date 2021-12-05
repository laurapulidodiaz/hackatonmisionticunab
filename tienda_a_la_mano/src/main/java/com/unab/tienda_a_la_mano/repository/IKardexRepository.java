package com.unab.tienda_a_la_mano.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.unab.tienda_a_la_mano.entity.KardexEntity;

public interface IKardexRepository extends JpaRepository<KardexEntity, Long>{
	
	@Query(value = "SELECT * FROM kardex k JOIN productos p ON k.producto_id = p.id JOIN tiendas t ON k.tienda_id = t.id WHERE k.stock>0 AND t.id=?1", nativeQuery = true)
	List<KardexEntity> allProductos(Long id);
}
