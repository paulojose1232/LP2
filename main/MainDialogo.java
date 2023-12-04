package principal;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MainDialogo {

	public static void main(String[] args) {
		String[] op = {"Atrasado", "Em dia", "Adiantado"};
		int resp = JOptionPane.showOptionDialog(null, "Como você se considera com relação às atividades de LP2?", "LP2", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, op, "1");
			if (resp == 0) {
				JOptionPane.showMessageDialog(null, "Não desanime! Vamos voltar a fazer as atividades?");
			}
			else {
				if (resp == 1) {
					JOptionPane.showMessageDialog(null, "Muito bom! Continue se dedicando!");
				}
				else {
					if (resp == 2) {
						JOptionPane.showMessageDialog(null, "Excelente! Parabéns!");
					}
					else {
						JOptionPane.showMessageDialog(null, "Você não respondeu!");
					}
				}
			}
	}

}