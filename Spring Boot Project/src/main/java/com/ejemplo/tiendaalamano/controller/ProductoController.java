package com.ejemplo.tiendaalamano.controller;

import java.util.List;

import com.ejemplo.tiendaalamano.model.Producto;
import com.ejemplo.tiendaalamano.service.ProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductoController {

    
    @Autowired 
    private ProductoService productoService;

    @RequestMapping(value = "/producto", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewProducto(@RequestBody @Validated Producto producto) {
        productoService.createProducto(producto);
    }

    @RequestMapping(value = "/producto/erase", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteAllProducto() {
        productoService.deleteAllProducto();
    }

    @RequestMapping(value = "/producto/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteProductoById(@PathVariable Long id) {
        productoService.deleteProductoById(id);
    }

    @RequestMapping(value = "/producto", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Producto> getAllProductos() {
        return productoService.getAllProductos();
    }

    @RequestMapping(value = "/producto/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Producto getProductoById(@PathVariable("id") Long idProducto) {
        return productoService.getProductoById(idProducto);

    }
}