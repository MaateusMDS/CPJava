package com.citiflix.filme.model;

import com.citiflix.filme.model.dados.InserirFilme;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Year;

@Entity(name = "Citiflix")
@Table(name = "TB_CFX_FILME")
public class Filme {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String atorPrincipal;
    private Integer duracao;
    private Year anoLancamento;
    @Enumerated(EnumType.STRING)
    private Genero genero;
    @Embedded
    private FichaTecnica fichaTecnica;

    public Filme() {
    }

    public Filme(Long id, String titulo, String atorPrincipal, Integer duracao, Year anoLancamento, Genero genero, FichaTecnica fichaTecnica) {
        this.id = id;
        this.titulo = titulo;
        this.atorPrincipal = atorPrincipal;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
        this.fichaTecnica = fichaTecnica;
    }
    public Filme(InserirFilme dados) {
        this.titulo = dados.titulo();
        this.atorPrincipal = dados.atorPrincipal();
        this.duracao = dados.duracao();
        this.anoLancamento = Year.parse(dados.anoLancamento());
        this.genero = dados.genero();
        this.fichaTecnica = new FichaTecnica(dados.fichaTecnica());
    }

    public Long getId() {
        return id;
    }

    public Filme setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitulo() {
        return titulo;
    }

    public Filme setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public String getAtorPrincipal() {
        return atorPrincipal;
    }

    public Filme setAtorPrincipal(String atorPrincipal) {
        this.atorPrincipal = atorPrincipal;
        return this;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public Filme setDuracao(Integer duracao) {
        this.duracao = duracao;
        return this;
    }

    public Year getAnoLancamento() {
        return anoLancamento;
    }

    public Filme setAnoLancamento(Year anoLancamento) {
        this.anoLancamento = anoLancamento;
        return this;
    }

    public Genero getGenero() {
        return genero;
    }

    public Filme setGenero(Genero genero) {
        this.genero = genero;
        return this;
    }

    public FichaTecnica getFichaTecnica() {
        return fichaTecnica;
    }

    public Filme setFichaTecnica(FichaTecnica fichaTecnica) {
        this.fichaTecnica = fichaTecnica;
        return this;
    }
}
