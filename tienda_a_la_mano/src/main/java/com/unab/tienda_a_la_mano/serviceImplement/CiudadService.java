package com.unab.tienda_a_la_mano.serviceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.tienda_a_la_mano.entity.CiudadEntity;
import com.unab.tienda_a_la_mano.repository.ICiudadRepository;
import com.unab.tienda_a_la_mano.service.ICiudadService;

@Service
public class CiudadService implements ICiudadService{
	
	@Autowired
	private ICiudadRepository repository;

	@Override
	public List<CiudadEntity> all() {
		return this.repository.findAll();
	}

	@Override
	public Optional<CiudadEntity> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public CiudadEntity save(CiudadEntity ciudadEntity) {
		return this.repository.save(ciudadEntity);
	}

	@Override
	public void deleteById(Long id) {
		this.repository.deleteById(id);
		
	}

}
