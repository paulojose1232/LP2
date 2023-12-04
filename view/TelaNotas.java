package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaNotas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblControleDeNotas;
	private JLabel lblNota;
	private JTextField textNota1;
	private JLabel lblNota_1;
	private JTextField textNota2;
	private JButton btnMdia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaNotas frame = new TelaNotas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaNotas() {
		setTitle("Notas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 222, 243);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblControleDeNotas = new JLabel("CONTROLE DE NOTAS");
		lblControleDeNotas.setBounds(27, 12, 158, 15);
		contentPane.add(lblControleDeNotas);
		
		JLabel lblNota = new JLabel("Nota 1");
		lblNota.setBounds(12, 52, 70, 15);
		contentPane.add(lblNota);
		
		textNota1 = new JTextField();
		textNota1.setBounds(12, 79, 114, 19);
		contentPane.add(textNota1);
		textNota1.setColumns(10);
		
		JLabel lblNota_1 = new JLabel("Nota 2");
		lblNota_1.setBounds(12, 110, 70, 15);
		contentPane.add(lblNota_1);
		
		textNota2 = new JTextField();
		textNota2.setBounds(12, 137, 114, 19);
		contentPane.add(textNota2);
		textNota2.setColumns(10);
		
		JButton btnMdia = new JButton("Média");
		btnMdia.setBounds(56, 176, 117, 25);
		contentPane.add(btnMdia);
	}

}
