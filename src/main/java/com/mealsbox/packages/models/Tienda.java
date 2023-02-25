package com.mealsbox.packages.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tienda")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, length = 20)
    private String nit;

    @Column(nullable = false, length = 45)
    private String nombre;

    @Column(nullable = false, length = 120)
    private String telefono;

    @Column(nullable = false, length = 120, name = "correo_electronico")
    private String correoElectronico;

    @Column(nullable = true)
    private String direccion;

    @Lob
    @Column(nullable = true)
    private String latitud;

    @Lob
    @Column(nullable = true)
    private String longitud;

    @ManyToOne
    @JoinColumn(name = "documento_usuario",referencedColumnName = "documento_id_usuario", nullable = false)
    private Usuario usuario;
}
