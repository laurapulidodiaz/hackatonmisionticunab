package com.unab.tienda_a_la_mano.serviceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.tienda_a_la_mano.entity.KardexEntity;
import com.unab.tienda_a_la_mano.repository.IKardexRepository;
import com.unab.tienda_a_la_mano.service.IKardexService;

@Service
public class KardexService implements IKardexService{
	
	@Autowired
	private IKardexRepository repository;

	@Override
	public List<KardexEntity> all() {
		return this.repository.findAll();
	}

	@Override
	public Optional<KardexEntity> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public KardexEntity save(KardexEntity kardexEntity) {
		return this.repository.save(kardexEntity);
	}

	@Override
	public void deleteById(Long id) {
		this.repository.deleteById(id);
		
	}

}
