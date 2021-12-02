package com.ejemplo.tiendaalamano.repository;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejemplo.tiendaalamano.model.Model;

@Repository("modelRepository")
public interface ModelRepository extends JpaRepository<Model, Long> {
    @Transactional
    void deleteById(Long id);
}
