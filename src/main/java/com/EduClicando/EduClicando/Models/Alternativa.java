package com.EduClicando.EduClicando.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity

public class Alternativa {
    @Id
    private long id;
    @Column (nullable = false, length = 256)
    private String letra;
    @Column (nullable = false, name = "Alternativa_Correta")
    private boolean correta;
    @Column (nullable = false, length = 256)
    private String resposta;

    @JoinColumn (name = "questao_id")
    @ManyToOne
    private Questao questao;

}
