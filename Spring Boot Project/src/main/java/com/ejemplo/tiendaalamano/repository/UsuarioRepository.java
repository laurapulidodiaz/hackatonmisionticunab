package com.ejemplo.tiendaalamano.repository;

import java.util.List;

import com.ejemplo.tiendaalamano.data.entities.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	@Query("SELECT p FROM Usuario p WHERE p.username = :username and p.password = :password")
	public List<Usuario> login(String username, String password); 
}
