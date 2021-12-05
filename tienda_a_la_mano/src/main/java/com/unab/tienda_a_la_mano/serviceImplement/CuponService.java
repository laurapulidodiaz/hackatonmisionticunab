package com.unab.tienda_a_la_mano.serviceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.tienda_a_la_mano.entity.CuponEntity;
import com.unab.tienda_a_la_mano.repository.ICuponRepository;
import com.unab.tienda_a_la_mano.service.ICuponService;

@Service
public class CuponService implements ICuponService{
	
	@Autowired
	private ICuponRepository repository;

	@Override
	public List<CuponEntity> all() {
		return this.repository.findAll();
	}

	@Override
	public Optional<CuponEntity> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public CuponEntity save(CuponEntity cuponEntity) {
		return this.repository.save(cuponEntity);
	}

	@Override
	public void deleteById(Long id) {
		this.repository.deleteById(id);
		
	}

}
