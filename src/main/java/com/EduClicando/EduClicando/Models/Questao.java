package com.EduClicando.EduClicando.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Entity @Table(name = "Questão")


public class Questao {
    @Column (name = "Questão", columnDefinition = "256", nullable = false)
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 16384, nullable = false)
    private String enunciado;
    @Column(length = 2048)
    private String linkImagem;
    @Column
    private List<Alternativa> alternativas;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "licao_id")
    private Licao licao;

    @OneToMany(mappedBy = "alternativa")
    private List<Alternativa> alternativaList;


}
