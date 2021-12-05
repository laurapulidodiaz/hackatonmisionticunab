package com.ejemplo.tiendaalamano.repository;

import java.util.List;

import com.ejemplo.tiendaalamano.data.entities.AdministradorEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministradorRepository extends JpaRepository<AdministradorEntity, Integer> {
    @Query("SELECT a FROM AdministradorEntity a")
    public List<AdministradorEntity> consultaAll();

    @Query("SELECT a FROM AdministradorEntity a WHERE a.id_administrador=:codigo")
    public AdministradorEntity consultaOne(Integer codigo);

    @Query("DELETE FROM AdministradorEntity a WHERE a.id_administrador=:codigo")
    public Void borradorOne(Integer codigo);

}