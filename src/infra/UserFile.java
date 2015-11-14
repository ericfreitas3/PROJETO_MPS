package infra;

import business.model.Usuario;

public class UserFile {

	//saveUser();
	//loadUser();
	
	public void saveUser(Usuario user){
		System.out.println("Usuario Salvo");
	};
	
	public Usuario loadUser(Usuario user){
		return user;
	};
}
