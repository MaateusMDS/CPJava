package com.citiflix.filme.model.dados;

import com.citiflix.filme.model.FichaTecnica;
import com.citiflix.filme.model.Filme;
import com.citiflix.filme.model.Genero;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.Year;

public record ListarFilme(
        String titulo,
        String atorPrincipal,
        Integer duracao,
        Genero genero,
        FichaTecnica fichaTecnica
) {
    public ListarFilme(Filme filme) {
        this (
                filme.getTitulo(),
                filme.getAtorPrincipal(),
                filme.getDuracao(),
                filme.getGenero(),
                filme.getFichaTecnica()
        );
    }
}
