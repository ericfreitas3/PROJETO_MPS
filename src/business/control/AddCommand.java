package business.control;

public class AddCommand implements CommandPattern{
	
	private GerenteEntidade ge;
	
	public AddCommand (GerenteEntidade ge){
		this.ge = ge;
	}
	
	@Override
	public void execute() {
		ge.addEntidade();
		
	}

}
