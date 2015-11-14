package business.control;

public class AdapterMaster implements AdapterPagar{

	@Override
	public void pagarVisa(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pagarMaster(double valor) {
		System.out.println("Valor pago com master: " + valor);
		
	}

	
	
}
