package agenda;

import java.util.Scanner;
public class Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in); 
		int opcao = 0; 
		while (opcao != 4) { 
			System.out.println("Menu de opções:"); 
			System.out.println("1- Cadastrar Contato"); 
			System.out.println("2- Buscar Contato"); 
			System.out.println("3- Imprimir agenda"); 
			System.out.println("4- sair");
			
			opcao = Integer.parseInt(in.nextLine());  
                        
                         switch(opcao){
            case 1:
                System.out.println("[1]INSERIR CHAMADA PARA METODO CADASTRAR CONTATO");
                break;
            case 2:
                System.out.println("[2]INSERIR CHAMADA PARA O METODO BUSCAR CONTATO");
                break;
            case 3:
                System.out.println("[3]INSERIR CHAMADA PARA O METODO IMPRIMIR AGENDA");
                break;
            case 4:
                System.out.println("SAIR");
                break;
                
            default:
                System.out.println("Digite SOMENTE números entre 1 e 4");
                break;
        }
		 }		
		System.out.println("Fim da Execucao");
        
        
    }
    
}
