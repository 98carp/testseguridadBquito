package com.banquito.core.banking.secbquito.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Builder
@Entity
@Table(name = "USUARIO")
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ACCOUNT_CODE", updatable = false, nullable = false)
    private Integer codUsuario;
    @Column(name = "ACCOUNT_HOLDER_TYPE")
    private String nombre;
    @Column(name = "ACCOUNT_HOLDER_TYPE")
    private String email;
    @Column(name = "ACCOUNT_HOLDER_TYPE")
    private String clave;
    @Column(name = "ACCOUNT_HOLDER_TYPE")
    private String tlf;
    @Column(name = "ACCOUNT_HOLDER_TYPE")
    private LocalDate fechaCrea;
    @Column(name = "ACCOUNT_HOLDER_TYPE")
    private LocalDate fechaUltAcceso;
    @Column(name = "ACCOUNT_HOLDER_TYPE")
    private LocalDate fechaModifica;
    @Column(name = "ACCOUNT_HOLDER_TYPE")
    private String estado;
    @Column(name = "ACCOUNT_HOLDER_TYPE")
    private String detalle;

    @Version
    @Column(name = "VERSION", nullable = false)
    private Long version;


}
