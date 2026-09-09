package com.EduClicando.EduClicando.Service;

import com.EduClicando.EduClicando.Repository.AlunoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AlunoService {

    public final AlunoRepository alunoRepository;


}
