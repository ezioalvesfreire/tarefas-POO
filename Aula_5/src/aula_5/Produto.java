package aula_5;

public class Produto {
    
    String nome;
	double preco;
        int desconto = 2; // inclua um atributo de desconto no produto 
	
        public boolean ehCaro() {
		return(preco > 100);
	}
        
        public double ValorFin(double preco,double desconto){
                   double ValorComDesc = 0;
                   double valorComDesc = preco - desconto; // desconto em porcentagem >> double valorComDesc = (preco*porcentagem)/100;
                     return ValorComDesc;
        }
        
        //////////////////////////////////////////////////////
        
        public void valorFin() {
	   //	System.out.println("O valor com desconto eh! " + cd1.valorFin());
	}
    //////////////////////////////////////
        public void imprimeDados(double preco, String nome){
            
            System.out.println("teste");
        
        
        }
}
