/*
Mateus Mendes - RM95138
Matheus Gomes Campolongo - RM94250
*/

package com.citiflix.controller;


import com.citiflix.filme.model.Filme;
import com.citiflix.filme.dados.AtualizarFilme;
import com.citiflix.filme.dados.InserirFilme;
import com.citiflix.filme.dados.ListarFilme;
import com.citiflix.filme.model.Genero;
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
    public ResponseEntity<String> save(@RequestBody @Valid InserirFilme dados) {
        try {
            repository.save(new Filme(dados));
            return ResponseEntity.ok("O filme " + dados.titulo() + " foi inserido com sucesso!");
        } catch (Exception e) {
            return ResponseEntity.ok("Não foi possível inserir o filme desejado.");
        }
    }

    @GetMapping
    public Page<ListarFilme> findAll(@PageableDefault (size = 3, sort = {"atorPrincipal"}) Pageable paginacao){
        return repository.findAll(paginacao).map(ListarFilme::new);
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<String> put(@PathVariable Long id, @RequestBody @Valid AtualizarFilme dados) {
        var filme = new Filme();
        try {
            filme = repository.getReferenceById(id);
            filme.atualizarFilme(dados);
            return ResponseEntity.ok("O filme " + filme.getTitulo() + " foi editado com sucesso!");
    } catch (Exception e) {
            return ResponseEntity.ok("Não foi possível editar o filme desejado.");
        }
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<String> delete(@PathVariable Long id) {
        var filme = new Filme();
        filme = repository.getReferenceById(id);
        try {
            filme.apagarFilme();
            return ResponseEntity.ok("A visibilidade do filme " + filme.getTitulo() + " foi desabilitada.");
        } catch (Exception e) {
            return ResponseEntity.ok("Não foi possível alterar a visibilidade do filme " + filme.getTitulo());
        }
    }
}
