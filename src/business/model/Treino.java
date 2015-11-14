package business.model;

import java.util.List;

public class Treino {

	public ModeloDeTreino modeloTreino;
	public List<Exercicio> exercicio;
	public String nomeTreino;
	
	public Treino(){
		super();
	}
	
	public ModeloDeTreino getModeloTreino() {
		return modeloTreino;
	}
	public void setModeloTreino(ModeloDeTreino modeloTreino) {
		this.modeloTreino = modeloTreino;
	}
	public List<Exercicio> getExercicio() {
		return exercicio;
	}
	public void setExercicio(List<Exercicio> exercicio) {
		this.exercicio = exercicio;
	}
	public String getNomeTreino() {
		return nomeTreino;
	}
	public void setNomeTreino(String nomeTreino) {
		this.nomeTreino = nomeTreino;
	}
	
	
	
}
