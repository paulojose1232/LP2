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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.util.ArrayList;
import java.awt.Font;

import model.Constants;
import model.UsuarioLogin;
import model.UsuarioManager;


/**
 * A classe UsuariosGUI representa uma interface gráfica de usuário para exibir uma lista de usuários em uma tabela.
 */
public class UsuariosGUI extends JFrame implements Constants {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable table;
    private JScrollPane scrollPane;
    UsuarioManager usuarioManager = new UsuarioManager();
    ArrayList<UsuarioLogin> usuarios = usuarioManager.getListaUsuarios();

    /**
	 * Inicia a aplicação.
	 * 
	 * @param args Os argumentos da linha de comando.
	 */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UsuariosGUI frame = new UsuariosGUI();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Construtor da classe. Cria e configura os componentes da interface gráfica.
     */
    public UsuariosGUI() {
        // Configurações básicas da janela
        setTitle(tituloUsuarios);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Configuração da tabela e do painel de rolagem
        scrollPane = new JScrollPane();
        scrollPane.setFont(new Font("Arial", Font.PLAIN, 14));
        scrollPane.setBounds(0, 0, 284, 261);
        getContentPane().add(scrollPane);

        // Criação da tabela e configuração da fonte
        table = new JTable();
        table.setFont(new Font("Arial", Font.PLAIN, 14));
        scrollPane.setViewportView(table);
        JTableHeader tableHeader = table.getTableHeader();
        tableHeader.setFont(new Font("Arial", Font.PLAIN, 14));

        // Atualiza a tabela com a lista de usuários
        atualizarTabela(usuarios);

        // Define a localização da janela no centro da tela
        setLocationRelativeTo(null);
    }
	
    /**
     * Atualiza a tabela com a lista de usuários fornecida.
     * @param usuarios A lista de usuários a ser exibida na tabela.
     */
    private void atualizarTabela(ArrayList<UsuarioLogin> usuarios) {
        // Define as colunas da tabela
        String[] colunas = {"Usuário", "Senha"};
        
        // Cria um modelo de tabela padrão sem linhas iniciais
        DefaultTableModel model = new DefaultTableModel(colunas, 0);

        // Preenche o modelo com os dados dos usuários
        for (UsuarioLogin usuario : usuarios) {
            // Oculta a senha antes de adicioná-la ao modelo
            String senhaOculta = ocultarSenha(usuario.getSenhaUsuario());
            String[] linha = {usuario.getLoginUsuario(), senhaOculta};
            model.addRow(linha);
        }

        // Define o modelo na tabela
        table.setModel(model);
    }

    /**
     * Oculta a senha real substituindo cada caractere por '*'.
     * @param senhaReal A senha real a ser ocultada.
     * @return A senha ocultada.
     */
    private String ocultarSenha(String senhaReal) {
        int tamanhoSenha = senhaReal.length();
        // Gera uma string de '*' com o mesmo comprimento da senha
        String mascara = "*".repeat(tamanhoSenha);
        return mascara;
    }

    /**
     * Obtém a tabela utilizada pela interface gráfica.
     * @return A tabela utilizada pela interface gráfica.
     */
    public JTable getTabela() {
        return table;
    }

}
