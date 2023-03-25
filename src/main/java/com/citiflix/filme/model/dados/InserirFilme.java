package com.citiflix.filme.model.dados;

import com.citiflix.filme.model.FichaTecnica;
import com.citiflix.filme.model.Genero;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record InserirFilme (
        @NotBlank
        String titulo,
        @NotBlank
        String atorPrincipal,
        @NotBlank
        @Size(min = 2, max = 3)
        Integer duracao,
        @NotBlank
        @Size(min = 4, max = 4)
        String anoLancamento,
        @NotBlank
        Genero genero,
        @NotBlank
        FichaTecnica fichaTecnica
) {}
