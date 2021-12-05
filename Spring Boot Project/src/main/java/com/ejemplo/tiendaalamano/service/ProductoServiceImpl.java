package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.data.entities.ProductoEntity;
import com.ejemplo.tiendaalamano.repository.ProductoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service("ProductoService")
public class ProductoServiceImpl {
    @Autowired
    private ProductoRepository productoRepo;

    public List<ProductoEntity> todosLosProductos(){
        return productoRepo.consultaAll();
    }

    public ProductoEntity unProducto(Integer codigo){
        return productoRepo.consultaOne(codigo);
    }

    public ProductoEntity estadoCate(Integer codigo){
        return productoRepo.consultaEstadoCate(codigo);
    }

    public void crearProducto(ProductoEntity miObjeto){
        productoRepo.save(miObjeto);
    }

    public void borrarProducto(Integer codigo){
        productoRepo.deleteById(codigo);
    }

    public void actualizarProducto(ProductoEntity miObjeto){
        Optional<ProductoEntity> objetoVerificado = productoRepo.findById(miObjeto.getId_producto());
        if(objetoVerificado.isPresent()){
            productoRepo.save(miObjeto);
        }else{
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Objeto Producto no encontrado");
        }
    }
}
