package business.control;

public class AdapterPagamento implements Pagar{

	AdapterPagar adapterPagar;
	
	public AdapterPagamento(String opCartao){
		if(opCartao.equalsIgnoreCase("Master")){
			adapterPagar = new AdapterMaster();
		}else if(opCartao.equalsIgnoreCase("Visa")){
			adapterPagar = new AdapterVisa();
		}
	}
	
	@Override
	public void pagar(String opCartao, double valor) {
		if(opCartao.equalsIgnoreCase("Master")){
			adapterPagar.pagarMaster(valor);
		}else if(opCartao.equalsIgnoreCase("Visa")){
			adapterPagar.pagarVisa(valor);
		}
		
	}
	
}
