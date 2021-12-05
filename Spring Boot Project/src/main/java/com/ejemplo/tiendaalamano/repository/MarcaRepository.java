package com.ejemplo.tiendaalamano.repository;

import java.util.List;
import com.ejemplo.tiendaalamano.data.entities.MarcaEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepository extends JpaRepository<MarcaEntity, Integer>{
    @Query("SELECT c FROM MarcaEntity c")
    public List<MarcaEntity> consultaAll();
    //public List<MarcaEntity> consultaAll();
    
    @Query("SELECT c FROM MarcaEntity c WHERE c.id_marca=:codigo")
    public MarcaEntity consultaOne(Integer codigo);

    @Query("DELETE FROM MarcaEntity c WHERE c.id_marca=:codigo")
    public Void borrarOne(Integer codigo);
}
