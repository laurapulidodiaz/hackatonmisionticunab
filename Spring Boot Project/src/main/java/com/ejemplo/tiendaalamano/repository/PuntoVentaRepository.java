package com.ejemplo.tiendaalamano.repository;

import java.util.List;
import com.ejemplo.tiendaalamano.data.entities.PuntoVentaEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PuntoVentaRepository extends JpaRepository<PuntoVentaEntity, Integer> {
    @Query("SELECT c FROM PuntoVentaEntity c")
    public List<PuntoVentaEntity> consultaAll();
    
    @Query("SELECT c FROM PuntoVentaEntity c WHERE c.id_PuntoDeVenta=:codigo")
    public PuntoVentaEntity consultaOne(Integer codigo);

    @Query("DELETE FROM PuntoVentaEntity c WHERE c.id_PuntoDeVenta=:codigo")
    public Void borrarOne(Integer codigo);

    @Query("SELECT c FROM PuntoVentaEntity c WHERE c.ubicacion=:ciudad")
    public PuntoVentaEntity ubicacionCiudad(String ciudad);
}
