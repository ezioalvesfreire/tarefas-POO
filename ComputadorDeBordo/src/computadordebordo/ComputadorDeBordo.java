package computadordebordo;

public class ComputadorDeBordo {

    public static void main(String[] args) {
        // TODO code application logic here
        Veiculo carro1 = new Veiculo("Gol", "Branco", "2002", 0, 45.0, 0);
         viagemCarro viagemCarro1 = new viagemCarro("Joinville", "Florianopolis", 250);
        carro1.percorrer();

        carroEsportivo carro2 = new carroEsportivo("Golf", "Vermelho", "2018", 0, 35.0);
        viagemCarro viagemCarro2 = new viagemCarro("Joinville", "Florianopolis", 250);
        carro2.percorrer();
    }

}
