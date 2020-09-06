package com.example.projetoindividual;

public class JogadorFree  extends CalculoPontos {

    // jogador free ganha acrescimo de poder por nivel de habilidade
    private Double poderHabilidade;

    public JogadorFree(String nome, Integer nivel, Double calculoPontos, Double poderHabilidade) {
        super(nome, nivel, calculoPontos);
        this.poderHabilidade = poderHabilidade;
    }

    @Override
    public Double calculoPontos() {
        return this.nivel * this.poderHabilidade * 0.45;
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
