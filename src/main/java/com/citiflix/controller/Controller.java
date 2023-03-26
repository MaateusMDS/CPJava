package com.citiflix.controller;


import com.citiflix.filme.model.Filme;
import com.citiflix.filme.model.dados.InserirFilme;
import com.citiflix.filme.model.dados.ListarFilme;
import com.citiflix.filme.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public Page<ListarFilme> listar(@PageableDefault (size = 3, sort = {"nome"}) Pageable paginacao){
        return repository.findAll(paginacao).map(ListarFilme::new);
    }
}
