package com.unab.tienda_a_la_mano.serviceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.tienda_a_la_mano.entity.PagoPedidoEntity;
import com.unab.tienda_a_la_mano.repository.IPagoPedidoRepository;
import com.unab.tienda_a_la_mano.service.IPagoPedidoService;

@Service
public class PagoPedidoService implements IPagoPedidoService{
	
	@Autowired
	private IPagoPedidoRepository repository;

	@Override
	public List<PagoPedidoEntity> all() {
		return this.repository.findAll();
	}

	@Override
	public Optional<PagoPedidoEntity> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public PagoPedidoEntity save(PagoPedidoEntity pagoPedidoEntity) {
		return this.repository.save(pagoPedidoEntity);
	}

	@Override
	public void deleteById(Long id) {
		this.repository.deleteById(id);
		
	}

}
