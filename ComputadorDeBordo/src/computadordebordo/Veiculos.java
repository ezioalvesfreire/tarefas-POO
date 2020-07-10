package computadordebordo;

public class Veiculos {
    private String modelo;
    private String cor;
    private String ano;
    private double velocidadeAtual; 
    private double combustivel; // em litros
    
   public double gastoDeCombustivel(double distanciaPercorrida){// ainda emplementar a função para atualizar o nivel do tanque
       if(velocidadeAtual >= 0  && velocidadeAtual <= 80){
           combustivel = combustivel - 0.2;
        
   }else if(velocidadeAtual > 80 && velocidadeAtual <= 120){
            combustivel = combustivel - 0.1;
   }else{
       combustivel = combustivel - 0.4;
   }
       
       return combustivel; // rernar o nivel do tanque
   } 
}
