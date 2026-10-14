package com.EduClicando.EduClicando.Models.Aluno;

import java.time.LocalDate;

public record AlunoRequest (String telefone,
                            String nome,
                            String nomeDeUsuario,
                            String email,
                            String senha,
                            LocalDate dNasc){

}
