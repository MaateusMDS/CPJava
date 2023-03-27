/*
Mateus Mendes - RM95138
Matheus Gomes Campolongo - RM94250
*/

package com.citiflix.filme.dados;

import jakarta.validation.constraints.NotBlank;

public record DadosFichaTecnica(
        @NotBlank
        String direcao,
        @NotBlank
        String elenco,
        @NotBlank
        String roteiro,
        Integer classificacaoIndicativa,
        @NotBlank
        String producao
) {}