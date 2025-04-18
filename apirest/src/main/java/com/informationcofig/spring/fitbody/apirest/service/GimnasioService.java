package com.informationcofig.spring.fitbody.apirest.service;

import org.springframework.stereotype.Service;

import com.informationcofig.spring.fitbody.apirest.repositorios.GimnasioRepositorio;
import com.informationcofig.spring.fitbody.apirest.usuarios.Gimnasio;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GimnasioService {
    private final GimnasioRepositorio gymrepo;

    public void createUsuario(Gimnasio gym){
        gymrepo.save(gym);
    }
}
