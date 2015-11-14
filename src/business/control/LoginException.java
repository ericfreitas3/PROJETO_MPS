package business.control;

public class LoginException extends Exception{


	public LoginException(String msg) {
		super(msg);
	}

	public LoginException() {
		super("Erro inesperado no login!");
	}

}
