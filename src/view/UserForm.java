package view;

import java.util.Scanner;

import business.model.Usuario;

public class UserForm {

	public String[] entradaDados() {
		Scanner entrada = null;
		String[] loginSenha = null;

		try {
			loginSenha = new String[2];
			entrada = new Scanner(System.in);

			Usuario user = new Usuario();

			System.out.print("Login: ");
			String login = entrada.nextLine();

			user.setLogin(login);

			System.out.print("Senha: ");
			String senha = entrada.nextLine();

			user.setSenha(senha);

			loginSenha[0] = user.getLogin();
			loginSenha[1] = user.getSenha();

			return loginSenha;
		} finally {
			if (entrada != null)
				entrada.close();
		}
	}
}
