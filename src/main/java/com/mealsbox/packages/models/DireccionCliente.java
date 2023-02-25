package com.mealsbox.packages.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "direccion_cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DireccionCliente {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(nullable = false, name = "codigo_direccion")
    private Integer codigoDireccion;

    @Column(nullable = false)
    private String direccion;

    @Column(nullable = false, length = 45)
    private String destinatario;

    @Lob
    @Column(nullable = false)
    private String latitud;

    @Lob
    @Column(nullable = false)
    private String longitud;

    @ManyToOne
    @JoinColumn(name = "documento_cliente",referencedColumnName = "documento_id_cliente", nullable = false)
    private Cliente cliente;

}
