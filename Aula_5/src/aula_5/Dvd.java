package aula_5;

public class Dvd extends Produto {
        String artista;
        int duracao;
        
        public Dvd(String a, double d) {
        	this.artista = a;
		this.duracao = (int) d;
	}
        
        public String getArtista(){
            return this.artista;
} 
        public void setAtista(String a){
             this.artista = a;

}
        public double getDuracao(){
            return this.duracao;
}
        public void setDuracao(int d){
             this.duracao = d;
}
        
        public void imprimeDados(){
            System.out.println("Sobre o DVD");
        
        
        }
}
