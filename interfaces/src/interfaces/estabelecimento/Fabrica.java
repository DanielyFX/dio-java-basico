package interfaces.estabelecimento;
import interfaces.equipamentos.impressora.Impressora;
import interfaces.equipamentos.impressora.DeskJet;
import interfaces.equipamentos.impressora.LaserJet;
import interfaces.equipamentos.digitalizadora.Digitalizadora;
import interfaces.equipamentos.digitalizadora.Scanner;
import interfaces.equipamentos.copiadora.Copiadora;
import interfaces.equipamentos.multifuncional.EquipamentoMultiFuncional;

public class Fabrica {
	public static void main(String[] args) {
		EquipamentoMultiFuncional em = new EquipamentoMultiFuncional();
		Impressora impressora = em;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
		
		Scanner scanner = new Scanner();
		Digitalizadora digitalizadora2 = scanner;
		digitalizadora2.digitalizar();
	}
}
