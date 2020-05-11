package aula_5;

public class Cd extends Produto {
    String artista;
    int faixas;
    
    public Cd(String a, double f) {
        	this.artista = a;
            this.faixas = (int) f;
	}
    
public String getArtista(){
    return this.artista;
} 
public void setAtista(String a){
    this.artista = a;

}
public double getFaixas(){
    return this.faixas;
}
public void setFaixas(int f){
    this.faixas = f;
}

    Cd(String the_Wall, int i, String pink_Floid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void claculaValorFin() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
    
}
