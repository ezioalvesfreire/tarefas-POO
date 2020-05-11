package aula_6.exercicio01;

public class Pessoa {
    
    private String nome;
    private int anoNasc;
    private float altura;
    private int anoAtual;

    Pessoa(String n, int an, double al, int aa) {
        nome = n;
        anoNasc = an;
        altura = (float) al;
        anoAtual = aa;
       
    }

    public String getNome() {
        return nome;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public float getAltura() {
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }      
    public int calculaIdade(int anoNascimento, int anoAtual){
     int idade = 0;       
    idade = anoAtual - anoNascimento;
    //getIdade() = idade;
    return idade;
    }
    
    public void dadosPessoais(String nome, int idade, float altura ){
        
        System.out.println("Nome: " + this.getNome());
        System.out.println("Ano de nascimento " + this.getAnoNasc());
        System.out.println("Idade ");
        System.out.println("Altura" + this.getAltura());
    
    }
}
