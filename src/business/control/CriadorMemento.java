package business.control;

public class CriadorMemento {
	private String estado;
	
	public void setEstado(String estado){
		this.estado = estado;
	}
	
	public String getEstado(){
		return estado;
	}
	
	public Memento saveEstadoMemento(){
		return new Memento(estado);
	}
	
	public void getEstadoMemento(Memento memento){
		estado = memento.getEstado();
	}
	
}
