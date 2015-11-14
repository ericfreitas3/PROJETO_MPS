package business.control;

import java.util.List;
import java.util.ArrayList;

public class FachadaServicos {
	
	private List<CommandPattern> orderList =  new ArrayList<CommandPattern>();
	
	public void storeAndExecute(CommandPattern comando){
		this.orderList.add(comando);//opcional, funciona como um "log"
		comando.execute();
	}
	
}
