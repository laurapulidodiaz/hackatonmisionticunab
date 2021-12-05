package com.ejemplo.tiendaalamano.controller;

import java.util.List;

import com.ejemplo.tiendaalamano.data.entities.AdministradorEntity;
import com.ejemplo.tiendaalamano.service.AdministradorServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/administrador")
public class AdministradorController {
    @Autowired
    private AdministradorServiceImpl admiServicio;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/todos", method = RequestMethod.GET)
    public List<AdministradorEntity> obtenerTodosAdministradores(){
        return admiServicio.todosLosAdministradores();
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/uno/{codigo}", method = RequestMethod.GET)
    public AdministradorEntity obtenerUnAdministrador(@PathVariable Integer codigo){
        return admiServicio.unAdministrador(codigo);
    }
    
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/nuevo", method = RequestMethod.POST, consumes = "application/json")
    public void nuevoAdministrador(@RequestBody AdministradorEntity miObjetito){
        admiServicio.crearAdministrador(miObjetito);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/borrar/{codigo}", method = RequestMethod.DELETE)
    public void eliminarUnAdministrador(@PathVariable Integer codigo){
        admiServicio.borrarAdministrador(codigo);
    }

    @ResponseStatus(code = HttpStatus.OK, reason = "Objeto administrador cambiado")
    @RequestMapping(value = "/actualizar", method = RequestMethod.PUT)
    public void actualizarAdministrador(@RequestBody AdministradorEntity miObjeto){
        admiServicio.actualizarAdministrador(miObjeto);
    }
}