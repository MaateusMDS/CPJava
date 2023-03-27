package com.citiflix.filme.dados;

import com.citiflix.filme.model.Genero;

import java.time.Year;

public record AtualizarFilme(
        Long id,
        String titulo,
        String atorPrincipal,
        Integer duracao,
        Year anoLancamento,
        Genero genero,
        DadosFichaTecnica fichaTecnica
) {}
