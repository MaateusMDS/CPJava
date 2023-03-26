package com.citiflix.filme.model;

import com.citiflix.filme.model.dados.InserirFichaTecnica;
import jakarta.persistence.Embeddable;

@Embeddable
public class FichaTecnica {


    private String direcao;
    private String elenco;
    private String roteiro;
    private int classificacaoIndicativa;
    private String producao;

    public FichaTecnica() {
    }

    public FichaTecnica(InserirFichaTecnica dados) {
        this.direcao = dados.direcao();
        this.elenco = dados.elenco();
        this.roteiro = dados.roteiro();
        this.classificacaoIndicativa = dados.classificacaoIndicativa();
        this.producao = dados.producao();
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

    public int getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public FichaTecnica setClassificacaoIndicativa(int classificacaoIndicativa) {
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