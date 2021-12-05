package com.ejemplo.tiendaalamano.controller;

import java.util.List;

import com.ejemplo.tiendaalamano.data.entities.PuntoVentaEntity;
import com.ejemplo.tiendaalamano.service.PuntoVentaImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/puntoventa")
public class PuntoVentaController {
    @Autowired
    private PuntoVentaImpl puntoVentaServicio;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/todas", method = RequestMethod.GET)
    public List<PuntoVentaEntity> obtenerTodasPuntosVenta(){
        return puntoVentaServicio.todosLosPuntosVenta();
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/una/{codigo}", method = RequestMethod.GET)
    public PuntoVentaEntity obtenerUnPuntoVenta(@PathVariable Integer codigo){
        return puntoVentaServicio.unPuntoVenta(codigo);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/ubicacion/{ciudad}", method = RequestMethod.GET)
    public PuntoVentaEntity ubicacionPunto(@PathVariable String ciudad){
        return puntoVentaServicio.ubicacionPunto(ciudad);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/nuevo", method = RequestMethod.POST, consumes = "application/json")
    public void nuevoPuntoVenta(@RequestBody PuntoVentaEntity miObjetito){
        puntoVentaServicio.crearPuntoVenta(miObjetito);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/borrar/{codigo}", method = RequestMethod.DELETE)
    public void eliminarUnPuntoVenta(@PathVariable Integer codigo){
        puntoVentaServicio.borrarPuntoVenta(codigo);
    }

    @ResponseStatus(code = HttpStatus.OK, reason = "Objeto categoria cambiado")
    @RequestMapping(value = "/actualizar", method = RequestMethod.PUT)
    public void actualizarPuntoVenta(@RequestBody PuntoVentaEntity miObjeto){
        puntoVentaServicio.actualizarPuntoVenta(miObjeto);
    }   
}