package apps;

public class FacebookMessager extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		validarConectandoInternet();
		System.out.println("Enviando mensagem pelo Facebook");	
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook");
		
	}
	

}
