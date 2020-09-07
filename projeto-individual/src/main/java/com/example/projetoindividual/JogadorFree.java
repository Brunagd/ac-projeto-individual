package com.example.projetoindividual;

public class JogadorFree  extends Jogador {

    // jogador free ganha acrescimo de poder por nivel de habilidade
    private Double poderHabilidade;

    public JogadorFree(String nome, Integer nivel,String tipoJogador, Double poderHabilidade) {
        super(nome, nivel, tipoJogador);
        this.poderHabilidade = poderHabilidade;
    }

    @Override
    public Double calcularPontos() {
        Double total = 0.0;
        total = this.getNivel() * this.poderHabilidade * 0.45;
        return calculoPontos = total;
    }

    public Double getPoderHabilidade() {
        return poderHabilidade;
    }

    public void setPoderHabilidade(Double poderHabilidade) {
        this.poderHabilidade = poderHabilidade;
    }

        @Override
    public String toString() {
        return "JogadorFree{"
                + toString()
                + "poder de habilidade: " + poderHabilidade
                + "Calculo de pontos: " + getCalculoPontos()
                + '}';
    }
}
