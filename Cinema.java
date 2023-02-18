import java.util.ArrayList;
public class Cinema {
  
	private ArrayList<Sala> listaSala = new ArrayList<Sala>();
	private ArrayList<Filme> listaF = new ArrayList<Filme>();

	public Cinema() {
	}
  
	public ArrayList<Filme> getListaF() {
		return listaF;
	}
  
	public void setListaF(ArrayList<Filme> listaF) {
		this.listaF = listaF;
	}

	public ArrayList<Sala> getListaSala() {
		return listaSala;
	}

	public void setListaSala(ArrayList<Sala> listaSala) {
		this.listaSala = listaSala;
	}
	
	public void adicionarFilmeCartaz(Filme film) {
		this.listaF.add(film);
		System.out.println("Cartaz:"+ film.getNome());
	}
	
	public void adicionarSala(Sala sala) {
		this.listaSala.add(sala);
	}
}
