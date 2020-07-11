package computadordebordo;

public class ComputadorDeBordo {

    public static void main(String[] args) {
        // TODO code application logic here
         veiculos carro1 = new veiculos ("Gol","Branco","2002", 0 , 45.0));
         viagemCarro viagemCarro1 = new viagemCarro ("Joinville", "Florianopolis", 250);
         percorrer();
         
         carroEsportivo carro2 = new carroEsportivo("Golf","Vermelho","2018", 0 , 35.0);
         viagemCarro viagemCarro2 = new viagemCarro ("Joinville", "Florianopolis", 250); 
         percorrer();
    }
    
}
