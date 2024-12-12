package apps;

public class Telegram extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		validarConectandoInternet();
		System.out.println("Enviando mensagem pelo Telegram");
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
		
	}

}
