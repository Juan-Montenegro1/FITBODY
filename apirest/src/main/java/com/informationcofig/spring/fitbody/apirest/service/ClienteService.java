package com.informationcofig.spring.fitbody.apirest.service;

import org.springframework.stereotype.Service;

import com.informationcofig.spring.fitbody.apirest.repositorios.ClienteRepositorio;
import com.informationcofig.spring.fitbody.apirest.usuarios.Cliente;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepositorio clienterepo;

    public void createUsuario(Cliente cliente){
        clienterepo.save(cliente);
    }
}
