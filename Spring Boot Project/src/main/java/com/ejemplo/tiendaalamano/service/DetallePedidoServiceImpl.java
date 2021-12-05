
package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.exception.BadResourceRequestException;
import com.ejemplo.tiendaalamano.exception.NoSuchResourceFoundException;
import com.ejemplo.tiendaalamano.model.DetallePedido;
import com.ejemplo.tiendaalamano.repository.DetallePedidoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service("detallePedidoService")
public class DetallePedidoServiceImpl implements DetallePedidoService {
    @Autowired
     private DetallePedidoRepository detallePedidoRepository;
    
    @Override
    public void deleteAllDetallePedidos() {
        detallePedidoRepository.deleteAllInBatch();
    }

    @Override
    public void deleteDetallePedidoById(Long id) {
        detallePedidoRepository.deleteById(id);
    }

    @Override
    public void createDetallePedido(DetallePedido detallePedido) {
        /*Optional<DetallePedido> existingDetallePedido = detallePedidoRepository.findById(detallePedido.getIdDetallePedido());

        if (!existingDetallePedido.isPresent()) {
            throw new BadResourceRequestException("El detalle pedido con este id ya existe. ");
        }*/

        detallePedidoRepository.save(detallePedido);
    }

    @Override
    public DetallePedido getDetallePedidoById(Long id) {
        Optional<DetallePedido> detallePedido = detallePedidoRepository.findById(id);

        if (!detallePedido.isPresent()) {
            throw new NoSuchResourceFoundException("El detalle pedido no ha sido encontrado .");
        }

        return detallePedido.get();
    }

    @Override
    public List<DetallePedido> getAllDetallePedidos() {
        return detallePedidoRepository.findAll();
    }}


