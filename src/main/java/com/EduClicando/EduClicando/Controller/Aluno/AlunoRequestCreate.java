package com.EduClicando.EduClicando.Controller.Aluno;

import java.time.LocalDate;

public record AlunoRequestCreate(String telefone,
                                 String nome,
                                 String nomeDeUsuario,
                                 String email,
                                 String senha,
                                 LocalDate dataNasc) {
}
