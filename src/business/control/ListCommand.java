package business.control;

public class ListCommand implements CommandPattern{
	
	private GerenteEntidade ge;
	
	public ListCommand(GerenteEntidade ge){
		this.ge = ge;
	}

	@Override
	public void execute() {
		ge.buscarEntidade();		
	}

}
