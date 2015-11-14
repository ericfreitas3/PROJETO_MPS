package view;

import java.util.Scanner;

import business.control.AddCommand;
import business.control.FachadaServicos;
import business.control.GerenteEntidade;
import business.control.ListCommand;
import business.control.UpdateCommand;

public class CommandTeste {

	public static void main(String[] args) {
		
		  
		GerenteEntidade gerenciarEntidade = new GerenteEntidade();
		
		AddCommand add = new AddCommand(gerenciarEntidade);
		UpdateCommand update = new UpdateCommand(gerenciarEntidade);
		ListCommand list = new ListCommand(gerenciarEntidade);
		
		FachadaServicos fs = new FachadaServicos();
		
		System.err.println("Adicionar \"add\"");
		System.err.println("Atualizar \"att\"");
	    System.err.println("Listar \"lst\"");
	    
	    while(true){
		    Scanner entrada =  new Scanner(System.in);
		    System.out.println("\nDigite sua opcao: \n");
		    String opcao = entrada.nextLine();
								
			switch(opcao){
			case "add":
				fs.storeAndExecute(add);
				break;
			case "att":
				fs.storeAndExecute(update);
				break;
			case "lst":
				fs.storeAndExecute(list);
				break;
			default:
				System.err.println("Digite uma das opções abaixo:");
				 System.err.println("Adicionar \"add\"");
		         System.err.println("Atualizar \"att\"");
		         System.err.println("Listar \"lst\"");
		         //System.exit(-1);
			}
	    }
		
		
		/*fs.takeOrder(add);
		fs.takeOrder(update);
		fs.takeOrder(list);
		
		
		fs.placeOrders();*/
		
	}
	
}
