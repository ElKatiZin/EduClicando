package com.EduClicando.EduClicando.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
    @Column(name = "Comida", columnDefinition = "256", nullable = false)
    @Id
    private long id;
    @Column(name = "Valor_comida")
    private double valor;
    private int fomeSaciada;
}
