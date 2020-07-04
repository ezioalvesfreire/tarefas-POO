package agenda;

public class Contatos {
   private String numFone;
   private String nome;

    public Contatos(String nome, String numFone) {
        this.numFone = numFone;
        this.nome = nome;
        //System.out.println(numFone);
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
