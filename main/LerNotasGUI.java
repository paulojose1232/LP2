/*
Faça um programa para ler duas notas, calcular e exibir a média desses
valores.
Utilize caixas de diálogo para obter os valores e para exibir o valor da
média, bem como o resultado do aluno.
Considere que o aluno está aprovado se a média for maior ou igual a 7,0.
Caso contrário, ele está reprovado.
*/
package principal;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LerNotasGUI {

	public static void main(String[] args) {
		String n1, n2;
		n1 = JOptionPane.showInputDialog(null, "Insira a nota 1:", "Entrada de dados", 1);
		n2 = JOptionPane.showInputDialog(null, "Insira a nota 2:", "Entrada de dados", 1);
		double nota1 = Double.parseDouble(n1);
		double nota2 = Double.parseDouble(n2);
		double media = (nota1+nota2)/2;
		if (media >= 7) {
			JOptionPane.showMessageDialog(null, "A sua média é "+media+". Aprovado");
		}
		else {
			JOptionPane.showMessageDialog(null, "A sua média é "+media+". Reprovado");
		}
	}

}