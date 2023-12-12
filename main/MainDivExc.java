package main;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Vector;

public class MainDivExc {

	public static void main(String[] args) {
		int n1, i = 0;
		Vector<Integer> vet = new Vector<>();
		String resposta;
		resposta = JOptionPane.showInputDialog(null, "Informe o número inteiro positivo", "Entrada de dados", JOptionPane.PLAIN_MESSAGE);
		if (!resposta.isEmpty()) {
			n1 = Integer.parseInt(resposta);
            if (n1 > 0) {
                for (int teste = 1; teste <= n1/2; teste++) {
                    if ((n1%teste) == 0) {
                        vet.add(teste);
                    }
                }
                vet.add(n1);
                JOptionPane.showMessageDialog(null, "Os divisores de "+n1+" são: "+vet, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null, "Não foi inserido um número inteiro positivo", "Erro",JOptionPane.ERROR_MESSAGE);
            }
		}
		else {
			JOptionPane.showMessageDialog(null, "Não foi inserido número.", "Erro",JOptionPane.ERROR_MESSAGE);
		}
	}

}
