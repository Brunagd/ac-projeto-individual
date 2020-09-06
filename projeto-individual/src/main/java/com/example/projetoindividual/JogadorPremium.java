package com.example.projetoindividual;

import com.example.projetoindividual.CalculoPontos;

// classe do jogadore Premium
public class JogadorPremium extends CalculoPontos {

    // o jogador Premium ganha um acrescimo no dano por nivel de Skin

    private Integer nivelSkin;


    public JogadorPremium(String nome, Integer nivel, Double calculoPontos, Integer nivelSkin) {
        super(nome, nivel, calculoPontos);
        this.nivelSkin = nivelSkin;
    }

    @Override
    public Double calculoPontos() {
        return this.nivel * this.nivelSkin * 0.60;
    }

    @Override
    public String toString() {
        return "\n Jogador premium{"
                + super.toString()
                + "\n nivel da Skin: " + nivelSkin
                + "\n calculo dos pontos: " + getCalculoPontos()
                + '}';
    }
}
