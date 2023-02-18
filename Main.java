public class Main {

	public static void main(String[] args) {
		
    Cinema cine = new Cinema();

		Categoria terror = Categoria.TERROR;
		Categoria aventura = Categoria.AVENTURA;
		Categoria drama = Categoria.DRAMA;

		Filme filime = new Filme("Orientação a objeto", 180.0, 2023, terror);
		Filme filime2 = new Filme("filme2", 0.0, 1, aventura);
		Filme filime3 = new Filme("filme3", 0.0, 1, drama);

		cine.adicionarFilmeCartaz(filime);
		cine.adicionarFilmeCartaz(filime2);
		cine.adicionarFilmeCartaz(filime3);
		
		Sala sla = new Sala(7, 50, filime);

		Bilhete b1 = new Bilhete(1, "");
		Bilhete b2 = new Bilhete(2, "");
		Bilhete b3 = new Bilhete(3, "");

		Pessoa p1 = new Pessoa("Douglas",18, b1);
		Pessoa p2 = new Pessoa("Cleitão",19, b2);
		Pessoa p3 = new Pessoa("Eduardão",15, b3);
		
		sla.adicionarPessoa(p1, filime);
		sla.adicionarPessoa(p2, filime);
		sla.adicionarPessoa(p3, filime);
		
		System.out.println(sla.getListaP().get(0).getNome());
		System.out.println(sla.getListaP().get(1).getNome());
	}
}
