package com.ejemplo.tiendaalamano.service;

import java.util.List;

import com.ejemplo.tiendaalamano.model.Producto;

public interface ProductoService {
    
    //Métodos
    void deleteAllProducto();
    void deleteProductoById(Long id);
    void createProducto (Producto producto);
    Producto getProductoById(Long idProducto);

    List<Producto> getAllProductos();
}