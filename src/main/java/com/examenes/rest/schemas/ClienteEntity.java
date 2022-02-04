package com.examenes.rest.schemas;


import javax.validation.constraints.NotNull;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Document(collection = "practicas")
@Data
public class ClienteEntity {

    @Id
    private String clienteID;

    @Indexed(unique=true)
    @NotNull(message = "El campo nombre no puede estar vacio")
    private String nombreUsuario;

    private String contrasena;
    private String nombre;
    private String apellidos;


    @NotNull(message = "El campo nombre no puede estar vacio")
    @Indexed(unique=true)
    private String correoElectronico;

    private Integer edad;
    private Double estatura;
    private Double peso;
    private Double imc;
    private Double geb;
    private Double eta;

    @DateTimeFormat(pattern = "yyyy-MM-dd", iso = DateTimeFormat.ISO.DATE)
    private String fechaCreacion;

    @DateTimeFormat(pattern = "yyyy-MM-dd", iso = DateTimeFormat.ISO.DATE)
    private String fechaActualizacion;


}
