package com.unab.tienda_a_la_mano.serviceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.tienda_a_la_mano.entity.PqrsdEntity;
import com.unab.tienda_a_la_mano.repository.IPqrsdRepository;
import com.unab.tienda_a_la_mano.service.IPqrsdService;

@Service
public class PqrsdService implements IPqrsdService{
	
	@Autowired
	private IPqrsdRepository repository;

	@Override
	public List<PqrsdEntity> all() {
		return this.repository.findAll();
	}

	@Override
	public Optional<PqrsdEntity> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public PqrsdEntity save(PqrsdEntity pqrsdEntity) {
		return this.repository.save(pqrsdEntity);
	}

	@Override
	public void deleteById(Long id) {
		this.repository.deleteById(id);
		
	}

}
