package conversorMoeda;

import javax.swing.JOptionPane;

public class convertMoeda {

	public static void main(String[] args) {

		String moeda;

		moeda = JOptionPane.showInputDialog(
				"Escolha a opcao de moeda desejada:" + "\n1 - Euro;" + "\n2 - Dolar;" + "\n3 - Peso Arg. ");
		int opcao;
		opcao = Integer.parseInt(moeda);

		if (opcao == 1) {
			String valor;
			valor = JOptionPane.showInputDialog("Digite o valor em reais que deseja converter: ");
			double valorReal = Double.parseDouble(valor);
			final double euro = 3.298;
			double valorConvertido = valorReal / euro;
			String msg;
			msg = " O Valor em Euro e :" + valorConvertido;
			JOptionPane.showInputDialog(null, msg);
		}
		if (opcao == 2) {
			String valor;
			valor = JOptionPane.showInputDialog("Digite o valor em reais que deseja converter: ");
			double valorReal = Double.parseDouble(valor);
			final double dolar = 3.093;
			double valorConvertido = valorReal / dolar;
			String msg;
			msg = " O Valor em Dolar e :" + valorConvertido;
			JOptionPane.showInputDialog(null, msg);
		}
		if (opcao == 3) {
			String valor;
			valor = JOptionPane.showInputDialog("Digite o valor em reais que deseja converter: ");
			double valorReal = Double.parseDouble(valor);
			final double peso = 0.199;
			double valorConvertido = valorReal / peso;
			String msg;
			msg = " O Valor em PesoS e :" + valorConvertido;
			JOptionPane.showInputDialog(null, msg);
		}
	}

}
