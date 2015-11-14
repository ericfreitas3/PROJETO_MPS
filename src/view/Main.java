package view;

import business.control.LoginException;
import business.control.SenhaException;
import business.control.UserControl;
import business.model.Usuario;

public class Main {

	public static void main(String[] args) {

		String[] loginSenha = new String[2];
		Usuario usuario;
		UserForm form = new UserForm();
		UserControl user = new UserControl();
		//treinoMusculacao t = new treinoMusculacao();

		loginSenha = form.entradaDados();
		usuario = new Usuario(loginSenha[0], loginSenha[1]);
		try {
			user.addUser(usuario);

		} catch (SenhaException | LoginException e) {
			e.printStackTrace();
		}

		System.out.println(user.toString());
		user.removeUser(usuario);
		System.out.println(user.toString());
		

	}

}
