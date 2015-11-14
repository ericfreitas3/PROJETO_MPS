package business.model;


public class Matricula {
	
	public String dataMatricula;
	public int idMatricula;
	
	public enum situacaoMatricula{
		aberto, fechado, pendente;
		//reformular isso daqui
	}
	public double mensalidade;
	
	public Matricula(String dataMatricula, int idMatricula,
			double mensalidade) {
		super();
		this.dataMatricula = dataMatricula;
		this.idMatricula = idMatricula;
		this.mensalidade = mensalidade;
	}
	
	
	

}
