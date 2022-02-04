package com.examenes.rest.utils.dto;

import lombok.Data;

import java.util.Date;

@Data
public class IClienteDTO {
    private String clienteID;
    private String nombreUsuario;
    private String contrasena;
    private String nombre;
    private String apellidos;
    private String correoElectronico;
    private Integer edad;
    private Double estatura;
    private Double peso;
    private Double imc;
    private Double geb;
    private Double eta;
    private String fechaCreacion;
    private String fechaActualizacion;

}
