package com.mealsbox.packages.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "carrito_compras")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarritoCompras {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(nullable = false, name = "codigo_carrito")
    private Integer codigoCarrito;

    @Column(nullable = false)
    private Integer cantidad;

    @Column(nullable = false)
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "documento_cliente",referencedColumnName = "documento_id_cliente", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "codigo_producto",referencedColumnName = "codigo_producto", nullable = false)
    private Producto producto;

}
