package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.data.entities.MarcaEntity;
import com.ejemplo.tiendaalamano.repository.MarcaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service("MarcaService")
public class MarcaServiceImpl {

    @Autowired
    private MarcaRepository marcaRepo;

    public List<MarcaEntity> todasLasMarcas(){
        return marcaRepo.consultaAll();
    }

    public MarcaEntity unaMarca(Integer codigo){
        return marcaRepo.consultaOne(codigo);
    }

    public void crearMarca(MarcaEntity miObjeto){
        marcaRepo.save(miObjeto);
    }

    public void borrarMarca(Integer codigo){
        marcaRepo.deleteById(codigo);
    }

    public void actualizarMarca(MarcaEntity miObjeto){
        Optional<MarcaEntity> objetoVerificado = marcaRepo.findById(miObjeto.getid_marca());
        if(objetoVerificado.isPresent()){
            marcaRepo.save(miObjeto);
        }else{
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Objeto marca no encontrado");
        }
    }
}
