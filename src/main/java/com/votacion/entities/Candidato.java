package com.votacion.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Candidato {
    @Id
    private Integer numeroTarjeton;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estudiante_codigo", referencedColumnName = "codigo")
    private Estudiante estudiante;
}
