package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.exception.BadResourceRequestException;
import com.ejemplo.tiendaalamano.exception.NoSuchResourceFoundException;
import com.ejemplo.tiendaalamano.model.Pedido;
import com.ejemplo.tiendaalamano.repository.PedidoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("pedidoService")
public class PedidoServiceImpl implements PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public void deleteAllPedidos() {
        pedidoRepository.deleteAllInBatch();
        
    }

    @Override
    public void deletePedidoById(Long id) {
        pedidoRepository.deleteById(id);
        
    }

    @Override
    public void createPedido(Pedido pedido) {
        Optional<Pedido> existingPedido = pedidoRepository.findById(pedido.getIdPedido());

        if (existingPedido.isPresent()) {
            throw new BadResourceRequestException("El pedido con este id ya existe. ");
        }

        pedidoRepository.save(pedido);
    }

    @Override
    public Pedido getPedidoById(Long id) {
        Optional<Pedido> pedido = pedidoRepository.findById(id);

        if (!pedido.isPresent()) {
            throw new NoSuchResourceFoundException("El pedido no ha sido encontrado .");
        }

        return pedido.get();
    }

    @Override
    public List<Pedido> getAllPedidos() {
        return pedidoRepository.findAll();
    }
    
}
