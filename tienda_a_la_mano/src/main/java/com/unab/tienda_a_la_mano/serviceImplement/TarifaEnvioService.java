package com.unab.tienda_a_la_mano.serviceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.tienda_a_la_mano.entity.TarifaEnvioEntity;
import com.unab.tienda_a_la_mano.repository.ITarifaEnvioRepository;
import com.unab.tienda_a_la_mano.service.ITarifaEnvioService;

@Service
public class TarifaEnvioService implements ITarifaEnvioService{
	
	@Autowired
	private ITarifaEnvioRepository repository;

	@Override
	public List<TarifaEnvioEntity> all() {
		return this.repository.findAll();
	}

	@Override
	public Optional<TarifaEnvioEntity> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public TarifaEnvioEntity save(TarifaEnvioEntity tarifaEnvioEntity) {
		return this.repository.save(tarifaEnvioEntity);
	}

	@Override
	public void deleteById(Long id) {
		this.repository.deleteById(id);
		
	}

}
