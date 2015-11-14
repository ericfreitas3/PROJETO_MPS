package business.control;

public class Pagamento implements Pagar{

	AdapterPagamento adapterPagamento;

	@Override
	public void pagar(String opCartao, double valor) {
		if(opCartao.equalsIgnoreCase("Master") || opCartao.equalsIgnoreCase("Visa")){
			adapterPagamento = new AdapterPagamento(opCartao);
			adapterPagamento.pagar(opCartao, valor);
			
		}else{
			System.out.println("Cartao invalido!");
		}
		
	}

}
