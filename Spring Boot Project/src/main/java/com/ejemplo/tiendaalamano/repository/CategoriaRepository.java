package com.ejemplo.tiendaalamano.repository;

import java.util.List;

import com.ejemplo.tiendaalamano.data.entities.CategoriaEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaEntity, Integer> {
    @Query("SELECT c FROM CategoriaEntity c")
    public List<CategoriaEntity> consultaAll();
    
    @Query("SELECT c FROM CategoriaEntity c WHERE c.id_categoria=:codigo")
    public CategoriaEntity consultaOne(Integer codigo);

    @Query("DELETE FROM CategoriaEntity c WHERE c.id_categoria=:codigo")
    public Void borrarOne(Integer codigo);


    
}
