package com.guarderia2.guarderia2.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "grupos")
@Getter
@Setter
public class Grupos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_grupos")
    @NotNull
    private int idGrupos;

    @Column(name = "nombre_grupo")
    @NotBlank
    private String nombreGrupo;

    @Column(name = "cantidad")
    @NotNull
    private int cantidad;

    @Column(name = "id_usuario_docente")
    @NotNull
    private int idUsuarioDocente;

    @Column(name = "id_aulas")
    @NotNull
    private int idAulas;
}
