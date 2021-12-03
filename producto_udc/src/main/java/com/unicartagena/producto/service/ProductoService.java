package com.unicartagena.producto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unicartagena.producto.entity.ProductoEntity;
import com.unicartagena.producto.repository.IProductoRepository;

@Service
public class ProductoService implements IProductoService {

	@Autowired
	private IProductoRepository repository;

	@Override
	public List<ProductoEntity> all() {
		return this.repository.findAll();
	}

	@Override
	public Optional<ProductoEntity> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public ProductoEntity save(ProductoEntity productoEntity) {
		return this.repository.save(productoEntity);
	}

	@Override
	public void deleteById(Long id) {
		this.repository.deleteById(id);

	}

}
