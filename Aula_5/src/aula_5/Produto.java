package aula_5;

public class Produto {
    
    String nome;
	double preco;
        int desconto = 2; // inclua um atributo de desconto no produto 
	
        public boolean ehCaro() {
		return(preco > 100);
	}
        
        public double ValorComDesc(double preco,double desconto){
         // double desconto;
          // double valorComDesc;
          double ValorComDesc = 0;
           
            // desconto = (preco*porcentagem)/100;
           // valorComDesc = preco - desconto;
      //  double ValorComDesc = 0;
       double valorComDesc = preco - desconto;
        

      return ValorComDesc;
        }
    
}
