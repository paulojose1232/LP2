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
package model;

/**
 * A classe UsuarioLogin representa um objeto que contém informações de login do usuário.
 */
public class UsuarioLogin {
	
	/**
	 * O login do usuário.
	 */
	private String loginUsuario;
	
	/**
	 * A senha do usuário.
	 */
	private String senhaUsuario;

	/**
	 * Cria um novo objeto UsuarioLogin com login e senha vazios.
	 */
	public UsuarioLogin() {
		
	}
	
	/**
	 * Cria um novo objeto UsuarioLogin com o login e senha especificados.
	 * 
	 * @param loginUsuario O login do usuário.
	 * @param senhaUsuario A senha do usuário.
	 */
	public UsuarioLogin(String loginUsuario, String senhaUsuario) {
		this.loginUsuario = loginUsuario;
		this.senhaUsuario = senhaUsuario;
		
	}

	/**
	 * Retorna o login do usuário.
	 * 
	 * @return O login do usuário.
	 */
	public String getLoginUsuario() {
		return loginUsuario;
	}

	/**
	 * Define o login do usuário.
	 * 
	 * @param loginUsuario O login do usuário.
	 */
	public void setLoginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}

	/**
	 * Retorna a senha do usuário.
	 * 
	 * @return A senha do usuário.
	 */
	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	/**
	 * Define a senha do usuário.
	 * 
	 * @param senhaUsuario A senha do usuário.
	 */
	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}
	
}
