package business.control;

import java.util.ArrayList;
import java.util.List;

public class HistoricoMemento {
	private List<Memento> mementoList = new ArrayList<Memento>();
	
	public void add(Memento estado){
		mementoList.add(estado);
	}
	
	public Memento get(int index){
		return mementoList.get(index);
	}
	
}
