
package computadordebordo;

public class ViagemCarro {
    private String destino;
    private String origem;
    private double distanciaTotal;
    private double distanciaPercorrida = 0;
    private double GastoCombustivel = 0;

    public ViagemCarro(String origem,String destino, double distanciaTotal, double distanciaPercorrida, double GastoCombustivel) {
        this.origem = origem;
        this.destino = destino;
        this.distanciaTotal = distanciaTotal;
        this.distanciaPercorrida = distanciaPercorrida;
        this.GastoCombustivel = GastoCombustivel;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public double getDistanciaTotal() {
        return distanciaTotal;
    }

    public void setDistanciaTotal(double distanciaTotal) {
        this.distanciaTotal = distanciaTotal;
    }

    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void setDistanciaPercorrida(double distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public double getGastoCombustivel() {
        return GastoCombustivel;
    }

    public void setGastoCombustivel(double GastoCombustivel) {
        this.GastoCombustivel = GastoCombustivel;
    }
    
    double percorrer(){
        for(int i = 0; i < distanciaTotal; i++ )
            this.atualizaVelocidade();
            this.gastoDeCombustivel(velocidadeAtual);
            combustivelNoTanque();
            if(combustivel <= 5){
                reabastecer();
            }
    
    }
    
    
}
