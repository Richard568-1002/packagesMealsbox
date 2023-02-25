package com.mealsbox.packages.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id
    @Column(nullable=  false, name = "documento_id_cliente")
    private Integer documentoId;

    @Column(nullable = false, length = 45)
    private String nombre;

    @Column(nullable = false, length = 45)
    private String apellido;

    @Column(nullable = false, length = 120, name = "correo_electronico")
    private String correoElectronico;

    @Column(nullable = false)
    private String clave;

    @Column(nullable = false, length = 20)
    private String telefono;

    @Column(nullable = false)
    private String foto;


}
