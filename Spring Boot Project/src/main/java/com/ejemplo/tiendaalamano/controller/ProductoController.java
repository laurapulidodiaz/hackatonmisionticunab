package com.ejemplo.tiendaalamano.controller;

import org.hibernate.engine.query.spi.ReturnMetadata;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {
    @GetMapping
    public String hola(){
        return "hola soy didier";
    }
}