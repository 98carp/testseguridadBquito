package com.banquito.core.banking.secbquito.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
@Entity
@Table(name = "PERMISOS_test")
@AllArgsConstructor
@NoArgsConstructor
public class Permisos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COD_PERMISOS")
    private Integer codPermisos;

    @Column(name = "NOMBRE_PERMISOS")
    private String nombre;

    @Column(name = "FECHA_ULTIMA_MODIFICACION")
    private LocalDate fechaModifica;

    @Version
    @Column(name = "VERSION", nullable = false)
    private Long version;


}
