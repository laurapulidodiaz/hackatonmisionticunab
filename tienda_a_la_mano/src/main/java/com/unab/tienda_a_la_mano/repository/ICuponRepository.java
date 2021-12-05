package com.unab.tienda_a_la_mano.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.unab.tienda_a_la_mano.entity.CuponEntity;

public interface ICuponRepository extends JpaRepository<CuponEntity, Long>{

}
