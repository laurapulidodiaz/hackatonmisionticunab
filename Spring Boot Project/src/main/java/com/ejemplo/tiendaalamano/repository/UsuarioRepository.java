package com.ejemplo.tiendaalamano.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ejemplo.tiendaalamano.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	@Query("SELECT p FROM Usuario p WHERE p.username = :username and p.password = :password")
	public List<Usuario> login(String username, String password); 
}
