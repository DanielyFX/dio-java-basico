package apps;

public class MSNMessenger extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		validarConectandoInternet();
		System.out.println("Enviando mensagem pelo MSN MEssenger");
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN MEssenger");
		
	}
	

}
