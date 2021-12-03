package com.unab.tienda_a_la_mano.serviceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.tienda_a_la_mano.entity.RangoEntregaEntity;
import com.unab.tienda_a_la_mano.repository.IRangoEntregaRepository;
import com.unab.tienda_a_la_mano.service.IRangoEntregaService;

@Service
public class RangoEntregaService implements IRangoEntregaService{
	
	@Autowired
	private IRangoEntregaRepository repository;

	@Override
	public List<RangoEntregaEntity> all() {
		return this.repository.findAll();
	}

	@Override
	public Optional<RangoEntregaEntity> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public RangoEntregaEntity save(RangoEntregaEntity rangoEntregaEntity) {
		return this.repository.save(rangoEntregaEntity);
	}

	@Override
	public void deleteById(Long id) {
		this.repository.deleteById(id);
		
	}

}
