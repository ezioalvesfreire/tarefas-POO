package aula_8.lojacds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Cd {
     String nome;
     int preco;
     String artista;
    int quantidade = 3;

   Cd(String n, int p, String a) {
                    nome = n; 
                    preco = p; 
                    artista = a; 
            }
    public double comprarCd(int q){
          int quantidade = q;
          double valorTotal = this.preco * quantidade; 
                       return valorTotal;


    }
  

}
//public double CalculaVenda(int quantidade,double preco){
  //                  double valorTotal = this.preco * quantidade; 
  //                   return ValorTotal;

     //   }

