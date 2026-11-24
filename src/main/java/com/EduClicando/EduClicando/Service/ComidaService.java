package com.EduClicando.EduClicando.Service;

import com.EduClicando.EduClicando.Controller.Comida.ComidaRequest;
import com.EduClicando.EduClicando.Controller.Comida.ComidaResponse;
import com.EduClicando.EduClicando.Models.Comida;
import com.EduClicando.EduClicando.Repository.ComidaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ComidaService {

    // cadastrar uma comida nova V
    // checar se comida já existe
    // comida sacia V
    // comida preço V
    public final ComidaRepository ComidaRepository;

    public void AdicionarComida (ComidaRequest comida) {
        if (comida.comidaNome().isEmpty()||comida.comidaNome().isBlank()) {
            throw new RuntimeException("O nome está vazio, insira um nome válido.");
        } else if (comida.comidaValor().equals(0)||comida.comidaValor().describeConstable().isEmpty()) {
            throw new RuntimeException("O valor não pode ser zero");
        } else if (comida.fomeSaciada() <= 0) {
            throw new RuntimeException("A saciação não pode ser zero");
        } else if (comida.imgLink().isBlank()) {
            throw new RuntimeException("Insira uma imagem ao menos");
        }
        var comidanova = new Comida();
        comidanova.setComidaNome(comida.comidaNome());
        comidanova.setComidaValor(comida.comidaValor());
        comidanova.setFomeSaciada(comida.fomeSaciada());
        comidanova.setImgLink(comida.imgLink());
        ComidaRepository.save(comidanova);
    }
    public void AlterarComida (ComidaRequest comida, String id) {
        var comidanova = ComidaRepository.getReferenceById(id);
        if (!comida.comidaNome().isEmpty()) {
            comidanova.setComidaNome(comida.comidaNome());
        }
        if (!comida.comidaValor().equals(0)||comida.comidaValor().describeConstable().isEmpty()) {
            comidanova.setComidaValor(comida.comidaValor());
        }
        if (comida.fomeSaciada() > 0) {
            comidanova.setFomeSaciada(comida.fomeSaciada());
        }
        if (!comida.imgLink().isBlank()) {
            comidanova.setImgLink(comida.imgLink());
        }
    }

    // nesse caso, só se pode achar as comidas clicando nos icones da loja, sem pesquisa
    public ComidaResponse conferirComidaPorId(String id){

        var comidaPedida = ComidaRepository.getReferenceById(id);
        return new ComidaResponse(comidaPedida.getComidaNome(), comidaPedida.getComidaValor(), comidaPedida.getFomeSaciada(), comidaPedida.getImgLink());
    }

    public void apagarComida(String id){
        ComidaRepository.delete(ComidaRepository.getReferenceById(id));
    }
//Paginar display das comidas

//    public Page<Comida> comidaPage(){
//        for (int i = 0; i < 10; i++) {
//            ComidaRepository.
//        }
//
//    }
}
