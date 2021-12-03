package com.unab.tienda_a_la_mano.serviceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.tienda_a_la_mano.entity.ComentarioEntity;
import com.unab.tienda_a_la_mano.repository.IComentarioRepository;
import com.unab.tienda_a_la_mano.service.IComentarioService;

@Service
public class ComentarioService implements IComentarioService{
	
	@Autowired
	private IComentarioRepository repository;

	@Override
	public List<ComentarioEntity> all() {
		return this.repository.findAll();
	}

	@Override
	public Optional<ComentarioEntity> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public ComentarioEntity save(ComentarioEntity comentarioEntity) {
		return this.repository.save(comentarioEntity);
	}

	@Override
	public void deleteById(Long id) {
		this.repository.deleteById(id);
		
	}

}
