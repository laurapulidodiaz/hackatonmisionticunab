package com.unab.tienda_a_la_mano.serviceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.tienda_a_la_mano.entity.MarcaEntity;
import com.unab.tienda_a_la_mano.repository.IMarcaRepository;
import com.unab.tienda_a_la_mano.service.IMarcaService;

@Service
public class MarcaService implements IMarcaService{
	
	@Autowired
	private IMarcaRepository repository;

	@Override
	public List<MarcaEntity> all() {
		return this.repository.findAll();
	}

	@Override
	public Optional<MarcaEntity> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public MarcaEntity save(MarcaEntity marcaEntity) {
		return this.repository.save(marcaEntity);
	}

	@Override
	public void deleteById(Long id) {
		this.repository.deleteById(id);
		
	}

}
