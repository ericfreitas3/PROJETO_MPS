package business.model;


public abstract class Pessoa {
	
	protected String nome;
	protected String dataNascimento;
	protected Endereco endereco;
	protected int telefone;
	protected String sexo;
	protected int CPF;
	
	public Pessoa(String nome, String dataNascimento, Endereco endereco,
			int telefone, String sexo, int cPF) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.telefone = telefone;
		this.sexo = sexo;
		this.CPF = cPF;
	}
	
	abstract void autenticar();
	public final void validar(){
		autenticar();
	}

}
