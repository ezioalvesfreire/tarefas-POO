
package aula_15lojacds;

public class Cd {
     String nome;
     double preco;
     String artista;
    int quantidade;

   Cd(String n, double p, String a, int q) {
                    nome = n; 
                    preco = p; 
                    artista = a; 
                    quantidade = q;
            }
    public double comprarCd(int q){
         // int quantidade = q;
          double valorTotal = this.preco * quantidade; 
                       return valorTotal;


    }
   /* 
     public double totalBruto(double valorTotal ){
         double total;
         
         this.total += valorTotal;
                     
         return total;


    }*/
    
}
