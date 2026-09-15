package com.EduClicando.EduClicando.Repository;

import com.EduClicando.EduClicando.Models.Alternativa;
import com.EduClicando.EduClicando.Models.Licao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LicaoRepository extends JpaRepository<Licao, Long> {
}
