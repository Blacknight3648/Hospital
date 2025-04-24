package com.duoc.hospital.hospital.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Medicos")
@Getter @Setter

public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "medico_id")

    private long medicoId;

    @Column(unique = true, nullable = false)
    @NotBlank(message = "El campo run no puede estar vacio")
    @Pattern(regexp = "\\d{1,8}-[\\dKk]", message = "El fomato del dni debe ser XXXXXXXX-X") // \\d{1,8} un digito en un rango de 1 a 8 numeros,  - [\\dKk] un digito o una K mayuscula o minuscula
    private String run;

    @Column(nullable = false)
    @NotBlank(message = "El campo nombres no puede estar vacio")
    private  String nombres;

    @Column(nullable = false)
    @NotBlank(message = "El campo apellidos no puede estar vacio")
    private String apellidos;

    @Column(name = "especialidad")
    private  String especialidad;

    @Column(name = "jefe_turno")
    @NotBlank(message = "El campo no puede estar vacio")
    private char jefeTurno;



}
