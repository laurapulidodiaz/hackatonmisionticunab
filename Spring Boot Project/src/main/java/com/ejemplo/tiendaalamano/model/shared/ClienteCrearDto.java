package com.ejemplo.tiendaalamano.model.shared;

import java.io.Serializable;
import java.util.List;

public class ClienteCrearDto implements Serializable{
    
    private static final long serialVersionUID = 1L;

    private String idCliente;
    private String username;
    private String pass;
    private String nombre;
    private String documento;
    private List <DireccionesDto> direccionesDto;
    private String telefono;
    public String getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public List<DireccionesDto> getDireccionesDto() {
        return direccionesDto;
    }
    public void setDireccionesrestModels(List<DireccionesDto> direccionesDto) {
        this.direccionesDto = direccionesDto;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }



    
    
}
