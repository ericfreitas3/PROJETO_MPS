package business.control;


public abstract class TemplateMethodTeste {
	
	final void treino(){
		aquecimento();
		preparoFisico();
		treinoTecnico();		
	}
	
	abstract void aquecimento();
	abstract void preparoFisico();
	
	void treinoTecnico(){
		System.out.println("opa");
	}
	
}