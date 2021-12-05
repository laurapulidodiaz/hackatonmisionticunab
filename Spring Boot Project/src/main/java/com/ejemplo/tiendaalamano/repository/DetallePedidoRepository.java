
package com.ejemplo.tiendaalamano.repository;

import com.ejemplo.tiendaalamano.model.DetallePedido;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("detallePedidoRepository")
public interface DetallePedidoRepository extends JpaRepository<DetallePedido, Long> {
    @Transactional
    void deleteById(Long id);

}
