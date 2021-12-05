package com.unab.tienda_a_la_mano.serviceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.tienda_a_la_mano.entity.CategoriaEntity;
import com.unab.tienda_a_la_mano.repository.ICategoriaRepository;
import com.unab.tienda_a_la_mano.service.ICategoriaService;

@Service
public class CategoriaService implements ICategoriaService{
	
	@Autowired
	private ICategoriaRepository repository;

	@Override
	public List<CategoriaEntity> all() {
		return this.repository.findAll();
	}

	@Override
	public List<CategoriaEntity> allActivos() {
		return this.repository.allActivos();
	}
	
	@Override
	public Optional<CategoriaEntity> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public CategoriaEntity save(CategoriaEntity categoriaEntity) {
		return this.repository.save(categoriaEntity);
	}

	@Override
	public void deleteById(Long id) {
		this.repository.deleteById(id);
		
	}

}
