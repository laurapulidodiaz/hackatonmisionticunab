package com.ejemplo.tiendaalamano.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.tiendaalamano.util.JWTUtil;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private JWTUtil jwtUtil;
    
    @GetMapping
	public ResponseEntity<?> createtoken(){
    	String tokenJwt = jwtUtil.getJWTToken("texto ejemplo");
        String resp = "{\"token\":\""+tokenJwt+"\"}";
        return ResponseEntity.ok(resp);
	}
}