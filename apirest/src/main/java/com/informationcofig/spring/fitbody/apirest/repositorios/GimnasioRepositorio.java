package com.informationcofig.spring.fitbody.apirest.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.informationcofig.spring.fitbody.apirest.usuarios.Gimnasio;

@Repository
public interface GimnasioRepositorio extends JpaRepository <Gimnasio, Long>{

}
