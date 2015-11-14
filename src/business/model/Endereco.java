package business.model;

public class Endereco {
	
	public String rua;
	public String bairro;
	public int numero;
	public int CEP;
	
	
	
	
	public Endereco(String rua, String bairro, int numero, int cEP) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
		CEP = cEP;
	}
	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", bairro=" + bairro + ", numero="
				+ numero + ", CEP=" + CEP + "]";
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCEP() {
		return CEP;
	}
	public void setCEP(int cEP) {
		CEP = cEP;
	}
	

}
