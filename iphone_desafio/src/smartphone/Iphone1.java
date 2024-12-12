package smartphone;
import apps.Internet;
import apps.ReprodutorMusical;
import apps.Telefone;
import entity.Album;

public class Iphone1 implements Internet, ReprodutorMusical, Telefone {

	@Override
	public void ligar() {
		System.out.println("LIGANDO PELO CELULAR");
		
	}
	

	@Override
	public void atender() {
		System.out.println("ATENDENDO O CELULAR");
		
	}
	
	@Override
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO O CORREIO DE VOZ");
		
	}

	@Override
	public void tocar() {
		for(Album album: albuns) {
			if (album.equals(album.getMusica(musicaSelecionada))) {
				System.out.println("MUSICA TOCANDO: " + album.getMusica(musicaSelecionada));
			}
		}
		
	}

	@Override
	public void pausar() {
		System.out.println("PAUSAR MÚSICA");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		musicaSelecionada = musica;
		
	}

	@Override
	public void ExibirPagina() {
		System.out.println("EXIBIR PÁGINA WEB");
		
	}

	@Override
	public void AdicionarNovaAba() {
		System.out.println("ABRINDO UMA NOVA ABA");
		
	}

	@Override
	public void AtualizarPagina() {
		System.out.println("ATUALIZANDO A PÁGINA WEB");
		
	}

}
