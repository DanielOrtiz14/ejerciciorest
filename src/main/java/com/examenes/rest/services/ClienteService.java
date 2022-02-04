package com.examenes.rest.services;

import com.examenes.rest.repository.ClienteRepository;
import com.examenes.rest.schemas.ClienteEntity;
import com.examenes.rest.utils.dto.IClienteDTO;
import com.examenes.rest.utils.dto.IClienteResponse200;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @SneakyThrows
    public IClienteResponse200 getClientes() {
        IClienteResponse200 response = new IClienteResponse200();
        List<ClienteEntity> clientes = clienteRepository.findAll();
        response.setCveMensaje("200");
        response.setCveError(-1);
        response.setData(clientes);
        return response;
    }

    @SneakyThrows
    public IClienteResponse200 getCliente(String clienteID) {
        IClienteResponse200 response = new IClienteResponse200();
        List<ClienteEntity> clientes = new ArrayList<ClienteEntity>();
        clientes.add(clienteRepository.findById(clienteID).get());
        System.out.println((clientes));
        response.setCveMensaje("200");
        response.setCveError(-1);
        response.setData(clientes);
        return response;
    }

    @SneakyThrows
    public IClienteResponse200 createCliente(IClienteDTO clienteDTO) {

        ClienteEntity clienteEntity = new ClienteEntity();
        IClienteResponse200 response = new IClienteResponse200();

        clienteEntity.setClienteID(clienteDTO.getClienteID());
        clienteEntity.setNombreUsuario(clienteDTO.getNombreUsuario());
        clienteEntity.setContrasena(clienteDTO.getContrasena());
        clienteEntity.setNombre(clienteDTO.getNombre());
        clienteEntity.setApellidos(clienteDTO.getApellidos());
        clienteEntity.setCorreoElectronico(clienteDTO.getCorreoElectronico());
        clienteEntity.setEdad(clienteDTO.getEdad());
        clienteEntity.setEstatura(clienteDTO.getEstatura());
        clienteEntity.setPeso(clienteDTO.getPeso());
        clienteEntity.setImc(clienteDTO.getImc());
        clienteEntity.setGeb(clienteDTO.getGeb());
        clienteEntity.setEta(clienteDTO.getEta());
        clienteEntity.setFechaCreacion(clienteDTO.getFechaCreacion());
        clienteEntity.setFechaActualizacion(clienteDTO.getFechaActualizacion());

        //guardamos el cliente en la base de datos
        clienteRepository.insert(clienteEntity);
        List<ClienteEntity> clientes = clienteRepository.findAll();

        response.setCveMensaje("200");
        response.setCveError(-1);
        response.setData(clientes);
        return response;

    }


    @SneakyThrows
    public IClienteResponse200 updateCliente(String id, IClienteDTO cliente) {

            IClienteResponse200 response = new IClienteResponse200();
            ClienteEntity clienteEntity = new ClienteEntity();

            clienteEntity.setClienteID(cliente.getClienteID());
            clienteEntity.setNombreUsuario(cliente.getNombreUsuario());
            clienteEntity.setContrasena(cliente.getContrasena());
            clienteEntity.setNombre(cliente.getNombre());
            clienteEntity.setApellidos(cliente.getApellidos());
            clienteEntity.setCorreoElectronico(cliente.getCorreoElectronico());
            clienteEntity.setEdad(cliente.getEdad());
            clienteEntity.setEstatura(cliente.getEstatura());
            clienteEntity.setPeso(cliente.getPeso());
            clienteEntity.setImc(cliente.getImc());
            clienteEntity.setGeb(cliente.getGeb());
            clienteEntity.setEta(cliente.getEta());
            clienteEntity.setFechaCreacion(cliente.getFechaCreacion());
            clienteEntity.setFechaActualizacion(cliente.getFechaActualizacion());


            //update
            clienteRepository.save(clienteEntity);

            List<ClienteEntity> clientes = new ArrayList<ClienteEntity>();
            clientes.add(clienteEntity);
            response.setCveMensaje("200");
            response.setCveError(-1);
            response.setData(clientes);

            return response;
    }
}