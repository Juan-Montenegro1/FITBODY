package com.informationcofig.spring.fitbody.apirest.usuarios;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    private String nombres;

    private String apellidos;

    private String email;

    private String password;

    private Double peso;

    private Double estatura;

    private Integer edad;

    private String genero;

    private Double imc;

    private String objetivo;

    private LocalDate fechaNacimiento;

    //private Gimnasio gimnasio;

    private LocalDateTime fechaRegistro;

    @PrePersist
    protected void onCreate(){
        this.fechaRegistro = LocalDateTime.now();
    }
}
