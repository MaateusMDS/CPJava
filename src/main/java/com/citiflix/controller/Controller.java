package com.citiflix.controller;


import com.citiflix.filme.model.Filme;
import com.citiflix.filme.dados.AtualizarFilme;
import com.citiflix.filme.dados.InserirFilme;
import com.citiflix.filme.dados.ListarFilme;
import com.citiflix.filme.repository.FilmeRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

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
    public Page<ListarFilme> listar(@PageableDefault (size = 3, sort = {"atorPrincipal"}) Pageable paginacao){
        return repository.findAll(paginacao).map(ListarFilme::new);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<String> excluir(@PathVariable Long id) {
        var filme = new Filme();
        filme = repository.getReferenceById(id);
        try {
            filme.apagarFilme();
            return ResponseEntity.ok("A visibilidade do filme " + filme.getTitulo() + " foi desabilitada.");
        } catch (Exception e) {
            return ResponseEntity.ok("Não foi possível alterar a visibilidade do filme " + filme.getTitulo());
        }
    }

    @PutMapping
    @Transactional
    public void atualizarFilme(@RequestBody @Valid AtualizarFilme dados) {
        var filme = new Filme();
        filme = repository.getReferenceById(dados.id());
        filme.atualizarFilme(dados);
    }
}
