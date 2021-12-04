package com.ejemplo.tiendaalamano.model.shared;

import java.io.Serializable;
import java.util.List;

public class ClienteActualizarDto implements Serializable{

    private static final long serialVersionUID = 1L;
    
    private String pass;
    private List <DireccionesDto> direccionesDto;
    private String telefono;
    private String estado;

    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public List<DireccionesDto> getDireccionesDto() {
        return direccionesDto;
    }
    public void setDireccionesDto(List<DireccionesDto> direccionesDto) {
        this.direccionesDto = direccionesDto;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
