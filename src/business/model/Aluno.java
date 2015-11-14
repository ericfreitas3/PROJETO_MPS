package business.model;

import java.util.List;

public class Aluno extends Pessoa{

	public List<Treino> treino;
	public List<AvaliacaoFisica> avaliacaoFisica;
	public Matricula matricula;

	public Aluno(String nome, String dataNascimento, Endereco endereco,
			int telefone, String sexo, int cPF, Matricula matricula) {
		super(nome, dataNascimento, endereco, telefone, sexo, cPF);
		this.matricula = matricula;
	}
	
	@Override
	void autenticar() {
		System.out.println("Aluno " + nome + " autenticado com sucesso!");
		
	}


	public List<Treino> getTreino() {
		return treino;
	}

	public void setTreino(List<Treino> treino) {
		this.treino = treino;
	}

	public List<AvaliacaoFisica> getAvaliacaoFisica() {
		return avaliacaoFisica;
	}

	public void setAvaliacaoFisica(List<AvaliacaoFisica> avaliacaoFisica) {
		this.avaliacaoFisica = avaliacaoFisica;
	}

	public Matricula getMatricula() {
		return matricula;
	}

	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Aluno [treino=" + treino + ", avaliacaoFisica="
				+ avaliacaoFisica + ", matricula=" + matricula + ", nome="
				+ nome + ", dataNascimento=" + dataNascimento + ", endereco="
				+ endereco + ", telefone=" + telefone + ", sexo=" + sexo
				+ ", CPF=" + CPF + "]";
	}

}
