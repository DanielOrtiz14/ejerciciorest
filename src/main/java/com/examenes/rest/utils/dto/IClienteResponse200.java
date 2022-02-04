package com.examenes.rest.utils.dto;

import com.examenes.rest.schemas.ClienteEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.LinkedList;
import java.util.List;

@Data
public class IClienteResponse200 {

    private Integer cveError;
    private String cveMensaje;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<ClienteEntity> data = new LinkedList<ClienteEntity>();

}
