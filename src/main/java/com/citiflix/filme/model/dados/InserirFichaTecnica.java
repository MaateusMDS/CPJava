package com.citiflix.filme.model.dados;

import jakarta.validation.constraints.NotBlank;

public record InserirFichaTecnica (
        @NotBlank
        String direcao,
        @NotBlank
        String elenco,
        @NotBlank
        String roteiro,
        Integer classificacaoIndicativa,
        @NotBlank
        String producao
) {
}
