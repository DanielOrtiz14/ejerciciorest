package com.examenes.rest.utils.dto;

import lombok.Data;

import java.util.Date;

@Data
public class IClienteRequestPOST {
    private String nombreUsuario;
    private String contrasena;
    private String nombre;
    private String apellidos;
    private String correoElectronico;
}
