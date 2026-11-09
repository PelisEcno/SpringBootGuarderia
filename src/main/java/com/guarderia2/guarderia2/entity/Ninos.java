package com.guarderia2.guarderia2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Entity
@Table(name = "ninos")
@Getter
@Setter
public class Ninos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ninos")
    private int idNinos;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @Column(name = "codigo_unico")
    private int codigoUnico;

    @Column(name = "numero_documento")
    private String numeroDocumento;

    @Column(name = "id_grupos")
    private int idGrupos;

    @Column(name = "tipo_documento_id_tipo_documento")
    private int tipoDocumentoIdTipoDocumento;
}
