package agenda;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class Agenda {

   // Scanner input = new Scanner(System.in);
     Scanner in = new Scanner(System.in); 
      //   String continuar = "S";
      //String opcao = "0";
          
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String opcao = "0";
         
         //----------------------------------------------------------
         
         
         //--------------------------------------------------------
               //  Contatos[] arrayContato = new Contatos[3];
		//int opcao = 0; 
                String continuar = "S";
                
		while (!"4".equals(opcao)) { 
                   
			System.out.println("Menu de opções:"); 
			System.out.println("1- Cadastrar Contato"); 
			System.out.println("2- Buscar Contato"); 
			System.out.println("3- Imprimir agenda"); 
			System.out.println("4- sair");
			
                        
                       // String opcao = in.nextLine();
                     //   String opcao = in.next();
                      //  opcao = Integer.parseInt(in.nextLine());
			//opcao = Integer.parseInt(in.nextLine());  
                        String opcao   = JOptionPane.showInputDialog("Digite uma opção:");
                        
                         switch(opcao){
                            
            case "1":
               //  String continuar = "S";
                System.out.println("[1]INSERIR CHAMADA PARA METODO CADASTRAR CONTATO");
                inserir(continuar);
              
                break;
            case "2":
                System.out.println("[2]INSERIR CHAMADA PARA O METODO BUSCAR CONTATO");
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
                
//--------------------------------------------------------------------------------
 public void inserir(String continuar){ //, String nome, String numFone
    
                while(continuar.equals("S") ){ 
         int i =0;
         Contatos[] arrayContato = new Contatos[3];
      
        String contatoNome    = JOptionPane.showInputDialog("Digite o nome:");
        String contatoNumFone   = JOptionPane.showInputDialog("Digite o numero do telefone:");
       
        
        arrayContato[i] = new Contatos (contatoNome, contatoNumFone);
        
     
         //System.out.println("Nome" + arrayContato[i].nome + " Fone: " + arrayContato[i].numFone);
          System.out.println("nome - " + arrayContato[i].getNome());
         System.out.println("artista - " + arrayContato[i].getNumFone());
         System.out.println("--------------");
         ++i;
         
      continuar    = JOptionPane.showInputDialog("Deseja continuar adicionando na agenda[ S/N ]?"); 
     // continuar.toUpperCase();
      }
                
    
    }    
         


//-------------------------------------------------------------------------------- 
 public buscar(String nome){
        for (int i=0; i<arrayContato; i++){
            if (contato[i].getNome().equalsIgnoreCase(nome)){
            return contatos[i];
        }
    }
    return null;
    }
//-------------------------------------------------------------------------------- 
           
    }      

  
    
}
