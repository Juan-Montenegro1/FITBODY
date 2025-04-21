package com.informationcofig.spring.fitbody.apirest.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.informationcofig.spring.fitbody.apirest.usuarios.User;

import lombok.RequiredArgsConstructor;
import com.informationcofig.spring.fitbody.apirest.service.UserService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/cliente")
@RequiredArgsConstructor
public class ClienteController {

    private final UserService userService;

    @PostMapping
    public void createCliente(@RequestBody User cliente){
        userService.createUsuario(cliente);
    }
}
