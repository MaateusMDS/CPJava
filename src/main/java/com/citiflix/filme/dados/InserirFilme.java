/*
Mateus Mendes - RM95138
Matheus Gomes Campolongo - RM94250
*/

package com.citiflix.filme.dados;

import com.citiflix.filme.model.Filme;
import com.citiflix.filme.model.Genero;

import java.time.Year;

public record InserirFilme(
        String titulo,
        String atorPrincipal,
        Integer duracao,
        Year anoLancamento,
        Genero genero,
        DadosFichaTecnica fichaTecnica
) {
}

