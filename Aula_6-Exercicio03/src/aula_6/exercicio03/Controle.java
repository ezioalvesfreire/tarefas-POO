/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_6.exercicio03;

/**
 *
 * @author Ezio
 */
public class Controle extends Televisao {
        
     public void subirCanal(){
         
        if(getCanal() >= 50){
        canal = 1;}else{
         int subirCanal = getCanal()+1;
        }
    }
     public void descerCanal(){
        int descerCanal = getCanal()-1;
    }
     public void pularParaCanal(int canalDigitado){
        int pularParaCanal = canalDigitado;
    }
      public void subirVolume(){
          if(volume >= volumeMax){
           System.out.println("Volume já está no máximo");
          }else{
              int subirVolume = getVolume()+1;
          }
          
    }
     public void descerVolume(){
         if(volume <= 0){
         System.out.println("Volume já está no Zero!");
         
         }else{
              int descerVolume = getVolume()-1;
         }
         
    }

  //  private int getCanal(int i) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }
    
}
