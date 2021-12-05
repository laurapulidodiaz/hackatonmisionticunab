package com.ejemplo.tiendaalamano.controller;

import java.util.List;

import com.ejemplo.tiendaalamano.data.entities.ProductoEntity;
import com.ejemplo.tiendaalamano.service.ProductoServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {
    @Autowired
    private ProductoServiceImpl productoServicio;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/todas", method = RequestMethod.GET)
    public List<ProductoEntity> obtenerTodosProductos(){
        return productoServicio.todosLosProductos();
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/una/{codigo}", method = RequestMethod.GET)
    public ProductoEntity obtenerUnProducto(@PathVariable Integer codigo){
        return productoServicio.unProducto(codigo);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/estcate/{codigo}", method = RequestMethod.GET)
    public ProductoEntity EstadoCategoria(@PathVariable Integer codigo){
        return productoServicio.estadoCate(codigo);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/nuevo", method = RequestMethod.POST, consumes = "application/json")
    public void nuevoProducto(@RequestBody ProductoEntity miObjetito){
        productoServicio.crearProducto(miObjetito);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/borrar/{codigo}", method = RequestMethod.DELETE)
    public void eliminarUnProducto(@PathVariable Integer codigo){
        productoServicio.borrarProducto(codigo);
    }

    @ResponseStatus(code = HttpStatus.OK, reason = "Objeto producto cambiado")
    @RequestMapping(value = "/actualizar", method = RequestMethod.PUT)
    public void actualizarProducto(@RequestBody ProductoEntity miObjeto){
        productoServicio.actualizarProducto(miObjeto);
    }
}