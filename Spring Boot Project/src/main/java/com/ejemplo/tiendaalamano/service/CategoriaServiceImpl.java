package com.ejemplo.tiendaalamano.service;

import java.util.List;

import com.ejemplo.tiendaalamano.data.entities.CategoriaEntity;
import com.ejemplo.tiendaalamano.repository.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CategoriaService")
public class CategoriaServiceImpl {
    @Autowired
    private CategoriaRepository categoRepo;

    public List<CategoriaEntity> todasLasCategorias(){
        return categoRepo.consultaAll();
    }

    public CategoriaEntity unaCategoria(Integer codigo){
        return categoRepo.consultaOne(codigo);
    }

    public void crearCategoria(CategoriaEntity miObjeto){
        categoRepo.save(miObjeto);
    }

    public void borrarCategoria(Integer codigo){
        categoRepo.deleteById(codigo);
    }

}
