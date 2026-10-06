package com.EduClicando.EduClicando.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Entity


public class Aluno {

    @Id
    @Column (length = 12, nullable = false)
    private String telefone;
    @Column (nullable = false)
    private String nome;
    @Column (unique = true)
    private String nomeDeUsuario;
    private String email;
    private String senha;
    @Column (name = "Data_De_Nascimento")
    private LocalDate dataNasc;
    private int pontuacao;
    private int pontosTotais;
    private int nivel;

}
