package com.unab.tienda_a_la_mano.serviceImplement;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.tienda_a_la_mano.entity.TiendaEntity;
import com.unab.tienda_a_la_mano.repository.ITiendaRepository;
import com.unab.tienda_a_la_mano.service.ITiendaService;

@Service
public class TiendaService implements ITiendaService{
	
	@Autowired
	private ITiendaRepository repository;

	@Override
	public List<TiendaEntity> all() {
		return this.repository.findAll();
	}
	
	@Override
	public Optional<TiendaEntity> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public TiendaEntity save(TiendaEntity tiendaEntity) {
		return this.repository.save(tiendaEntity);
	}

	@Override
	public void deleteById(Long id) {
		this.repository.deleteById(id);
		
	}
}
