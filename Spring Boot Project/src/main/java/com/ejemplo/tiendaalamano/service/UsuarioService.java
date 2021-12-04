package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.data.entities.Usuario;

public interface UsuarioService {
	public List<Usuario> findAll();
	public Optional<Usuario> findById(Long id);
	public List<Usuario> login(String username, String password);
	public Usuario save(Usuario Usuario);
	public void deleteById(Long id);
	
}
