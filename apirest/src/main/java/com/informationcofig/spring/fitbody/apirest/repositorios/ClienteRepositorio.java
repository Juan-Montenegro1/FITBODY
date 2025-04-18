package com.informationcofig.spring.fitbody.apirest.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.informationcofig.spring.fitbody.apirest.usuarios.Cliente;

@Repository
public interface ClienteRepositorio extends JpaRepository <Cliente, Long>{

}
