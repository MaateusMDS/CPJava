package com.citiflix.filme.dados;

import jakarta.validation.constraints.NotBlank;

public record DadosFichaTecnica(
        String direcao,
        String elenco,
        String roteiro,
        Integer classificacaoIndicativa,
        String producao
) {}