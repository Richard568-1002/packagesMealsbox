package com.mealsbox.packages.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "comentario")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_comentario")
    private String codigoComentario;

    @Column(nullable = false)
    private Integer calificacion;

    @Column(nullable = false)
    private String descripcion;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "documento_cliente",referencedColumnName = "documento_id_cliente", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "codigo_producto",referencedColumnName = "codigo_producto", nullable = false)
    private Producto producto;
}
