package business.control;

public class Memento {
	private String estado;
	
	public Memento(String estado){
		this.estado = estado;
	}
	
	public String getEstado(){
		return estado;
	}

}
