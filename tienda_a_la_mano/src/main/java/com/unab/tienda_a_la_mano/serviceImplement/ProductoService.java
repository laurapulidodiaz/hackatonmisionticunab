package com.unab.tienda_a_la_mano.serviceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.tienda_a_la_mano.entity.ProductoEntity;
import com.unab.tienda_a_la_mano.repository.IProductoRepository;
import com.unab.tienda_a_la_mano.service.IProductoService;

@Service
public class ProductoService implements IProductoService{
	
	@Autowired
	private IProductoRepository repository;

	@Override
	public List<ProductoEntity> all() {
		return this.repository.findAll();
	}
	
	@Override
	public List<ProductoEntity> allByNombreOMarca(String filtro) {
		return this.repository.allByNombreOMarca(filtro);
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

	@Override
	public List<ProductoEntity> allSinStock() {
		return this.repository.allSinStock();
	}


}
