package com.citiflix.filme.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "Citiflix")
@Table(name = "TB_CFX_FILME")
public class Filme {

    @Id
    @GeneratedValue
    private Long id;
    private String titulo;
    private String atorPrincipal;
    private Integer duracao;
    private LocalDate anoLancamento;
    @Enumerated(EnumType.STRING)
    private Genero genero;
    @Embedded
    private FichaTecnica fichaTecnica;

    public Filme(Long id) {
    }

    public Filme(Long id, String titulo, String atorPrincipal, Integer duracao, LocalDate anoLancamento, Genero genero, FichaTecnica fichaTecnica) {
        this.id = id;
        this.titulo = titulo;
        this.atorPrincipal = atorPrincipal;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
        this.fichaTecnica = fichaTecnica;
    }
}
