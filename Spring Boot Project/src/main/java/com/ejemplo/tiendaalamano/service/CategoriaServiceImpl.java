package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.data.entities.CategoriaEntity;
import com.ejemplo.tiendaalamano.repository.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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

    public void actualizarCategoria(CategoriaEntity miObjeto){
        Optional<CategoriaEntity> objetoVerificado = categoRepo.findById(miObjeto.getid_categoria());
        if(objetoVerificado.isPresent()){
            categoRepo.save(miObjeto);
        }else{
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Objeto categoria no encontrado");
        }
    }

}
