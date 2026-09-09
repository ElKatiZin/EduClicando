package com.EduClicando.EduClicando.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
    @Column (name = "Alternativa", length = 256, nullable = false)
    @Id
    private long id;
    private String letra;
    private boolean correta;
}
