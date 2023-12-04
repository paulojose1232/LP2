package principal;

import javax.swing.JOptionPane;

public class NomeGUI {

	public static void main(String[] args) {
		String nome;
		nome = JOptionPane.showInputDialog(null,"Qual o seu nome?", "Entrada de dados", 1);
		JOptionPane.showMessageDialog(null, "Olá, "+nome, "Boas vindas!", JOptionPane.PLAIN_MESSAGE);

	}

}