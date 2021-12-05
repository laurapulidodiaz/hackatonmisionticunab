package com.ejemplo.tiendaalamano.repository;

import javax.transaction.Transactional;

import com.ejemplo.tiendaalamano.model.Pedido;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("pedidoRepository")
public interface PedidoRepository extends JpaRepository<Pedido,Long>{
    @Transactional
    void deleteById(Long id);
}

