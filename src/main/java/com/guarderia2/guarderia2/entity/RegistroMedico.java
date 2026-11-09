package com.guarderia2.guarderia2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "registro_medico")
@Getter
@Setter
public class RegistroMedico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_registro")
    private int idRegistro;

    @Column(name = "observaciones")
    private String observaciones;

    @Column(name = "alergias")
    private String alergias;

    @Column(name = "contacto_emergencia")
    private String contactoEmergencia;

    @Column(name = "id_ninos")
    private int idNinos;
}
