/*
Mateus Mendes - RM95138
Matheus Gomes Campolongo - RM94250
*/

package com.citiflix.filme.dados;

import com.citiflix.filme.model.Genero;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.Length;

import java.time.Year;

public record AtualizarFilme(
        String titulo,
        String atorPrincipal,
        @Min(10) @Digits(integer = 3, fraction = 0)
        Integer duracao,
        @Min(1000) @Digits(integer = 4, fraction = 0)
        Integer anoLancamento,
        Genero genero,
        DadosFichaTecnica fichaTecnica
) {}
