package computadordebordo;

public class Veiculo {

    private String modelo;
    private String cor;
    private String ano;
    private double velocidadeAtual;
    private double combustivel; // em litros
    private boolean esportivo = false;

    public Veiculo(String modelo, String cor, String ano, double velocidadeAtual, double combustivel, boolean esportivo) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.velocidadeAtual = velocidadeAtual;
        this.combustivel = combustivel;
        this.esportivo = esportivo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public boolean isEsportivo() {
        return esportivo;
    }

    public void setEsportivo(boolean esportivo) {
        this.esportivo = esportivo;
    }

    public double gastoDeCombustivel(double velocidadeAtual, boolean turboLigado) {
        double consumo = 0;

        if (esportivo == true) {
            if (velocidadeAtual >= 0 && velocidadeAtual <= 80) {
                consumo = 0.4;
            } else if (velocidadeAtual > 80 && velocidadeAtual <= 120) {
                consumo = 0.3;
            } else if (velocidadeAtual > 120) {
                consumo = 0.6;
            }
            if (turboLigado == true) {
                consumo = consumo * 2;
            }
          //  return consumo;

        } else {
            if (velocidadeAtual >= 0 && velocidadeAtual <= 80) {
                consumo = 0.2;
            } else if (velocidadeAtual > 80 && velocidadeAtual <= 120) {
                consumo = 0.1;
            } else if (velocidadeAtual > 120) {
                consumo = 0.4;
            }

        }
        return consumo;

    }

    double combustivelNoTanque() {
        getCombustivel();

        return combustivel;
    }

    double reabastecer() {

        if (esportivo == true) {
            combustivel = 35;

        } else {
            combustivel = 45;
        }
        System.out.println("Reabastecido!!!");
        return combustivel;

    }

    double atualizaVelocidade() {

        if (this.veiculo == carroEsportivo) {
            if (this.distanciaPercorrida <= 50) {
                this.setVelocidadeAtual(80);
            } else if (distanciaPercorrida >= 51 &&  <= 150) {
               // turbo = true;
               // turboLigado = true;
                this.setTurboLigado(true);
                
                this.setVelocidadeAtual(150);

            } else if (this.distanciaPercorrida > 150) {
                this.setVelocidadeAtual(100);
            }

        } else {
            if (distanciaPercorrida <= 50) {
                this.setVelocidadeAtual(80);
            } else if (distanciaPercorrida > 50 &&  <= 150) {
                this.setVelocidadeAtual(130);
            } else if (distanciaPercorrida > 150) {
                this.setVelocidadeAtual(100);
            }
        }
        return velocidadeAtual;

    }

    public void imprimeOsDados() {

    }
}
