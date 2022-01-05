
package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.DetallePedido;
import java.util.List;


public interface DetallePedidoService {
    void deleteAllDetallePedidos();
    void deleteDetallePedidoById(Long id);

    void createDetallePedido(DetallePedido detallePedido);

    DetallePedido getDetallePedidoById(Long id);

    List<DetallePedido> getAllDetallePedidos();
    
}
