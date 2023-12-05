package principal;

import javax.swing.JOptionPane;

public class LerNotasGUIprof {

	public static void main(String[] args) {
		Float n1, n2;
		String resp;
		resp = JOptionPane.showInputDialog(null, "Informe a nota 1");
		if (!resp.isEmpty()) {
			n1 = Float.parseFloat(resp);
			resp = JOptionPane.showInputDialog(null, "Informe a nota 2");
			if (!resp.isEmpty() ) {
				n2 = Float.parseFloat(resp);
				Float media = (n1+n2)/2;
				if (media >= 7) {
					JOptionPane.showMessageDialog(null, "Aprovado! Parabéns!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null, "Reprovado!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "Sem nota", "Calculando a média", JOptionPane.ERROR_MESSAGE);
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Sem nota!", "Calculando a média", JOptionPane.ERROR_MESSAGE);
		}
	}

}
