package com.example.projetoindividual;

public abstract class Jogador {

    private String nome;
    private Integer nivel;
    private String tipoJogador;
    protected Double calculoPontos = 0.0;


    // construtor
    public Jogador(String nome, Integer nivel, String tipoJogador) {
        this.nome = nome;
        this.nivel = nivel;
        this.tipoJogador = tipoJogador;
    }

    // metodo abstrato
    public abstract Double calcularPontos();

    public String getNome() {
        return nome;
    }

    public Integer getNivel() {
        return nivel;
    }

    public String getTipoJogador() {
        return tipoJogador;
    }

    public Double getCalculoPontos() {
        return calculoPontos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipoJogador(String tipoJogador) {
        this.tipoJogador = tipoJogador;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public void setCalculoPontos(Double calculoPontos) {
        this.calculoPontos = calculoPontos;
    }


    @Override
    public String toString() {
        return "\n Dados do jogador: {"
                + "\n nome: '" + nome
                + "\n nivel do jogador: " + nivel
                + "\n  tipo do jogador: " + tipoJogador
                + "\n calculo dos pontos: " + calculoPontos
                + '}';
    }
}
