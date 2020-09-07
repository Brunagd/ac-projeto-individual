package com.example.projetoindividual;

// classe do jogadore Premium
public class JogadorPremium extends Jogador {

    // o jogador Premium ganha um acrescimo no dano por nivel de Skin

    private Integer nivelSkin;


    public JogadorPremium(String nome, Integer nivel, String tipoJogador, Integer nivelSkin) {
        super(nome, nivel, tipoJogador);
        this.nivelSkin = nivelSkin;
    }

    @Override
    public Double calcularPontos() {
        Double total = 0.0;
        total = this.getNivel() * this.nivelSkin * 0.60;
        return calculoPontos = total;
    }

    public Integer getNivelSkin() {
        return nivelSkin;
    }

    public void setNivelSkin(Integer nivelSkin) {
        this.nivelSkin = nivelSkin;
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
