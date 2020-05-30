
package aula_15lojacds;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Aula_15LojaCds {
   
    public static void main(String[] args) {
        // TODO code application logic here
        
             Cd[] arrayCd = new Cd[3];
       double preco[] = null;
       double total = 0;
       
         
       for (int i = 0; i < arrayCd.length; i++) { 
        String cDNome    = JOptionPane.showInputDialog("Digite o nome do CD:");
        String cDPreco   = JOptionPane.showInputDialog("Digite o Preço:");
        String cDArtista = JOptionPane.showInputDialog("Digite o Artista:");
        String cDQtd 	  = JOptionPane.showInputDialog("Digite a quantidade que deseja comprar: ");
        
        
        arrayCd[i] = new Cd (cDNome, Double.parseDouble(cDPreco), cDArtista, Integer.parseInt(cDQtd));
        int cDQtd1 = Integer.parseInt(cDQtd);
        
       // double valorDaCompra = comprarCd(cDQtd1);
     //  arrayCd[i].comprarCd(cDQtd1);
     double valorDaCompra = arrayCd[i].comprarCd(cDQtd1);
     
         total += valorDaCompra;
     
         System.out.println("Comprado(s): " + arrayCd[i].quantidade + " CD do: " + arrayCd[i].artista);
         System.out.println("nome - " + arrayCd[i].nome);
         System.out.println("artista - " + arrayCd[i].artista);
         System.out.println("preco - " + arrayCd[i].preco);
         System.out.println("Valor: " + arrayCd[i].comprarCd(cDQtd1));
          System.out.println("Valor total: " + total );
         System.out.println("--------------");
          
       
      }
      	
    }
    
}
