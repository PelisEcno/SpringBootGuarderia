package com.guarderia2.guarderia2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;

@Entity
@Table(name = "pagos")
@Getter
@Setter
public class Pagos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pago")
    private int idPago;

    @Column(name = "fecha_pago")
    private LocalDate fechaPago;

    @Column(name = "monto")
    private BigDecimal monto;

    @Column(name = "concepto")
    private String concepto;

    @Column(name = "estado_pago")
    private String estadoPago;

    @Column(name = "id_ninos")
    private int idNinos;
}
