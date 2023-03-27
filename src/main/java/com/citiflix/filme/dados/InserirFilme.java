/*
Mateus Mendes - RM95138
Matheus Gomes Campolongo - RM94250
*/

package com.citiflix.filme.dados;

import com.citiflix.filme.model.Filme;
import com.citiflix.filme.model.Genero;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.Length;

import java.time.Year;

public record InserirFilme(
        @NotBlank
        String titulo,
        @NotBlank
        String atorPrincipal,
        @NotNull @Min(10) @Digits(integer = 3, fraction = 0)
        Integer duracao,
        @NotNull @Min(1000) @Digits(integer = 4, fraction = 0)
        Integer anoLancamento,
        @NotNull
        Genero genero,
        @NotNull
        DadosFichaTecnica fichaTecnica
) {
}

