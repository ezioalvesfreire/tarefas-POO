package agenda;



public class Contatos {
   private String numFone;
   private String nome;

    public Contatos(String numFone, String nome) {
        this.numFone = numFone;
        this.nome = nome;
    }

    public String getNumFone() {
        return numFone;
    }

    public void setNumFone(String numFone) {
        this.numFone = numFone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
