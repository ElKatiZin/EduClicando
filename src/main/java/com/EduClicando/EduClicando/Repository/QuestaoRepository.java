package com.EduClicando.EduClicando.Repository;

import com.EduClicando.EduClicando.Models.Alternativa;
import com.EduClicando.EduClicando.Models.Questao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestaoRepository extends JpaRepository<Questao, Long> {
}
