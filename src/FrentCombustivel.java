import javax.swing.JOptionPane;

public class FrentCombustivel {

	public static void main(String[] args) {
		
		int opcao;
		double valor, litros;
		String entrada;
		BombaCobustivel b1 = new BombaCobustivel("Etanol", 5);
		
		do {
			
			entrada = JOptionPane.showInputDialog("Digite sua opcao: \n (1) - abastecer(R$) \n (2) - abastecer(litros) \n (3) - recibo \n (-1) - sair");
			opcao = Integer.parseInt(entrada);// recebo a leitura sempre como String... depois faço a conversão para um número
			
			switch(opcao) {
			case 1:
			
				entrada = JOptionPane.showInputDialog("Digite o valor: ");
				valor = Double.parseDouble(entrada);
				b1.abastecerPorValor(valor);
				break;
			case 2:
				
				entrada = JOptionPane.showInputDialog("Digite os litros: ");
				litros = Double.parseDouble(entrada);
				b1.abastecerPorLitros(litros);
				break;
			case 3:
		
				JOptionPane.showMessageDialog(null,  b1.exibirRecibo());
				break;
			case -1:
			
				JOptionPane.showMessageDialog(null, "*** OBRIGADO PELA PREFERENCIA ***");
				break;
			default:
	
				JOptionPane.showMessageDialog(null, "OPCAO INVALIDA");
			}
			
		} while (opcao != -1);
	}

}
