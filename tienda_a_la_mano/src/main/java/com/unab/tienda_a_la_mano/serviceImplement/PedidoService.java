package com.unab.tienda_a_la_mano.serviceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.tienda_a_la_mano.entity.PedidoEntity;
import com.unab.tienda_a_la_mano.repository.IPedidoRepository;
import com.unab.tienda_a_la_mano.service.IPedidoService;

@Service
public class PedidoService implements IPedidoService{
	
	@Autowired
	private IPedidoRepository repository;

	@Override
	public List<PedidoEntity> all() {
		return this.repository.findAll();
	}

	@Override
	public Optional<PedidoEntity> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public PedidoEntity save(PedidoEntity pedidoEntity) {
		return this.repository.save(pedidoEntity);
	}

	@Override
	public void deleteById(Long id) {
		this.repository.deleteById(id);
		
	}

}
