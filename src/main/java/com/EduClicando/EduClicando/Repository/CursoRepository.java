package com.EduClicando.EduClicando.Repository;

import com.EduClicando.EduClicando.Models.Alternativa;
import com.EduClicando.EduClicando.Models.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
