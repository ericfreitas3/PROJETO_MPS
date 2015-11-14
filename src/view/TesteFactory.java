package view;

import business.model.FactoryTreino;
import business.model.ModeloDeTreino;

public class TesteFactory {

	public static void main(String[] args) {
		
		FactoryTreino factoryTreino = new FactoryTreino();
		ModeloDeTreino endo = factoryTreino.getModeloDeTreino("endomorfo");
		endo.modeloTreino();
		ModeloDeTreino ecto = factoryTreino.getModeloDeTreino("ectomorfo");
		ecto.modeloTreino();
		ModeloDeTreino meso = factoryTreino.getModeloDeTreino("mesomorfo");
		meso.modeloTreino();
		
	}
}
