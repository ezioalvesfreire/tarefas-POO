package aula_5;

public class Heranca {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Livro l1 = new Livro("O Senhor dos Aneis", 50, "JRR Tolkien", 4000);
        l1.VerificaTamanho();
        l1.ehCaro();
       
      //  ValorFin();
        
        Cd cd1 = new Cd("Pink Floid",22);
      cd1.claculaValorFin();
      Cd cd2 = new Cd("Cristiano Araújo",20);
   //   cd2.claculaValorFin();
   
       Dvd dvd1 = new Dvd("Henrique e Juliano ",90); //"Na hora da raiva"
     // Dvd1.claculaValorFin();
		
		
    }

    private static void ValorFin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void imprimeDados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
