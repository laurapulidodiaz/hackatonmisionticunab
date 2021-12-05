package com.unab.tienda_a_la_mano.serviceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.tienda_a_la_mano.entity.ConversionEntity;
import com.unab.tienda_a_la_mano.repository.IConversionRepository;
import com.unab.tienda_a_la_mano.service.IConversionService;

@Service
public class ConversionService implements IConversionService{
	
	@Autowired
	private IConversionRepository repository;

	@Override
	public List<ConversionEntity> all() {
		return this.repository.findAll();
	}

	@Override
	public Optional<ConversionEntity> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public ConversionEntity save(ConversionEntity conversionEntity) {
		return this.repository.save(conversionEntity);
	}

	@Override
	public void deleteById(Long id) {
		this.repository.deleteById(id);
		
	}

}
