package apps;

public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	protected void validarConectandoInternet() {
		System.out.println("CONECTADO A INTERNET!");
	}

}
