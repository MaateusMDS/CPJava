/*
Mateus Mendes - RM95138
Matheus Gomes Campolongo - RM94250
*/

package com.citiflix.filme.model;

import com.citiflix.filme.dados.DadosFichaTecnica;
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

    public FichaTecnica(DadosFichaTecnica dados) {
        this.direcao = dados.direcao();
        this.elenco = dados.elenco();
        this.roteiro = dados.roteiro();
        this.classificacaoIndicativa = dados.classificacaoIndicativa();
        this.producao = dados.producao();
    }

    public void atualizar(DadosFichaTecnica dados) {
        if (dados.direcao() != null) {
            this.direcao = dados.direcao();
        }
        if (dados.elenco() != null) {
            this.elenco = dados.elenco();
        }
        if (dados.roteiro() != null) {
            this.roteiro = dados.roteiro();
        }
        if (dados.classificacaoIndicativa() != null) {
            this.classificacaoIndicativa = dados.classificacaoIndicativa();
        }
        if (dados.producao() != null) {
            this.producao = dados.producao();
        }
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