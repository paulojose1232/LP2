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
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionEvent;
import java.awt.Font;

import controller.AdmController;
import model.Constants;
import model.UsuarioLogin;
import model.UsuarioManager;


/**
 * A classe AdmGUI representa um objeto que gerencia a interface gráfica do usuário.
 */
public class AdmGUI extends JFrame implements Constants {

	/**
	 * O número de série da classe.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * A tabela de usuários.
	 */
	private JTable table;
	
	/**
	 * O campo de texto para o novo usuário.
	 */
	private JTextField textNovoUsuario;
	
	/**
	 * O botão para adicionar um novo usuário.
	 */
	private JButton btnAdicionar;
	
	/**
	 * O botão para atualizar a lista de usuários.
	 */
	private JButton btnAtualizar;
	
	/**
	 * O botão para deletar um usuário.
	 */
	private JButton btnDeletar;
	
	/**
	 * O botão para limpar a lista de usuários.
	 */
	private JButton btnLimpar;
	
	/**
	 * O painel de rolagem para a tabela de usuários.
	 */
	private JScrollPane scrollPane;
	
	/**
	 * O gerenciador de usuários.
	 */
	private UsuarioManager usuarioManager;
	
	/**
	 * O rótulo para o novo usuário.
	 */
	private JLabel lblNovoUsuario;
	
	/**
	 * O rótulo para a nova senha.
	 */
	private JLabel lblNovaSenha;
	
	/**
	 * O campo de senha para a nova senha.
	 */
	private JPasswordField passwordField;
	
	/**
	 * Cria um novo objeto AdmGUI e inicializa a interface gráfica do usuário.
	 */
	 public AdmGUI() {
	        initializeGUI();
	        usuarioManager = new UsuarioManager();
	        ArrayList<UsuarioLogin> usuarios = usuarioManager.getListaUsuarios();
	        atualizarTabela(usuarios);
	    }

	/**
	 * Inicia a aplicação.
	 * 
	 * @param args Os argumentos da linha de comando.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdmGUI frame = new AdmGUI();
					frame.setVisible(true);
					@SuppressWarnings("unused")
					AdmController controller = new AdmController(frame);
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
	 * Inicializa a interface gráfica do usuário.
	 */
	private void initializeGUI() {
		setTitle(tituloTelaAdm);
		setBounds(100, 100, 400, 514);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 210, 320, 250);
		getContentPane().add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		
		lblNovoUsuario = new JLabel(login);
		lblNovoUsuario.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNovoUsuario.setBounds(62, 29, 117, 30);
		getContentPane().add(lblNovoUsuario);
		
		lblNovaSenha = new JLabel(senha);
		lblNovaSenha.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNovaSenha.setBounds(213, 29, 117, 30);
		getContentPane().add(lblNovaSenha);
		
		textNovoUsuario = new JTextField();
		textNovoUsuario.setFont(new Font("Arial", Font.PLAIN, 14));
		textNovoUsuario.setBounds(62, 56, 117, 26);
		getContentPane().add(textNovoUsuario);
		textNovoUsuario.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Arial", Font.PLAIN, 14));
		passwordField.setBounds(213, 56, 117, 26);
		getContentPane().add(passwordField);
		
