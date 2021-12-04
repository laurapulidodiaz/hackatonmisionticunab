package com.ejemplo.tiendaalamano.repository;

import javax.transaction.Transactional;

import com.ejemplo.tiendaalamano.data.entities.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("modelRepository")
public interface ModelRepository extends JpaRepository<Model, Long> {
    @Transactional
    void deleteById(Long id);
}
