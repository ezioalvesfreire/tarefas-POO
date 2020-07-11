package computadordebordo;

public class ComputadorDeBordo {

    public static void main(String[] args) {
        // TODO code application logic here
        Veiculo carro1 = new Veiculo("Gol", "Branco", "2002", 0, 45.0, false);
         ViagemCarro viagemCarro1 = new ViagemCarro("Joinville", "Florianopolis", 250, 0, 0);
        viagemCarro1.percorrer();

        CarroEsportivo carro2 = new CarroEsportivo("Golf", "Vermelho", "2018", 0, 35.0, true);
        ViagemCarro viagemCarro2 = new ViagemCarro("Joinville", "Florianopolis", 250, 0, 0);
        viagemCarro2.percorrer();
    }

}
