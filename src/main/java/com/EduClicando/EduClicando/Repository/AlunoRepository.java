package com.EduClicando.EduClicando.Repository;

import com.EduClicando.EduClicando.Models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, String> {
}
