package testes;
import smartphone.Iphone1;

public class Usuario {
	public static void main(String[] args) {
		Iphone1 iphone = new Iphone1();
		iphone.AdicionarNovaAba();
		iphone.atender();
		iphone.AtualizarPagina();
		iphone.ExibirPagina();
		iphone.iniciarCorreioVoz();
		iphone.pausar();
		iphone.ligar();
	}

}
