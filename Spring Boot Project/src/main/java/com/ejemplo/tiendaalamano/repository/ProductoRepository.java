package com.ejemplo.tiendaalamano.repository;

import javax.transaction.Transactional;

import com.ejemplo.tiendaalamano.model.Producto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("productoRepository")
public interface ProductoRepository extends JpaRepository<Producto, Long>{
    @Transactional
    void deleteById(Long id);
}
