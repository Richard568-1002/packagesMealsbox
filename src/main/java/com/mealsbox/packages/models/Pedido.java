package com.mealsbox.packages.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "pedido")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,name = "codigo_pedido")
    private Integer codigoPedido;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private String fecha;

    @Column(nullable = false, name = "total_pedido")
    private Integer totalPedido;

    @ManyToOne
    @JoinColumn(name = "codigo_venta",referencedColumnName = "codigo_venta", nullable = false)
    private Venta venta;

    @ManyToOne
    @JoinColumn(name = "codigo_estado",referencedColumnName = "codigo_estado", nullable = false)
    private Estado estado;
}
