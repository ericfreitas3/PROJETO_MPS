package business.model;


public class Professor extends Pessoa{

	
	public boolean ativo;

	public Professor(String nome, String dataNascimento, Endereco endereco,
			int telefone, String sexo, int cPF,boolean ativo) {
		super(nome, dataNascimento, endereco, telefone, sexo, cPF);
		this.ativo = ativo;
	}


	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}


	@Override
	void autenticar() {
		System.out.println("Professor " + nome + " autenticado com sucesso!");
		
	}


	@Override
	public String toString() {
		return "Professor [ativo=" + ativo + ", nome=" + nome
				+ ", dataNascimento=" + dataNascimento + ", endereco="
				+ endereco + ", telefone=" + telefone + ", sexo=" + sexo
				+ ", CPF=" + CPF + "]";
	}
	
	

	
}
