package com.example.projetoindividual;

public abstract class CalculoPontos {


    public String nome;
    public Integer nivel;
    public Double calculoPontos;


    // construtor
    public CalculoPontos(String nome, Integer nivel, Double calculoPontos) {
        this.nome = nome;
        this.nivel = nivel;
        this.calculoPontos = calculoPontos;
    }

    // metodo abstrato
    public abstract Double calculoPontos();

    // getters
    public String getNome() {
        return nome;
    }

    public Integer getNivel() {
        return nivel;
    }

    public Double getCalculoPontos() {
        return calculoPontos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // seters
    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public void setCalculoPontos(Double calculoPontos) {
        this.calculoPontos = calculoPontos;
    }

    //toString
    @Override
    public String toString() {
        return "\n Dados do jogador: {"
                + "\n nome: '" + nome
                + '\''
                + "\n nivel do jogador: " + nivel
                + "\n calculo dos pontos: " + calculoPontos
                + '}';
    }
}
