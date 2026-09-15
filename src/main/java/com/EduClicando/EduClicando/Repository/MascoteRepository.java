package com.EduClicando.EduClicando.Repository;

import com.EduClicando.EduClicando.Models.Alternativa;
import com.EduClicando.EduClicando.Models.Mascote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MascoteRepository extends JpaRepository<Mascote, Long> {
}
