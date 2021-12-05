package com.ejemplo.tiendaalamano.model.respuestas;

import java.util.List;

public class ClienteRestModel {

    private String idCliente;
    private String username;
    private String pass;
    private String nombre;
    private String documento;
    private List <DireccionesRestModel> direccionesrestModels;
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
    public List<DireccionesRestModel> getDireccionesrestModels() {
        return direccionesrestModels;
    }
    public void setDireccionesrestModels(List<DireccionesRestModel> direccionesrestModels) {
        this.direccionesrestModels = direccionesrestModels;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    

    
}
