package business.control;

public class UpdateCommand implements CommandPattern{

	private GerenteEntidade ge;
	
	public UpdateCommand(GerenteEntidade ge){
		this.ge = ge;
	}
	
	@Override
	public void execute() {
		ge.atualizarEntidade();
	}

}
