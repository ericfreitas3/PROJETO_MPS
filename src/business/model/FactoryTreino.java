package business.model;

public class FactoryTreino {
	
	public ModeloDeTreino getModeloDeTreino(String tipoTreino){
		if(tipoTreino == null){
			return null;
		}
		if(tipoTreino.equalsIgnoreCase("Ectomorfo")){
			return new Ectomorfo();
		}else if(tipoTreino.equalsIgnoreCase("Endomorfo")){
			return new Endomorfo();
		}else if(tipoTreino.equalsIgnoreCase("Mesomorfo")){
			return new Mesomorfo();
		}
		return null;
	}

}
