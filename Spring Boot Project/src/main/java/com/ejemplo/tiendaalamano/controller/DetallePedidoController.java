/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.DetallePedido;
import com.ejemplo.tiendaalamano.service.DetallePedidoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DetallePedidoController {
    @Autowired
    private DetallePedidoService detallePedidoService;

    @RequestMapping(value = "/detallePedido", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewDetallePedido(@RequestBody @Validated DetallePedido detallePedido) {
        detallePedidoService.createDetallePedido(detallePedido);
    }

    @RequestMapping(value = "/erase/detallePedido", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteAllDetallePedidos() {
        detallePedidoService.deleteAllDetallePedidos();
    }

    @RequestMapping(value = "/detallePedido/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteDetallePedidoById(@PathVariable Long id) {
        detallePedidoService.deleteDetallePedidoById(id);
    }

    @RequestMapping(value = "/detallePedido", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<DetallePedido> getAllDetallePedidos() {
        return detallePedidoService.getAllDetallePedidos();
    }

    @RequestMapping(value = "/detallePedido/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public DetallePedido getDetallePedidoById(@PathVariable("id") Long id) {
        return detallePedidoService.getDetallePedidoById(id);
    }
}
