package com.unab.tienda_a_la_mano.serviceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.tienda_a_la_mano.entity.DetallePedidoEntity;
import com.unab.tienda_a_la_mano.repository.IDetallePedidoRepository;
import com.unab.tienda_a_la_mano.service.IDetallePedidoService;

@Service
public class DetallePedidoService implements IDetallePedidoService{
	
	@Autowired
	private IDetallePedidoRepository repository;

	@Override
	public List<DetallePedidoEntity> all() {
		return this.repository.findAll();
	}

	@Override
	public Optional<DetallePedidoEntity> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public DetallePedidoEntity save(DetallePedidoEntity detallePedidoEntity) {
		return this.repository.save(detallePedidoEntity);
	}

	@Override
	public void deleteById(Long id) {
		this.repository.deleteById(id);
		
	}

}
