package business.control;

public abstract class AbstractClass {
	
	public final void treino(){
		aquecimento();
		preparoFisico();
		treinoTecnico();		
	}
	
	abstract void aquecimento();
	abstract void preparoFisico();
	
	void treinoTecnico(){
		System.out.println("");
	}
	
}
