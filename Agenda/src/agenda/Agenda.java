package agenda;


import java.util.Scanner;

import javax.swing.JOptionPane;
public class Agenda {
     Scanner in = new Scanner(System.in); 
     static Contatos[] arrayContato = new Contatos[30];
     static int tamanhoArray = 0; 
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String opcao = "0";
       
         //----------------------------------------------------------
        String continuar = "S";
                
		while (!"4".equals(opcao))
                { 
                   
			System.out.println("Menu de opções:"); 
			System.out.println("1- Cadastrar Contato"); 
			System.out.println("2- Buscar Contato"); 
			System.out.println("3- Imprimir agenda"); 
			System.out.println("4- sair");
			
                        
                       // String opcao = in.nextLine();
                     //   String opcao = in.next();
                      //  opcao = Integer.parseInt(in.nextLine());
			//opcao = Integer.parseInt(in.nextLine());  
                        opcao   = JOptionPane.showInputDialog("Digite uma opção:");
                        
                         switch(opcao)
                         {
                            
                            case "1":    
                                  System.out.println("[1]INSERIR CHAMADA PARA METODO CADASTRAR CONTATO");
                                  inserir(continuar);
                                  tamanhoArray++; 
                                  break;
                            case "2":
                                 System.out.println("[2]INSERIR CHAMADA PARA O METODO BUSCAR CONTATO");
                                 buscar();
                                 break;
                            case "3":
                                  System.out.println("[3] INSERIR CHAMADA PARA O METODO IMPRIMIR AGENDA");
                                break;
                            case "4":
                                 System.out.println("SAIR");
                                 break;
                
                            default:
                                 System.out.println("Digite SOMENTE números entre 1 e 4");
                                 break;
                     }
                         
                         
                         
		}		
		System.out.println("Fim da Execucao");
    }      
         
//--------------------------------------------------------------------------------
 public static void inserir(String continuar){ //, String nome, String numFone
    
        
      
        String contatoNome    = JOptionPane.showInputDialog("Digite o nome:");
        String contatoNumFone   = JOptionPane.showInputDialog("Digite o numero do telefone:");
       
        
        arrayContato[tamanhoArray] = new Contatos(contatoNome, contatoNumFone);
      }
 
 public static void buscar(){ //, String nome, String numFone
	    
     
     
     String contatoNome    = JOptionPane.showInputDialog("Digite o nome:");
     for(int i = 0; i <= tamanhoArray; ++i){
         if(arrayContato[i] == contatoNome){
        // System.out.println( String nome + String numFone );
     }
       
   }
 }
}