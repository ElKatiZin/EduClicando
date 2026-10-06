package com.EduClicando.EduClicando.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity

public class Comida {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(name = "Valor_comida")
    private double valor;
    private int fomeSaciada;
}
