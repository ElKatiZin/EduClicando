package com.EduClicando.EduClicando.Models;

import jakarta.persistence.*;
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

public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 256, nullable = false)
    private String nomeDoCurso;
    @Column(length = 2048, nullable = false)
    private long descricao;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "curso")
    private List<Licao> licaoList;

}
