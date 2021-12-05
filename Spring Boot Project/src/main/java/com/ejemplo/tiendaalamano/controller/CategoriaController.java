package com.ejemplo.tiendaalamano.controller;

import java.util.List;

import com.ejemplo.tiendaalamano.data.entities.CategoriaEntity;
import com.ejemplo.tiendaalamano.service.CategoriaServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaServiceImpl categoServicio;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/todas", method = RequestMethod.GET)
    public List<CategoriaEntity> obtenerTodasCate(){
        return categoServicio.todasLasCategorias();
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/una/{codigo}", method = RequestMethod.GET)
    public CategoriaEntity obtenerUnaCate(@PathVariable Integer codigo){
        return categoServicio.unaCategoria(codigo);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/nuevo", method = RequestMethod.POST, consumes = "application/json")
    public void nuevaCate(@RequestBody CategoriaEntity miObjetito){
        categoServicio.crearCategoria(miObjetito);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/borrar/{codigo}", method = RequestMethod.DELETE)
    public void eliminarUnaCate(@PathVariable Integer codigo){
        categoServicio.borrarCategoria(codigo);
    }

    @ResponseStatus(code = HttpStatus.OK, reason = "Objeto categoria cambiado")
    @RequestMapping(value = "/actualizar", method = RequestMethod.PUT)
    public void actualizarCate(@RequestBody CategoriaEntity miObjeto){
        categoServicio.actualizarCategoria(miObjeto);
    }
}
