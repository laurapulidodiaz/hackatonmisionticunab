package com.ejemplo.tiendaalamano.service;

import java.util.List;

import com.ejemplo.tiendaalamano.model.Pedido;

public interface PedidoService {
    void deleteAllPedidos();
    void deletePedidoById(Long id);

    void createPedido(Pedido pedido);

    Pedido getPedidoById(Long id);

    List<Pedido> getAllPedidos();
}
