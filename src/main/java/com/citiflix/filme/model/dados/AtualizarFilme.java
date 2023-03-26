package com.citiflix.filme.model.dados;

import com.citiflix.filme.model.FichaTecnica;
import com.citiflix.filme.model.Genero;
import jakarta.validation.constraints.NotNull;

import java.time.Year;

public record AtualizarFilme(
        @NotNull
        Long id,
        String titulo,
        String atorPrincipal,
        Integer duracao,
        Year anoLancamento,
        Genero genero,
        FichaTecnica fichaTecnica
) {
}
