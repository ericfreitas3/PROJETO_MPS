package business.control;

import java.util.Map;
import java.util.HashMap;
import business.model.Usuario;

public class UserControl {

	Map<String, Usuario> userMap;
		
	public UserControl() {
		this.userMap = new HashMap<String, Usuario>();
	}
	
	public boolean addUser(Usuario usuario) throws LoginException,
			SenhaException {
		if (loginValidator(usuario.getLogin()) && senhaValidator(usuario.getSenha())){
			userMap.put(usuario.getLogin(), usuario);
		}
		return false;
	}

	public boolean removeUser(Usuario usuario) {
		if (userMap.containsKey(usuario.getLogin())) {
			return userMap.remove(usuario.getLogin(), usuario);
		} else {
			return false;
		}
	}

	public boolean loginValidator(String login) throws LoginException {
		if (login.length() > 20) {
			throw new LoginException(
					"Seu login deve ter menos de 20 caracteres.");
		}
		if (login.isEmpty()) {
			throw new LoginException("Login vazio.");
		}
		if (login.matches(".*\\d.*")) {
			throw new LoginException("Login não deve possuir números.");
		}
		return true;
	}

	public boolean senhaValidator(String senha) throws SenhaException {
		if (senha.length() < 8 || senha.length() > 12) {
			throw new SenhaException(
					"Sua senha deve ter entre 8 e 12 caracteres.");
		}
		if (!senha.matches("^[a-zA-Z]*\\d+[a-zA-Z]*\\d+[a-zA-Z]*$")) {
			throw new SenhaException(
					"Sua senha deve possuir letras, e ao menos dois números.");
		}
		return true;
	}

	@Override
	public String toString() {
		return "\nuserMapControl [" + userMap.values() + "]\n";
	}

}
