package computadordebordo;

public class CarroEsportivo extends Veiculo {

    boolean turboLigado = false;

    public CarroEsportivo(String modelo, String cor, String ano, double velocidadeAtual, double combustivel, boolean esportivo) {
        super(modelo, cor, ano, velocidadeAtual, combustivel, esportivo);
    }

    public boolean isTurboLigado() {
        return turboLigado;
    }

    public void setTurboLigado(boolean turboLigado) {
        this.turboLigado = turboLigado;
    }

}
