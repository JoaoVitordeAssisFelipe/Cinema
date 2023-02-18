public class Pessoa {
	private String nome;
	private int idade;
	private final Bilhete bilhete;

	public Pessoa(String nome,int idade, Bilhete bilhete) {
		this.nome=nome;
		this.idade = idade;
		this.bilhete = bilhete;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Bilhete getBilhete() {
		return bilhete;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
