package com.unab.tienda_a_la_mano.serviceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.tienda_a_la_mano.entity.RolEntity;
import com.unab.tienda_a_la_mano.repository.IRolRepository;
import com.unab.tienda_a_la_mano.service.IRolService;

@Service
public class RolService implements IRolService{
	
	@Autowired
	private IRolRepository repository;

	@Override
	public List<RolEntity> all() {
		return this.repository.findAll();
	}

	@Override
	public Optional<RolEntity> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public RolEntity save(RolEntity rolEntity) {
		return this.repository.save(rolEntity);
	}

	@Override
	public void deleteById(Long id) {
		this.repository.deleteById(id);
		
	}

}
