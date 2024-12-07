package smartphone;
import apps.Internet;
import apps.ReprodutorMusical;
import apps.Telefone;

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
		System.out.println("TOCANDO MÚSICA");
		
	}

	@Override
	public void pausar() {
		System.out.println("PAUSAR MÚSICA");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("MUSICA SELECIONADA: " + musica);
		
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
