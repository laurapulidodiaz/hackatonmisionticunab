package com.unab.tienda_a_la_mano.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unab.tienda_a_la_mano.entity.CategoriaEntity;

public interface ICategoriaRepository extends JpaRepository<CategoriaEntity, Long>{

}
