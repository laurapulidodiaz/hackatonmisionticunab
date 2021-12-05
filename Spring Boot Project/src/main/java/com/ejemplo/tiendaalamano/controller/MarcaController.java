package com.ejemplo.tiendaalamano.controller;

import java.util.List;

import com.ejemplo.tiendaalamano.data.entities.MarcaEntity;
import com.ejemplo.tiendaalamano.service.MarcaServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/marca")
public class MarcaController {
    @Autowired
    private MarcaServiceImpl marcaServicio;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/todas", method = RequestMethod.GET)
    public List<MarcaEntity> obtenerTodasMarca(){
        return marcaServicio.todasLasMarcas();
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/una/{codigo}", method = RequestMethod.GET)
    public MarcaEntity obtenerUnaMarca(@PathVariable Integer codigo){
        return marcaServicio.unaMarca(codigo);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/nuevo", method = RequestMethod.POST, consumes = "application/json")
    public void nuevaMarca(@RequestBody MarcaEntity miObjetito){
        marcaServicio.crearMarca(miObjetito);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/borrar/{codigo}", method = RequestMethod.DELETE)
    public void eliminarUnaMarca(@PathVariable Integer codigo){
        marcaServicio.borrarMarca(codigo);
    }

    @ResponseStatus(code = HttpStatus.OK, reason = "Objeto marca cambiado")
    @RequestMapping(value = "/actualizar", method = RequestMethod.PUT)
    public void actualizarMarca(@RequestBody MarcaEntity miObjeto){
        marcaServicio.actualizarMarca(miObjeto);
    }
}
