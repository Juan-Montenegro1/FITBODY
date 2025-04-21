package com.informationcofig.spring.fitbody.apirest.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.informationcofig.spring.fitbody.apirest.usuarios.User;

@Repository
public interface UserRepositorio extends JpaRepository <User, Integer>{
    Optional<User> findByUsername(String username);
}
