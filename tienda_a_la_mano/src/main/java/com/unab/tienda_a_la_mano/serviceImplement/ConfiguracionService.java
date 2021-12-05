package com.unab.tienda_a_la_mano.serviceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.tienda_a_la_mano.entity.ConfiguracionEntity;
import com.unab.tienda_a_la_mano.repository.IConfiguracionRepository;
import com.unab.tienda_a_la_mano.service.IConfiguracionService;

@Service
public class ConfiguracionService implements IConfiguracionService{
	
	@Autowired
	private IConfiguracionRepository repository;

	@Override
	public List<ConfiguracionEntity> all() {
		return this.repository.findAll();
	}

	@Override
	public Optional<ConfiguracionEntity> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public ConfiguracionEntity save(ConfiguracionEntity configuracionEntity) {
		return this.repository.save(configuracionEntity);
	}

	@Override
	public void deleteById(Long id) {
		this.repository.deleteById(id);
		
	}

}
