package com.mealsbox.packages.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "imagen_producto")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImagenProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_imagen")
    private String codigoImagen;

    @Column(nullable = false, length = 45)
    private String imagen;

    @Column(nullable = false)
    private Integer prioridad;

    @ManyToOne
    @JoinColumn(name = "codigo_producto",referencedColumnName = "codigo_producto", nullable = false)
    private Producto producto;
}
