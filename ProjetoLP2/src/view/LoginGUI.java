/**
 * Universidade do Estado do Rio de Janeiro
 * Instituto de Matemática e Estatística
 * Linguagem de Programação II
 * profa. Priscilla Fonseca de Abreu Braz
 * 
 * Projeto: Implementação de cadastro em um Curso de Nível Superior
 * 
 * @author Carlos Augusto Farias Pereira matrícula - 202020611011
 * @author Matheus Costa Ramos Luiz - matrícula 201720377011
 * @author Paulo José Gomes de Almeida - 202110035611
 */
package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;

import model.Constants;
import model.UsuarioLogin;
import model.UsuarioManager;

import controller.LoginController;


/**
 * A classe LoginGUI representa a interface gráfica de login do sistema.
 * Esta classe estende JFrame e implementa a interface Constants.
 */
public class LoginGUI extends JFrame implements Constants {

    private LoginController loginController;
    
    /**
     * Classe que representa a interface gráfica de login.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Painel principal da interface.
     */
    private JPanel contentPane;

    /**
     * Rótulo para o campo de login.
     */
    private JLabel lblLogin;

    /**
     * Campo de texto para inserção do login.
     */
    private JTextField textLogin;

    /**
     * Rótulo para o campo de senha.
     */
    private JLabel lblSenha;

    /**
     * Botão para limpar os campos.
     */
    private JButton btnLimpar;

    /**
     * Botão para enviar as credenciais de login.
     */
    private JButton btnEnviar;

    /**
     * Campo de senha.
     */
    private JPasswordField passwordField;

    /**
     * Botão para acessar a lista de usuários cadastrados.
     */
    private JButton btnUsuarioCadastrado;

    /**
     * Gerenciador de usuários.
     */
    UsuarioManager usuarioManager = new UsuarioManager();

    /**
     * Lista de usuários carregada do gerenciador.
     */
    ArrayList<UsuarioLogin> usuarios = usuarioManager.getListaUsuarios();


	/**
	 * Launch the application.
	 */
    /**
	 * Inicia a aplicação.
	 * 
	 * @param args Os argumentos da linha de comando.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI frame = new LoginGUI();
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
	/**
     * Construtor da classe LoginGUI.
     */
    public LoginGUI() {
        setTitle(tituloTela);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 329, 264);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Rótulo e campo de texto para o login
        lblLogin = new JLabel(login);
        lblLogin.setFont(new Font("Arial", Font.PLAIN, 15));
        lblLogin.setBounds(64, 35, 70, 15);
        contentPane.add(lblLogin);

        textLogin = new JTextField();
        textLogin.setFont(new Font("Arial", Font.PLAIN, 12));
        textLogin.setBounds(64, 51, 189, 19);
        contentPane.add(textLogin);
        textLogin.setColumns(10);

        // Rótulo e campo de senha
        lblSenha = new JLabel(senha);
        lblSenha.setFont(new Font("Arial", Font.PLAIN, 15));
        lblSenha.setBounds(64, 81, 70, 15);
        contentPane.add(lblSenha);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Arial", Font.PLAIN, 12));
        passwordField.setBounds(64, 96, 189, 19);
        contentPane.add(passwordField);

        // Botão para limpar os campos
        btnLimpar = new JButton(buttonLimpar);
        btnLimpar.setFont(new Font("Arial", Font.PLAIN, 11));
        btnLimpar.setBounds(64, 137, 85, 25);
        contentPane.add(btnLimpar);
		
        // Inicializa o controller passando a referência da própria LoginGUI
        loginController = new LoginController(this);

        // Adiciona o listener para o botão Limpar no controller
        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Chama o método do controller associado ao botão Limpar
                loginController.lidarComCliqueBotaoLimpar();
            }
        });

        // Criação e configuração do botão "Enviar"
        btnEnviar = new JButton(buttonEnviar);
        btnEnviar.setFont(new Font("Arial", Font.PLAIN, 11));
        btnEnviar.setBounds(168, 137, 85, 25);
        contentPane.add(btnEnviar);

        // Adiciona o listener para o botão Enviar no controller
        btnEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtém o login e a senha dos campos de texto
                String login = textLogin.getText();
                String senha = new String(passwordField.getPassword());

                // Chama o método do controller para validar as credenciais
                loginController.validarCredenciais(login, senha);
            }
        });
		
        // Criação e configuração do botão "Usuário Cadastrado"
        btnUsuarioCadastrado = new JButton(UsuarioCadastrado);
        btnUsuarioCadastrado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Chama o método do controller para abrir a tela de usuários cadastrados
                loginController.abrirTelaUsuarios();
            }
        });
        btnUsuarioCadastrado.setFont(new Font("Arial", Font.PLAIN, 11));
        btnUsuarioCadastrado.setBounds(64, 180, 189, 23);
        contentPane.add(btnUsuarioCadastrado);

        // Define a localização da janela no centro da tela
        setLocationRelativeTo(null);
    }
	 
	/**
     * Obtém o campo de texto referente ao login.
     * 
     * @return JTextField - Campo de texto do login
     */
    public JTextField getTextLoginField() {
        return textLogin;
    }

    /**
     * Obtém o campo de senha.
     * 
     * @return JPasswordField - Campo de senha
     */
    public JPasswordField getPasswordField() {
        return passwordField;
    }
    
}
