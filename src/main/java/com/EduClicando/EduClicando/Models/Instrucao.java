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

public class Instrucao {
    @Column(name = "Instrução", columnDefinition = "256", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 2048, nullable = false)
    private String detalhamento;
    @Column(length = 2048)
    private String linkImagem;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "licao_id")
    private Licao licao;
}
