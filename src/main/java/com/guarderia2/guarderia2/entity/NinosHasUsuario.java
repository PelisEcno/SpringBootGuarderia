package com.guarderia2.guarderia2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="ninos_has_usuario")
@Getter
@Setter
public class NinosHasUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ninos")
    private int idNinos;

    @Column(name="id_usuario")
    private int idUsuario;

    @Column(name="parentesco")
    private String parentesco;

}
