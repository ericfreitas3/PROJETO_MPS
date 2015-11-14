package business.control;

public class AdapterVisa implements AdapterPagar{

	@Override
	public void pagarVisa(double valor) {
		System.out.println("Valor pago com visa: " + valor);
		
	}

	@Override
	public void pagarMaster(double valor) {
		// TODO Auto-generated method stub
		
	}



}
