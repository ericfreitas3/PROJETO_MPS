package view;

import business.model.Aluno;
import business.model.Endereco;
import business.model.Matricula;
import business.model.Pessoa;
import business.model.Professor;

public class TemplateMethod {

	public static void main(String[] args) {
		
		Pessoa pessoa =  new Professor("Bruno","24.11.1992", new Endereco("A", "castelo branco", 200, 5800000)
		, 9999999, "Masculino", 77777777, true);
		
		pessoa.validar();
		
		
		Pessoa pessoab = new Aluno("Eric","07.10.1991", new Endereco("A", "castelo branco", 200, 5800000)
		, 8888888, "Masculino", 55555555, new Matricula("05.11.2015",112121121, 79.90));
		
		pessoab.validar();
	}

}
