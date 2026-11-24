package com.EduClicando.EduClicando.Service;

import com.EduClicando.EduClicando.Controller.Aluno.AlunoRequestCreate;
import com.EduClicando.EduClicando.Repository.AlunoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AlunoService {

    public final AlunoRepository alunoRepository;

    public void registroAluno(AlunoRequestCreate alunoNovo){

        if (alunoNovo.nome().isBlank()||alunoNovo.nomeDeUsuario().isBlank()){
            throw new RuntimeException("Campo não pode ser vazio!");
        } else if (alunoRepository.findExistByname(alunoNovo.nomeDeUsuario())) {
            throw new RuntimeException("Usuário com mesmo nome já existe!");
        } else if (alunoNovo.telefone().length() != 11) {
            throw new RuntimeException("Insira o telefone corretamente com ddd");
        } else if (alunoNovo.email().isEmpty()||alunoNovo.senha().isEmpty()) {
            throw new RuntimeException("Email e senha não podem ser vazios");
        }
    }
}
