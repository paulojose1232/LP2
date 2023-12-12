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

import java.util.ArrayList;


/**
 * A classe UsuarioManager representa um objeto que gerencia usuários.
 */
public class UsuarioManager {
	
	/**
	 * A lista de usuários gerenciados.
	 */
    private ArrayList<UsuarioLogin> listaUsuarios;

	/**
	 * Cria um novo objeto UsuarioManager e inicializa a lista de usuários.
	 */
    public UsuarioManager() {
        listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new UsuarioLogin("admPriscilla", "adm1"));
        listaUsuarios.add(new UsuarioLogin("admMatheus", "adm2"));
        listaUsuarios.add(new UsuarioLogin("paulo", "senha1"));
    }

	/**
	 * Retorna a lista de usuários gerenciados.
	 * 
	 * @return A lista de usuários gerenciados.
	 */
    public ArrayList<UsuarioLogin> getListaUsuarios() {
        return listaUsuarios;
    }
    
}
