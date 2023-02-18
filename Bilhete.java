public class Bilhete {

	private int numero;
	private String data;

	public Bilhete(int numero, String data) {
		this.numero= numero;
		this.data = data;
	}

	public int getNro() {
		return numero;
	}

	public void setNro(int numero) {
		this.numero = numero;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
