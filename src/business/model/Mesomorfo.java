package business.model;

import java.util.List;

public class Mesomorfo implements ModeloDeTreino{

	public String descricao;
	public List<Exercicio> exercicio;
	
	@Override
	public void modeloTreino() {
		System.out.println("Treino Mesomorfo");
		
	}
}
