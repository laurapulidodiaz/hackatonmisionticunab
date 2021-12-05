package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.data.entities.PuntoVentaEntity;
import com.ejemplo.tiendaalamano.repository.PuntoVentaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service("PuntoVentaService")
public class PuntoVentaImpl {
    @Autowired
    private PuntoVentaRepository puntoVentaRepo;

    public List<PuntoVentaEntity> todosLosPuntosVenta(){
        return puntoVentaRepo.consultaAll();
    }

    public PuntoVentaEntity unPuntoVenta(Integer codigo){
        return puntoVentaRepo.consultaOne(codigo);
    }

    public void crearPuntoVenta(PuntoVentaEntity miObjeto){
        puntoVentaRepo.save(miObjeto);
    }

    public void borrarPuntoVenta(Integer codigo){
        puntoVentaRepo.deleteById(codigo);
    }

    public void actualizarPuntoVenta(PuntoVentaEntity miObjeto){
        Optional<PuntoVentaEntity> objetoVerificado = puntoVentaRepo.findById(miObjeto.getId_PuntoDeVenta());
        if(objetoVerificado.isPresent()){
            puntoVentaRepo.save(miObjeto);
        }else{
            throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Objeto punto de venta no encontrado");
        }
    }
}
