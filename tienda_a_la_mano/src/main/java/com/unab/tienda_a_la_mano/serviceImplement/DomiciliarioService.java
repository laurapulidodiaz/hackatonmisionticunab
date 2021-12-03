package com.unab.tienda_a_la_mano.serviceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.tienda_a_la_mano.entity.DomiciliarioEntity;
import com.unab.tienda_a_la_mano.repository.IDomiciliarioRepository;
import com.unab.tienda_a_la_mano.service.IDomiciliarioService;

@Service
public class DomiciliarioService implements IDomiciliarioService{
	
	@Autowired
	private IDomiciliarioRepository repository;

	@Override
	public List<DomiciliarioEntity> all() {
		return this.repository.findAll();
	}

	@Override
	public Optional<DomiciliarioEntity> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public DomiciliarioEntity save(DomiciliarioEntity domiciliarioEntity) {
		return this.repository.save(domiciliarioEntity);
	}

	@Override
	public void deleteById(Long id) {
		this.repository.deleteById(id);
		
	}

}
