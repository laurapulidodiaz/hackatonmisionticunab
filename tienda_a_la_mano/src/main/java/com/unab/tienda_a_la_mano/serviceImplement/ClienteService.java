package com.unab.tienda_a_la_mano.serviceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.tienda_a_la_mano.entity.ClienteEntity;
import com.unab.tienda_a_la_mano.repository.IClienteRepository;
import com.unab.tienda_a_la_mano.service.IClienteService;

@Service
public class ClienteService implements IClienteService{
	
	@Autowired
	private IClienteRepository repository;

	@Override
	public List<ClienteEntity> all() {
		return this.repository.findAll();
	}

	@Override
	public Optional<ClienteEntity> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public ClienteEntity save(ClienteEntity clienteEntity) {
		return this.repository.save(clienteEntity);
	}

	@Override
	public void deleteById(Long id) {
		this.repository.deleteById(id);
		
	}

}
