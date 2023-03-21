package com.citiflix.filme.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class FichaTecnica {

    private String direcao;
    private String elenco;
    private String roteiro;
    private Integer classificacaoIndicativa;
    private String producao;

    public FichaTecnica() {
    }

    public FichaTecnica(String direcao, String elenco, String roteiro, Integer classificacaoIndicativa, String producao) {
        this.direcao = direcao;
        this.elenco = elenco;
        this.roteiro = roteiro;
        this.classificacaoIndicativa = classificacaoIndicativa;
        this.producao = producao;
    }

    public String getDirecao() {
        return direcao;
    }

    public FichaTecnica setDirecao(String direcao) {
        this.direcao = direcao;
        return this;
    }

    public String getElenco() {
        return elenco;
    }

    public FichaTecnica setElenco(String elenco) {
        this.elenco = elenco;
        return this;
    }

    public String getRoteiro() {
        return roteiro;
    }

    public FichaTecnica setRoteiro(String roteiro) {
        this.roteiro = roteiro;
        return this;
    }

    public Integer getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public FichaTecnica setClassificacaoIndicativa(Integer classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
        return this;
    }

    public String getProducao() {
        return producao;
    }

    public FichaTecnica setProducao(String producao) {
        this.producao = producao;
        return this;
    }
}


