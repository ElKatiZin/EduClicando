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

@Table(name = "Mascote")
public class Mascote {

    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_usuario")
    private Aluno aluno;

    @Column (name = "Nome_Mascote")
    private String nome;
    private int fome;
    private int tedio;
    private double matematica;
    private double portugues;
    private double tecnologia;
    private int mNivel;
    private int pNivel;
    private int cNivel;



}
