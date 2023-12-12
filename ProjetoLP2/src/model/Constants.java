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
 * Interface Constants que contém constantes para textos e mensagens utilizados nas telas do sistema.
 */
public interface Constants {
	
	//Tela Login
	public String login = "Login";
	public String senha = "Senha";
	public String tituloTela = "Tela de Login";
	public String buttonLimpar = "Limpar";
	public String buttonEnviar = "Enviar";
	public String UsuarioCadastrado = "Usuários Cadastrados";
	public String msg_erro_logar = "Dados incorretos!";
	public String tituloTelaTransicao = "Escolha de tela";
	public String transicao_tela = "Para qual tela deseja ir: ";
	
	
	//Tela de Adm
	public String tituloTelaAdm = "Tela de Administrador";
	public String buttonAdicionar = "Adicionar";
	public String buttonAtualizar = "Atualizar";
	public String buttonDeletar = "Deletar";
	public String msg_erro_adicionar = "Não há como cadastrar campos vazios";
	public String informa_senha = "Informe a senha";
	public String informa_usuario = "Informe o usuário";
	public String msg_erro_atualizar = "Selecione uma célula para editar.";
	public String msg_erro_duplicado = "Não há como cadastrar dados duplicados";
	
	
	//Tela Curso
	public String tituloTelaCurso = "Cadastro de curso";
	public String codigo = "Código";
	public String nomecurso = "Nome do curso";
	public String cargahoraria = "Carga horária";
	public String areaCurso = "Área do curso";
	public String coordenador = "Coordenador do curso";
	public String buttonCadastrar = "Cadastrar";
	public String msg_sucesso = "Dados cadastrados com sucesso!";
	
	
	//Tela Resultado Curso
	public String tituloTelaResultadoCurso = "Listagem de cursos cadastrados";
	
	
	//Tela Usuarios
		public String tituloUsuarios = "Tabela de usuários";
		
}
