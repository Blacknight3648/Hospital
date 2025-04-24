package com.duoc.hospital.hospital.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Table(name = "atenciones")
@Getter @Setter @NoArgsConstructor @ToString

public class Atencion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "atencion_id")

    private long atencionId;

    @Column(nullable = false)
    @NotNull(message = "El campo fecha atencion no puede estar vacio")
    private LocalDateTime fechaAtencion;

    @Column(nullable = false)
    @NotNull(message = "El campo monto no puede estar vacio")
    private Integer costo;

    private String comentario;

    @ManyToOne
    @JoinColumn(name = "medico_id", nullable = false)
    @NotNull(message = "El campo no puesde estar vacio")
    private Medico medico;

    @ManyToOne
    @JoinColumn(name = "paciente_id", nullable = false)
    @NotNull(message = "El campo paciente no puede estar vacio")
    private Paciente paciente;


}
