package com.mealsbox.packages.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "venta")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "codigo_venta")
    private Integer codigoVenta;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date fecha;

    @Column(nullable = false)
    private Double iva;

    @Column(nullable = false, name = "total_venta")
    private Integer totalVenta;

    @ManyToOne
    @JoinColumn(name = "documento_cliente",referencedColumnName = "documento_id_cliente", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "metodo_pago",referencedColumnName = "codigo_metodo", nullable = false)
    private MetodoPago metodoPago;

    @ManyToOne
    @JoinColumn(name = "direccion_cliente",referencedColumnName = "codigo_direccion", nullable = false)
    private DireccionCliente direccioncliente;

}