		// Criação e configuração do botão "Adicionar"
		btnAdicionar = new JButton(buttonAdicionar);
		btnAdicionar.setFont(new Font("Arial", Font.PLAIN, 11));
		btnAdicionar.setBounds(62, 104, 117, 30);
		getContentPane().add(btnAdicionar);
		btnAdicionar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Lógica a ser executada quando o botão "Adicionar" for pressionado
		    }
		});

		// Criação e configuração do botão "Atualizar"
		btnAtualizar = new JButton(buttonAtualizar);
		btnAtualizar.setFont(new Font("Arial", Font.PLAIN, 11));
		btnAtualizar.setBounds(213, 104, 117, 30);
		getContentPane().add(btnAtualizar);
		btnAtualizar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Lógica a ser executada quando o botão "Atualizar" for pressionado
		    }
		});

		// Criação e configuração do botão "Deletar"
		btnDeletar = new JButton(buttonDeletar);
		btnDeletar.setFont(new Font("Arial", Font.PLAIN, 11));
		btnDeletar.setBounds(213, 150, 117, 30);
		getContentPane().add(btnDeletar);
		btnDeletar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Lógica a ser executada quando o botão "Deletar" for pressionado
		    }
		});

		// Criação e configuração do botão "Limpar"
		btnLimpar = new JButton(buttonLimpar);
		btnLimpar.setFont(new Font("Arial", Font.PLAIN, 11));
		btnLimpar.setBounds(62, 150, 117, 30);
		getContentPane().add(btnLimpar);
		btnLimpar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Lógica a ser executada quando o botão "Limpar" for pressionado
		    }
		});
		
	}
	
	/**
	 * Atualiza a tabela de usuários com a lista de usuários especificada.
	 * 
	 * @param usuarios A lista de usuários a ser exibida na tabela.
	 */
	private void atualizarTabela(ArrayList<UsuarioLogin> usuarios) {
	    String[] colunas = {"Usuário", "Senha"};
	    DefaultTableModel model = new DefaultTableModel(colunas, 0);

	    for (UsuarioLogin usuario : usuarios) {
	       String senhaOculta = ocultarSenha(usuario.getSenhaUsuario()); // Método para ocultar a senha real
	       String[] linha = {usuario.getLoginUsuario(), senhaOculta};
	       model.addRow(linha);
	    }

	    table.setModel(model);
	}

	/**
	 * Retorna uma string com a mesma quantidade de caracteres da senha real, mas com asteriscos no lugar dos caracteres.
	 * 
	 * @param senhaReal A senha real a ser ocultada.
	 * @return A senha ocultada.
	 */
	private String ocultarSenha(String senhaReal) {
	    int tamanhoSenha = senhaReal.length();
	    String mascara = "*".repeat(tamanhoSenha); // Cria uma máscara de '*' do mesmo tamanho da senha
	    return mascara;
	}

	/**
	 * Configura o ouvinte de eventos do botão "Adicionar".
	 * 
	 * @param listener O ouvinte de eventos a ser configurado.
	 */
	public void setBtnAdicionarListener(ActionListener listener) {
	    btnAdicionar.addActionListener(listener);
	}

	/**
	 * Obtém o texto do campo de usuário.
	 * @return O texto do campo de usuário.
	 */
	public String getTextNovoUsuario() {
	    return textNovoUsuario.getText();
	}

	/**
	 * Obtém o texto do campo de senha.
	 * @return O texto do campo de senha.
	 */
	public String getPasswordField() {
	    return new String(passwordField.getPassword());
	}

	/**
	 * Adiciona os dados à tabela na GUI.
	 * @param novoUsuario O novo usuário a ser adicionado.
	 * @param novaSenha A nova senha a ser adicionada.
	 */
	public void adicionarNaTabela(String novoUsuario, String novaSenha) {
	    DefaultTableModel model = (DefaultTableModel) table.getModel();
	    String senhaOculta = ocultarSenha(novaSenha); // Método para ocultar a senha

	    // Adiciona uma nova linha com o novo usuário e senha
	    model.addRow(new Object[]{novoUsuario, senhaOculta});
	}

	/**
	 * Obtém a referência da tabela na GUI.
	 * @return A referência da tabela.
	 */
	public JTable getTabela() {
	    return table;
	}

	/**
	 * Obtém a referência do botão "Deletar" na GUI.
	 * @return A referência do botão "Deletar".
	 */
	public JButton getBtnDeletar() {
	    return btnDeletar;
	}

	/**
	 * Obtém a referência do botão "Atualizar" na GUI.
	 * @return A referência do botão "Atualizar".
	 */
	public JButton getBtnAtualizar() {
	    return btnAtualizar;
	}

	/**
	 * Obtém a referência do botão "Limpar" na GUI.
	 * @return A referência do botão "Limpar".
	 */
	public JButton getBtnLimpar() {
	    return btnLimpar;
	}

	/**
	 * Obtém a referência do campo de texto de login na GUI.
	 * @return A referência do campo de texto de login.
	 */
	public JTextField getTextLoginField() {
	    return textNovoUsuario;
	}

	/**
	 * Define o texto do campo de senha.
	 * @param text O texto a ser definido no campo de senha.
	 */
	public void setPasswordFieldText(String text) {
	    passwordField.setText(text); // Define o texto do campo de senha
	}
    
  // criei esse pois uso o getpasswordfield para add
//    public void limparCampoSenha() {
//        if (passwordField != null) {
//            passwordField.setText("");
//        }
//    }
}
