package view;

import business.control.CriadorMemento;
import business.control.HistoricoMemento;

//testando no github

public class TesteMemento {

	public static void main(String[] args) {
		
		CriadorMemento criador = new CriadorMemento();
		HistoricoMemento historico = new HistoricoMemento();
		
		criador.setEstado("Estado 1");
		historico.add(criador.saveEstadoMemento());
		criador.setEstado("Estado 2");
		historico.add(criador.saveEstadoMemento());
		
		criador.setEstado("Estado 3");
		historico.add(criador.saveEstadoMemento());
		
		criador.setEstado("Estado 4");
		historico.add(criador.saveEstadoMemento());
		criador.setEstado("Estado 5");
		historico.add(criador.saveEstadoMemento());
		System.out.println("Estado atual: "+ criador.getEstado());
		
		criador.getEstadoMemento(historico.get(0));
		System.out.println("O primeiro estado: "+ criador.getEstado());
		
		
		criador.getEstadoMemento(historico.get(2));
		System.out.println("O terceiro estado: "+ criador.getEstado());
		
		

		
	}

}
