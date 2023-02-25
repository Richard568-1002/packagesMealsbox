package com.mealsbox.packages.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "estado")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "codigo_estado")
    private Integer codigoEstado;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = true)
    private String descripcion;
}
