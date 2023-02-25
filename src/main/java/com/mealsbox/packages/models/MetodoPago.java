package com.mealsbox.packages.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity
@Table(name = "metodo_pago")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MetodoPago {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(nullable = false, name = "codigo_metodo")
  private Integer codigoMetodo;

  @Column(nullable = false, length = 60)
  private String metodoPago;

  @Column(nullable = false)
  private Boolean Estado;

}
