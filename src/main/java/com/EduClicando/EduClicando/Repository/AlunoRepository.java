package com.EduClicando.EduClicando.Repository;

import com.EduClicando.EduClicando.Models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AlunoRepository extends JpaRepository<Aluno, String> {

    public boolean findExistByname(String nomeDeUsuario);
}
