package com.unab.tienda_a_la_mano.serviceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.tienda_a_la_mano.entity.PromocionEntity;
import com.unab.tienda_a_la_mano.repository.IPromocionRepository;
import com.unab.tienda_a_la_mano.service.IPromocionService;

@Service
public class PromocionService implements IPromocionService{
	
	@Autowired
	private IPromocionRepository repository;

	@Override
	public List<PromocionEntity> all() {
		return this.repository.findAll();
	}

	@Override
	public Optional<PromocionEntity> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public PromocionEntity save(PromocionEntity promocionEntity) {
		return this.repository.save(promocionEntity);
	}

	@Override
	public void deleteById(Long id) {
		this.repository.deleteById(id);
		
	}

}
