package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblLogin;
	private JTextField textLogin;
	private JLabel lblSenha;
	private JTextField textSenha;
	private JButton btnLimpar;
	private JButton btnEnviar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 329, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setBounds(64, 63, 70, 15);
		contentPane.add(lblLogin);
		
		textLogin = new JTextField();
		textLogin.setBounds(64, 90, 189, 19);
		contentPane.add(textLogin);
		textLogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("SENHA");
		lblSenha.setBounds(64, 135, 70, 15);
		contentPane.add(lblSenha);
		
		textSenha = new JTextField();
		textSenha.setBounds(64, 162, 189, 19);
		contentPane.add(textSenha);
		textSenha.setColumns(10);
		
		JButton btnLimpar = new JButton("LIMPAR");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textLogin.setText(""); //Apaga o texto inserido na caixa de login
				textSenha.setText(""); 
			}
		});
		btnLimpar.setBounds(64, 211, 85, 25);
		contentPane.add(btnLimpar);
		
		JButton btnEnviar = new JButton("ENVIAR");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                String login = textLogin.getText();
                String senha = textSenha.getText();

                if (!login.isEmpty() && !senha.isEmpty()) {
                    dispose();
                    TelaCadastro t2 = new TelaCadastro();
                    t2.setVisible(true);
                }
                else {
                	JOptionPane.showMessageDialog(null, "Login e senha devem ser preenchidos corretamente.", "Erro",
                			JOptionPane.ERROR_MESSAGE);
                }
			}
		});
		btnEnviar.setBounds(168, 211, 85, 25);
		contentPane.add(btnEnviar);
	}
}