package com.ejemplo.tiendaalamano.controller;

import java.util.List;

import com.ejemplo.tiendaalamano.model.Pedido;
import com.ejemplo.tiendaalamano.service.PedidoService;

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
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @RequestMapping(value = "/pedido", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewPedido(@RequestBody @Validated Pedido pedido) {
        pedidoService.createPedido(pedido);
    }

    @RequestMapping(value = "/pedido/erase", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteAllPedidos() {
        pedidoService.deleteAllPedidos();
    }

    @RequestMapping(value = "/pedido/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deletePedidoById(@PathVariable Long id) {
        pedidoService.deletePedidoById(id);
    }

    @RequestMapping(value = "/pedido", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Pedido> getAllPedidos() {
        return pedidoService.getAllPedidos();
    }

    @RequestMapping(value = "/pedido/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Pedido getPedidoById(@PathVariable("id") Long id) {
        return pedidoService.getPedidoById(id);
    }
}
