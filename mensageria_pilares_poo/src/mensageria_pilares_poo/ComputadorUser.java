package mensageria_pilares_poo;

import apps.FacebookMessager;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorUser {
	
	public static void main(String[] args) {
		String tipoServico = "TLG";
		ServicoMensagemInstantanea msg;
		
		if (tipoServico.equals("MSN"))
			msg = new MSNMessenger();
		else if(tipoServico.equals("TLG"))
			msg = new Telegram();
		else
			msg = new FacebookMessager();
		
		msg.enviarMensagem();
		msg.receberMensagem();

	}
	
}
