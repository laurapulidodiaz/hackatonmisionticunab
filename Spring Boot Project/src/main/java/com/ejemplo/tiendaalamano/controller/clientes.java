package com.ejemplo.tiendaalamano.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/clientes")
@RestController
public class clientes {

    @GetMapping
        public String mensaje(){
        return "Clientes Response";
        }

}
