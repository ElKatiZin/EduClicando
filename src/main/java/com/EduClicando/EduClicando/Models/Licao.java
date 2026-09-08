package com.EduClicando.EduClicando.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity

public class Licao {
    @Id
    private long id;
    private String nome;
    private List<Licao> licoes;
    private double nivel;
}
