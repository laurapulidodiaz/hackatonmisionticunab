package com.unab.tienda_a_la_mano.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unab.tienda_a_la_mano.entity.ComentarioEntity;


public interface IComentarioRepository extends JpaRepository<ComentarioEntity, Long>{

}
