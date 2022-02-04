package com.examenes.rest.controllers;

import com.examenes.rest.services.ClienteService;
import com.examenes.rest.utils.dto.IClienteDTO;
import com.examenes.rest.utils.dto.IClienteResponse200;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH})
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @SneakyThrows
    @PostMapping
    @ResponseBody
    public IClienteResponse200 crearCliente(@RequestBody IClienteDTO cliente) {
        return clienteService.createCliente(cliente);
    }

    @GetMapping("/{id}")
    public IClienteResponse200 getCliente(@PathVariable String id) {
        return clienteService.getCliente(id);
    }

    @GetMapping
    @ResponseBody
    public IClienteResponse200 getClientes() {
        return clienteService.getClientes();
    }

    @PutMapping("/{id}")
    @ResponseBody
    public IClienteResponse200 updateCliente(@PathVariable String id, @RequestBody IClienteDTO cliente) {
        return clienteService.updateCliente(id, cliente);
    }

}
