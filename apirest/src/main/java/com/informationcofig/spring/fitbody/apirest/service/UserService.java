package com.informationcofig.spring.fitbody.apirest.service;

import org.springframework.stereotype.Service;

import com.informationcofig.spring.fitbody.apirest.repositorios.UserRepositorio;
import com.informationcofig.spring.fitbody.apirest.usuarios.User;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepositorio clienterepo;

    public void createUsuario(User cliente){
        clienterepo.save(cliente);
    }
}
