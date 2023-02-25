package com.mealsbox.packages.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "producto")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(nullable = false, name = "codigo_producto")
    private Integer codigoProducto;

    @Column(nullable = false, length = 45)
    private String nombre;

    @Column(nullable = true)
    private String descripcion;

    @Column(nullable = false, name = "valor_venta")
    private Integer valorVenta;

    @Column(nullable = true, name = "valor_costo")
    private Integer valorCosto;

    @Column(nullable = false)
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "codigo_categoria",referencedColumnName = "codigo_categoria", nullable = false)
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "tienda_nit",referencedColumnName = "nit", nullable = false)
    private Tienda tienda;
}
