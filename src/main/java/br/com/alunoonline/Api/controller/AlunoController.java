package br.com.alunoonline.Api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AlunoController {

    @ResponseStatus
    @GetMapping
    public String nomeAluno(){
        return "Amanda";
    }

}
