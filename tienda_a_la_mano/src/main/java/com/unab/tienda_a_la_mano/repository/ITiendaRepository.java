package com.unab.tienda_a_la_mano.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unab.tienda_a_la_mano.entity.TiendaEntity;

public interface ITiendaRepository extends JpaRepository<TiendaEntity, Long>{
}
