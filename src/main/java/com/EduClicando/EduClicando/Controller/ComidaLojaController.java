package com.EduClicando.EduClicando.Controller;

import com.EduClicando.EduClicando.Models.Comida;
import com.EduClicando.EduClicando.Service.ComidaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/educlicando/comida-loja")
public class ComidaLojaController {


    @GetMapping("/{id}")
    public Comida getComida(@PathVariable Long id){
       return new Comida();
    }
}
