package com.EduClicando.EduClicando.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;


@Getter @Setter
@Entity (name = "Questão")


public class Questao {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "ENUNCIADO", length = 2048, nullable = false)
    private String enunciado;
    @Column
    private List<Alternativa> alternativas;


}
