package com.votacion.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Estudiante {
    @Id
    private Integer codigo;
    private String nombre;
    private String programa;
    private String password;
    private Boolean  hasvoted;
}
