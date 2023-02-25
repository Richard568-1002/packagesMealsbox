package com.mealsbox.packages.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "detalle_pedido")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetallePedido {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(nullable = false, name = "codigo_detalle")
    private Integer codigoDetallePedido;

    @Column(nullable=  false)
    private Integer cantidad;

    @Column(nullable = false, name = "valor_venta")
    private Integer valorVenta;

    @Column(nullable = false, name = "valor_costo")
    private Integer valorCosto;

    @ManyToOne
    @JoinColumn(name = "codigo_pedido",referencedColumnName = "codigo_pedido", nullable = false)
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "codigo_producto",referencedColumnName = "codigo_producto", nullable = false)
    private Producto producto;
}
