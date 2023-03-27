/*
Mateus Mendes - RM95138
Matheus Gomes Campolongo - RM94250
*/

package com.citiflix.filme.model;

import com.citiflix.filme.dados.AtualizarFilme;
import com.citiflix.filme.dados.InserirFilme;
import jakarta.persistence.*;

@Entity(name = "Citiflix")
@Table(name = "TB_CFX_FILME")
public class Filme {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String atorPrincipal;
    private Integer duracao;
    private Integer anoLancamento;
    @Enumerated(EnumType.STRING)
    private Genero genero;
    @Embedded
    private FichaTecnica fichaTecnica;
    private boolean visivel;

    public Filme() {
    }

    public Filme(InserirFilme dados) {

        this.titulo = dados.titulo();
        this.atorPrincipal = dados.atorPrincipal();
        this.duracao = dados.duracao();
        this.anoLancamento = dados.anoLancamento();
        this.genero = dados.genero();
        this.fichaTecnica = new FichaTecnica(dados.fichaTecnica());
        this.visivel = true;
    }

    public void atualizarFilme(AtualizarFilme dados){
        if (dados.titulo() != null) {
            this.titulo = dados.titulo();
        }
        if (dados.atorPrincipal() != null) {
            this.atorPrincipal = dados.atorPrincipal();
        }
        if (dados.duracao() != null) {
            this.duracao = dados.duracao();
        }
        if (dados.anoLancamento() != null) {
            this.anoLancamento = dados.anoLancamento();
        }
        if (dados.genero() != null) {
            this.genero = dados.genero();
        }
        if (dados.fichaTecnica() != null) {
            this.fichaTecnica = new FichaTecnica(dados.fichaTecnica());
        }
    }

    public void apagarFilme(){
        this.visivel = false;
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

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public Filme setAnoLancamento(Integer anoLancamento) {
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

    public boolean isVisivel() {
        return visivel;
    }

    public Filme setVisivel(boolean visivel) {
        this.visivel = visivel;
        return this;
    }
}
