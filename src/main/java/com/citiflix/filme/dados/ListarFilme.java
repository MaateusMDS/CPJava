/*
Mateus Mendes - RM95138
Matheus Gomes Campolongo - RM94250
*/

package com.citiflix.filme.dados;

import com.citiflix.filme.model.FichaTecnica;
import com.citiflix.filme.model.Filme;
import com.citiflix.filme.model.Genero;

public record ListarFilme(
        String titulo,
        String atorPrincipal,
        Integer duracao,
        Genero genero,
        String direcao
) {
    public ListarFilme(Filme filme) {
        this (
                filme.getTitulo(),
                filme.getAtorPrincipal(),
                filme.getDuracao(),
                filme.getGenero(),
                filme.getFichaTecnica().getDirecao()
        );
    }
}
