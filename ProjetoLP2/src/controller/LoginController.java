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
package controller;

import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

import view.LoginGUI;
import view.UsuariosGUI;
import view.AdmGUI;
import view.CursoGUI;
import model.Constants;
import model.UsuarioLogin;
import model.UsuarioManager;


/**
 * Controlador responsável pela lógica da tela de login.
 */
public class LoginController implements Constants {
    private LoginGUI view;
    @SuppressWarnings("unused")
	private UsuariosGUI usuariosGUI;
    private ArrayList<UsuarioLogin> listaUsuarios;

    /**
     * Construtor do controlador de login.
     *
     * @param view Referência para a LoginGUI associada ao controlador
     */
    public LoginController(LoginGUI view) {
        this.view = view;

        // Inicialização da lista de usuários a partir do gerenciador de usuários
        UsuarioManager usuarioManager = new UsuarioManager();
        listaUsuarios = usuarioManager.getListaUsuarios();
    }

    /**
     * Lidar com o clique no botão "Limpar" na tela de login.
     * Limpa os campos de texto de login e senha.
     */
    public void lidarComCliqueBotaoLimpar() {
        if (view != null) {
            JTextField textLogin = view.getTextLoginField();
            JPasswordField passwordField = view.getPasswordField();
            if (textLogin != null) {
                textLogin.setText(null);
            }
            if (passwordField != null) {
                passwordField.setText(null);
            }
        }
    }
 /**
  /**
 * Valida as credenciais inseridas na tela de login.
 * Abre diferentes telas baseadas no tipo de credencial.
 *
 * @param loginDigitado O login fornecido pelo usuário na tentativa de login
 * @param senhaDigitada A senha fornecida pelo usuário na tentativa de login
 */
public void validarCredenciais(String loginDigitado, String senhaDigitada) {
        boolean credenciaisSaoAdm = loginDigitado.equals("admPriscilla") && senhaDigitada.equals("adm1");

        if (credenciaisSaoAdm) {
        	String[] opcoes = { "Tela de Administrador", "Tela de Curso" };
            int escolha = JOptionPane.showOptionDialog(null, transicao_tela, tituloTelaTransicao,
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
            
            if (escolha == 0) {
                abrirTelaAdm();
            } else {
                abrirTelaCurso();
            }
        } else {
            UsuarioLogin usuarioValido = encontrarUsuarioValido(loginDigitado, senhaDigitada);
            if (usuarioValido != null) {
                abrirTelaCurso();
            } else {
                JOptionPane.showMessageDialog(null, msg_erro_logar);
                lidarComCliqueBotaoLimpar();
            }
        }
    }

	/**
	 * Procura por um usuário válido na lista de usuários com base no login e senha fornecidos.
	 *
	 * @param login O nome de usuário fornecido para autenticação.
	 * @param senha A senha fornecida para autenticação.
	 * @return Um objeto UsuarioLogin se a autenticação for bem-sucedida, caso contrário, retorna null.
	 */
	private UsuarioLogin encontrarUsuarioValido(String login, String senha) {
	    for (UsuarioLogin usuario : listaUsuarios) {
	        if (usuario.getLoginUsuario().equals(login) && usuario.getSenhaUsuario().equals(senha)) {
	            return usuario;
	        }
	    }
	    return null;
	}
	
	/**
	 * Abre a tela de administrador após uma autenticação bem-sucedida.
	 * Exibe uma mensagem de sucesso, fecha a tela atual e cria uma nova instância de AdmGUI.
	 */
	private void abrirTelaAdm() {
	    JOptionPane.showMessageDialog(null, "Login bem-sucedido!");
	    view.dispose();
	    AdmGUI admGUI = new AdmGUI(); // Cria uma nova instância de AdmGUI
	    @SuppressWarnings("unused")
		AdmController admController = new AdmController(admGUI); // Cria o controlador passando a nova instância
	    admGUI.setVisible(true);
	}
	
	/**
	 * Abre a tela de curso após uma autenticação bem-sucedida.
	 * Exibe uma mensagem de sucesso, fecha a tela atual e cria uma nova instância de CursoGUI.
	 */
	private void abrirTelaCurso() {
	    JOptionPane.showMessageDialog(null, "Login bem-sucedido!");
	    view.dispose();
	    CursoGUI cursoGUI = new CursoGUI(); // Cria uma nova instância de CursoGUI
	    @SuppressWarnings("unused")
		CursoController cursoController = new CursoController(cursoGUI); // Cria o controlador passando a nova instância
	    cursoGUI.setVisible(true); // Exibe a nova tela CursoGUI
	}
	
	/**
	 * Abre a tela de usuários após uma autenticação bem-sucedida.
	 * Exibe uma mensagem indicando o acesso à tabela de usuários, fecha a tela atual e
	 * cria uma nova instância de UsuariosGUI.
	 */
	public void abrirTelaUsuarios() {
	    JOptionPane.showMessageDialog(null, "Acessando tabela de usuários.");
	    view.dispose();
	    UsuariosGUI usuariosGUI = new UsuariosGUI();
	    usuariosGUI.setVisible(true);
	}

}
