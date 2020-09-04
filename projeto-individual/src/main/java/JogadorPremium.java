public class JogadorPremium extends CalculoPontos {

    private Integer nivelSkin;

    public JogadorPremium(String nome, Integer nivel, Double calculoPontos, Integer nivelSkin) {
        super(nome, nivel, calculoPontos);
        this.nivelSkin = nivelSkin;
    }

    @Override
    public Double calculoPontos() {
        return this.nivelSkin * 0.15;
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
