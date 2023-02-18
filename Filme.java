public class Filme {
  
	private String nome;
	private double duracaoMax;
	private int anoLanca;
	private final Categoria categoria;

	public Filme(String nome, double duracaoMax, int anoLanca, Categoria categoria) {
		this.nome = nome;
		this.duracaoMax = duracaoMax;
		this.anoLanca = anoLanca;
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getDuracaoMax() {
		return duracaoMax;
	}

	public void setDuracaoMax(double duracaoMax) {
		this.duracaoMax = duracaoMax;
	}

	public int getAnoLanca() {
		return anoLanca;
	}

	public void setAnoLanca(int anoLanca) {
		this.anoLanca = anoLanca;
	}

	public Categoria getCategoria() {
		return categoria;
	}
}
