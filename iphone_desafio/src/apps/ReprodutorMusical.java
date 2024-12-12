package apps;
import java.util.ArrayList;
import entity.Album;

public interface ReprodutorMusical {
	public String estado = "inativo";
	public String musicaSelecionada = "";
	public ArrayList<Album> albuns = new ArrayList<>();
	
	public void tocar();
	public void pausar();
	public void selecionarMusica(String musica);

}
