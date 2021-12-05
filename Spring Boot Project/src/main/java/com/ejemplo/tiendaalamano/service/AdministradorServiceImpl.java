package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.data.entities.AdministradorEntity;
import com.ejemplo.tiendaalamano.repository.AdministradorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service("AdministradorService")
public class AdministradorServiceImpl {
    @Autowired
    private AdministradorRepository admiRepo;

    public List<AdministradorEntity> todosLosAdministradores(){
        return admiRepo.consultaAll();
    }

    public AdministradorEntity unAdministrador(Integer codigo){
        return admiRepo.consultaOne(codigo);
    }

    public void crearAdministrador(AdministradorEntity miObjeto){
        admiRepo.save(miObjeto);
    }

    public void borrarAdministrador(Integer codigo){
        admiRepo.deleteById(codigo);
    }

    public void actualizarAdministrador(AdministradorEntity miObjeto){
        Optional<AdministradorEntity> objetoVerificado = admiRepo.findById(miObjeto.getId_administrador());
        if(objetoVerificado.isPresent()){
            admiRepo.save(miObjeto);
        }else{
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Administrador no encontrado");
        }
    }

}