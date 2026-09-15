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

public class Mascote {
    @Column(name = "Mascote", columnDefinition = "256", nullable = false)
    @Id
    private long id;
    @Column (name = "Nome_Mascote")
    private String nome;
    private int fome;
    private double matematica;
    private double portugues;
    private double tecnologia;
    private int mNivel;
    private int pNivel;
    private int cNivel;

}
