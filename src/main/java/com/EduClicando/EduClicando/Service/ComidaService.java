package com.EduClicando.EduClicando.Service;

import com.EduClicando.EduClicando.Models.Comida;

public class ComidaService {

    // cadastrar uma comida nova V
    // checar se comida já existe
    // comida sacia V
    // comida preço V

    public void AdicionarComida (Comida comida) {
        if (comida.getNome().isEmpty()) {
            throw new RuntimeException("O nome está vazio, insira um nome válido.");
        } else {
            System.out.println("Valor inserido registrado");
        };
    }

    public void ValorComida (Comida comida) {
        if (comida.getValor() != 0) {
            System.out.println("Valor inserido registrado.");
        } else {
            System.out.println("O valor inserido é inválido, insira um valor válido.");
        };
    }
///
    public void Nutricional (Comida comida) {
        if (comida.getFomeSaciada() != 0) {
            System.out.println("Delícia!");
        } else {
            System.out.println("O valor digitado está incorreto, digite um valor válido.");
        };
    }
}
