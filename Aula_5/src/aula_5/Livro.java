package aula_5;

public class Livro extends Produto {
    
    String autor;
	int paginas;
	
	//public boolean ehCaro() {
	//	return (preco > 100);
	//}
	
	public boolean ehGrande() {
		return (paginas > 200);
	}
	
	public Livro(String n, double p, String a, int pg) {
		nome = n;
		preco = p;
		autor = a;
		paginas = pg;
	}
	
	public void VerificaTamanho() {
		System.out.println("O Livro '" + this.nome + "' tem " + this.paginas + " paginas, portanto é:");
		if(this.ehGrande()) {
			System.out.println("Grande");
		}else {
			System.out.println("Pequeno");
		}
		
	}

      
}
