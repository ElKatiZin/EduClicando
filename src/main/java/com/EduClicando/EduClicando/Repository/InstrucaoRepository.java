package com.EduClicando.EduClicando.Repository;

import com.EduClicando.EduClicando.Models.Alternativa;
import com.EduClicando.EduClicando.Models.Instrucao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstrucaoRepository extends JpaRepository<Instrucao, Long> {
}
