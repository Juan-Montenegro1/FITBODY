package com.informationcofig.spring.fitbody.apirest.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.informationcofig.spring.fitbody.apirest.usuarios.Gimnasio;

import lombok.RequiredArgsConstructor;
import com.informationcofig.spring.fitbody.apirest.service.GimnasioService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/gimnasio")
@RequiredArgsConstructor
public class GimnasioController {

    private final GimnasioService gymservice;

    @PostMapping
    public void createGimnasio(@RequestBody Gimnasio gimnasio){
        gymservice.createUsuario(gimnasio);
    }
    
}
