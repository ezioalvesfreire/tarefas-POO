
package aula_8.lojacds;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Aula_8LojaCds {
       
    public static void main(String[] args) {
        // TODO code application logic here
        
       Cd[] arrayCd = new Cd[3];
         
       String cDNome    = JOptionPane.showInputDialog("Digite o nome do CD:");
       String cDPreco   = JOptionPane.showInputDialog("Digite o Preço:");
       String cDArtista = JOptionPane.showInputDialog("Digite o Artista:");
        
      
   
        arrayCd[0] = new Cd(cDNome, Integer.parseInt(cDPreco), cDArtista);
        System.out.println("nome" + arrayCd[0].nome);
        System.out.println("artista" + arrayCd[0].artista);
        System.out.println("preco" + arrayCd[0].preco);
        
        cDNome    = JOptionPane.showInputDialog("Digite o nome do CD:");
        cDPreco   = JOptionPane.showInputDialog("Digite o Preço:");
        cDArtista = JOptionPane.showInputDialog("Digite o Artista:");
        
        arrayCd[1] = new Cd(cDNome, Integer.parseInt(cDPreco), cDArtista);
        System.out.println("nome" + arrayCd[1].nome);
        System.out.println("artista" + arrayCd[1].artista);
        System.out.println("preco" + arrayCd[1].preco);
        
    }
    
     

}
