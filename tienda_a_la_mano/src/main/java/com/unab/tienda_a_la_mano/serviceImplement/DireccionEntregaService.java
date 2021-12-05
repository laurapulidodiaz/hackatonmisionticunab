package com.unab.tienda_a_la_mano.serviceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.tienda_a_la_mano.entity.DireccionEntregaEntity;
import com.unab.tienda_a_la_mano.repository.IDireccionEntregaRepository;
import com.unab.tienda_a_la_mano.service.IDireccionEntregaService;

@Service
public class DireccionEntregaService implements IDireccionEntregaService{
	
	@Autowired
	private IDireccionEntregaRepository repository;

	@Override
	public List<DireccionEntregaEntity> all() {
		return this.repository.findAll();
	}

	@Override
	public Optional<DireccionEntregaEntity> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public DireccionEntregaEntity save(DireccionEntregaEntity direccionEntregaEntity) {
		return this.repository.save(direccionEntregaEntity);
	}

	@Override
	public void deleteById(Long id) {
		this.repository.deleteById(id);
		
	}

}
