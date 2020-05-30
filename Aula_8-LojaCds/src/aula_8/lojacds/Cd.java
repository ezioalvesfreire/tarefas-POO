package aula_8.lojacds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

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
  

}
//public double CalculaVenda(int quantidade,double preco){
  //                  double valorTotal = this.preco * quantidade; 
  //                   return ValorTotal;

     //   }

