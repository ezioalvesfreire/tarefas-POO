package aula_6.exercicio02;

public class Elevador {
    int andarAtual = 5;
    int terreo;
    double capacidadeCarga = 6;
    int qtdPassageiro;
    int toltalAndar = 10;

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getTerreo() {
        return terreo;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public int getQtdPassageiro() {
        return qtdPassageiro;
    }

    public int getToltalAndar() {
        return toltalAndar;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public void setTerreo(int terreo) {
        this.terreo = terreo;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public void setQtdPassageiro(int qtdPassageiro) {
        this.qtdPassageiro = qtdPassageiro;
    }

    public void setToltalAndar(int toltalAndar) {
        this.toltalAndar = toltalAndar;
    }
    
    public void sobePassageiro(){
        if(qtdPassageiro < capacidadeCarga)
        {
         int sobePassageiro = qtdPassageiro ++;
        }else {
              System.out.println(" Elevador está lotado! agurde... ");
              }
       
    
    }
  public void descePassageiro(){
    int descePassageiro = qtdPassageiro --;
    
    }
  public void status(){
  if(andarAtual == 0){
      System.out.println("terreo!");
  }
      else{
              System.out.println("O andar eh: " + andarAtual);
              }
          
  }
    
}
