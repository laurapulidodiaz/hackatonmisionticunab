package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.Producto;
import com.ejemplo.tiendaalamano.repository.ProductoRepository;
import com.ejemplo.tiendaalamano.exception.BadResourceRequestException;
import com.ejemplo.tiendaalamano.exception.NoSuchResourceFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("productoService")
public class ProductoServiceImpl implements ProductoService{

    @Autowired 
    private ProductoRepository productoRepository;

    @Override
    public void deleteAllProducto() {
        productoRepository.deleteAllInBatch();
        
    }

    @Override
    public void deleteProductoById(Long id) {
        productoRepository.deleteById(id);
        
    }

    @Override
    public void createProducto(Producto producto) {
        /* Optional<Producto> existingProducto = productoRepository.findById(producto.getIdProducto());
        
        if (!existingProducto.isPresent()) {
            throw new BadResourceRequestException("Hay un Producto con el mismo nombre.");
        } */

        productoRepository.save(producto);
    }

    @Override
    public Producto getProductoById(Long idProducto) {
        Optional<Producto> producto = productoRepository.findById(idProducto);

        if (!producto.isPresent()) {
            throw new NoSuchResourceFoundException("No se encontró el Producto.");
        }

        return producto.get();
        
    }

    @Override
    public List<Producto> getAllProductos() {
        
        return productoRepository.findAll();
    }


    
    
}
