package business.control;

public class SenhaException extends Exception {

	public SenhaException(String msg) {
		super(msg);
	}

	public SenhaException() {
		super("Erro inesperado no login!");
	}

}
