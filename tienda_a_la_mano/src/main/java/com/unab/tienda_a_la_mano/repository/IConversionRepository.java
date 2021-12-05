package com.unab.tienda_a_la_mano.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unab.tienda_a_la_mano.entity.ConversionEntity;

public interface IConversionRepository extends JpaRepository<ConversionEntity, Long>{

}
