/*
Mateus Mendes - RM95138
Matheus Gomes Campolongo - RM94250
*/

package com.citiflix.filme.dados;

import jakarta.validation.constraints.NotBlank;

public record DadosFichaTecnica(
        String direcao,
        String elenco,
        String roteiro,
        Integer classificacaoIndicativa,
        String producao
) {}