package computadordebordo;

public class CarroEsportivo extends Veiculos{
   boolean turboLigado = false;
   
    public double gastoDeCombustivel(double distanciaPercorrida){// ainda emplementar a função para atualizar o nivel do tanque
       if(velocidadeAtual >= 0  && velocidadeAtual <= 80){
           combustivel = combustivel - 0.4;
        
   }else if(velocidadeAtual > 80 && velocidadeAtual <= 120){
            combustivel = combustivel - 0.3;
   }else{
       //if(trbo=true){ v=xx; } else  { v=x; }
       combustivel = combustivel - 0.6;
   }
       
       return combustivel; // rernar o nivel do tanque
   } 
   
}
