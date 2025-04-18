package com.informationcofig.spring.fitbody.apirest.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.informationcofig.spring.fitbody.apirest.usuarios.Cliente;

import lombok.RequiredArgsConstructor;
import com.informationcofig.spring.fitbody.apirest.service.ClienteService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/cliente")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;

    @PostMapping
    public void createCliente(@RequestBody Cliente cliente){
        clienteService.createUsuario(cliente);
    }
}
