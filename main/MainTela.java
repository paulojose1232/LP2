package principal;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainTela {

	public static void main(String[] args) {
		JFrame tela = new JFrame("Aula de LP2");
		JLabel texto = new JLabel("Digite seu nome: ");
		JButton btnNome = new JButton("Enviar");
		JTextField txtDisc = new JTextField();
		tela.setLayout(null);
		texto.setBounds(100, 50, 150, 30);
		txtDisc.setBounds(100, 90, 150, 30);
		btnNome.setBounds(100, 130, 150, 30);
		tela.getContentPane().add(texto);
		tela.getContentPane().add(txtDisc);
		tela.getContentPane().add(btnNome);
		tela.setSize(500, 450);
		tela.setLocationRelativeTo(null);
		tela.setVisible(true);
		//tela.setTitle("Aula de LP2");
		
		

	}

}
