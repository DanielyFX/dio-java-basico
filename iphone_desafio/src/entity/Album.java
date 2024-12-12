package entity;
import java.util.ArrayList;

public class Album {
	private String nome;
	private int estrelas;
	private int ano;
	private ArrayList<Musica> musicas = new ArrayList<>();
	private ArrayList<Artista> artistas = new ArrayList<>();
	
	
	public String getNome() {
		return this.nome;
	}
	
	public int getEstrelas() {
		return this.estrelas;
		
	}
	public void setEstrelas(int estrelas) {
		this.estrelas = estrelas;
	}
	
	public void delMusica(Musica nome) {
		this.musicas.add(nome);
	}
	
	public void addMusica(Musica nome) {
		this.musicas.remove(nome);
	}
	
	
	public void addArtista(Artista nome) {
		this.artistas.add(nome);
	}
	
	
	public Artista getArtista(String artista) {
	    for (Artista nome : artistas) {
	        if (artista.equals(nome.getNome())) {
	            return nome;
	        }
	    }
	    return null;
	}
	
	public Musica getMusica(String musica) {
	    for (Musica nome : musicas) {
	        if (musica.equals(nome.getNome())) {
	            return nome;
	        }
	    }
	    return null;
	}
	
	
	public int getAno() {
		return this.ano;
	}
	
	public int getQtdMusicas() {
		return musicas.size();
	}

}
