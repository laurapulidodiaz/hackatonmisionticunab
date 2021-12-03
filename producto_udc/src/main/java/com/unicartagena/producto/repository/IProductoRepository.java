package com.unicartagena.producto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unicartagena.producto.entity.ProductoEntity;

public interface IProductoRepository extends JpaRepository<ProductoEntity, Long>{
}
