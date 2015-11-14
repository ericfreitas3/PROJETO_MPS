package view;

import business.control.Pagamento;

public class testeAdapter{

	public static void main(String[] args) {
	
		Pagamento pagamento = new Pagamento();
		
		pagamento.pagar("Master", 2.50);
		pagamento.pagar("Visa",1999.1);

	}
}
