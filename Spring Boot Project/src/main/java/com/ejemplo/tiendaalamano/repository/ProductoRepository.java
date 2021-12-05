package com.ejemplo.tiendaalamano.repository;

import java.util.List;
import com.ejemplo.tiendaalamano.data.entities.ProductoEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<ProductoEntity, Integer>{
    
    @Query("SELECT c FROM ProductoEntity c")
    public List<ProductoEntity> consultaAll();
    
    @Query("SELECT c FROM ProductoEntity c WHERE c.id_producto=:codigo")
    public ProductoEntity consultaOne(Integer codigo);

    @Query("SELECT c FROM ProductoEntity c WHERE c.categoriaModel.id_categoria=:codigo")
    public ProductoEntity consultaEstadoCate(Integer codigo);

    @Query("DELETE FROM ProductoEntity c WHERE c.id_producto=:codigo")
    public Void borrarOne(Integer codigo);

    /*@Query("INSERT INTO c VALUES ProductoEntity c")
    public Void crear(Integer codigo);*/
}
