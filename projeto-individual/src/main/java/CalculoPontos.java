public abstract class CalculoPontos {

    public String nome;
    public Integer nivel;
    public Double calculoPontos;


    public CalculoPontos(String nome, Integer nivel, Double calculoPontos) {
        this.nome = nome;
        this.nivel = nivel;
        this.calculoPontos = calculoPontos;
    }

    public abstract Double calculoPontos();

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

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public void setCalculoPontos(Double calculoPontos) {
        this.calculoPontos = calculoPontos;
    }

    @Override
    public String toString() {
        return "\n Calculo de Pontos por jogador: {"
                + "\n nome: '" + nome
                + '\''
                + "\n nivel do jogador: " + nivel
                + "\n calculo dos pontos=" + calculoPontos
                + '}';
    }
}
