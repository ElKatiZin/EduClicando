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
    private String Nome;
    @Id
    private String id;
    @Column(name = "Valor_comida")
    private int valor;
    private int fomeSaciada;
}
