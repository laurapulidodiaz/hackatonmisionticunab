package com.unab.tienda_a_la_mano.serviceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.tienda_a_la_mano.entity.MedioPagoEntity;
import com.unab.tienda_a_la_mano.repository.IMedioPagoRepository;
import com.unab.tienda_a_la_mano.service.IMedioPagoService;

@Service
public class MedioPagoService implements IMedioPagoService{
	
	@Autowired
	private IMedioPagoRepository repository;

	@Override
	public List<MedioPagoEntity> all() {
		return this.repository.findAll();
	}

	@Override
	public Optional<MedioPagoEntity> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public MedioPagoEntity save(MedioPagoEntity medioPagoEntity) {
		return this.repository.save(medioPagoEntity);
	}

	@Override
	public void deleteById(Long id) {
		this.repository.deleteById(id);
		
	}

}
