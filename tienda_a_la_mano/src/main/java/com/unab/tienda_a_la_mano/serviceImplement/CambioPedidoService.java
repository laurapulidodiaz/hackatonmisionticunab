package com.unab.tienda_a_la_mano.serviceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.tienda_a_la_mano.entity.CambioPedidoEntity;
import com.unab.tienda_a_la_mano.repository.ICambioPedidoRepository;
import com.unab.tienda_a_la_mano.service.ICambioPedidoService;

@Service
public class CambioPedidoService implements ICambioPedidoService{
	
	@Autowired
	private ICambioPedidoRepository repository;

	@Override
	public List<CambioPedidoEntity> all() {
		return this.repository.findAll();
	}

	@Override
	public Optional<CambioPedidoEntity> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public CambioPedidoEntity save(CambioPedidoEntity cambioPedidoEntity) {
		return this.repository.save(cambioPedidoEntity);
	}

	@Override
	public void deleteById(Long id) {
		this.repository.deleteById(id);
		
	}

}
