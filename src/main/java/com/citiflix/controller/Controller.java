package com.citiflix.controller;


import com.citiflix.filme.model.Filme;
import com.citiflix.filme.model.dados.InserirFilme;
import com.citiflix.filme.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filme")
public class Controller {

    @Autowired
    private FilmeRepository repository;

    @PostMapping
    @Transactional
    public void inserirFilme(@RequestBody InserirFilme dados) {
        repository.save(new Filme(dados));
    }
}
