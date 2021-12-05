package com.ejemplo.tiendaalamano.repository;

import java.util.List;

import com.ejemplo.tiendaalamano.data.entities.CategoriaEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaEntity, Integer> {
    @Query("SELECT c FROM CategoriaEntity c")
    public List<CategoriaEntity> consultaAll();
    
    @Query("SELECT c FROM CategoriaEntity c WHERE c.idCategoria=:codigo")
    public CategoriaEntity consultaOne(Integer codigo);

    @Query("DELETE FROM CategoriaEntity c WHERE c.idCategoria=:codigo")
    public Void borrarOne(Integer codigo);

}
