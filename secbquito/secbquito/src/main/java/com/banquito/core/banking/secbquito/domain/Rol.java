package com.banquito.core.banking.secbquito.domain;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.math.BigDecimal;
import java.time.LocalDate;


@Builder
@Entity
@Table(name = "ROL")
@AllArgsConstructor
@NoArgsConstructor
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COD_ROL")
    public Integer rolCode;
    @Column(name = "NOMBRE_ROL")
    public String Nombre;
    @Column(name = "FECHA_CREACION")
    public LocalDate fechaCreacion;
    @Column(name = "FECHA_MODIFICACION")
    public LocalDate fechaModificacion;
    @Column(name = "DETALLE")
    public String Detalle;

    @Version
    @Column(name = "VERSION", nullable = false)
    private Long version;


}
