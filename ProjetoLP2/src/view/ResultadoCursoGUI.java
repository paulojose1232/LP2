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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javax.swing.JScrollPane;
import java.awt.Color;

import model.Constants;


/**
 * A classe ResultadoCursoGUI representa um objeto que gerencia a interface gráfica do usuário.
 */
public class ResultadoCursoGUI extends JFrame implements Constants{

	/**
	 * O número de série da classe.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * A tabela de resultados.
	 */
	private JTable table;
	
	/**
	 * O modelo de tabela padrão.
	 */
	private DefaultTableModel tableModel;
	
	/**
	 * O painel de rolagem para a tabela de resultados.
	 */
	private JScrollPane scrollPane;

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
					ResultadoCursoGUI frame = new ResultadoCursoGUI();
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
     * Construtor da classe ResultadoCursoGUI.
     */
	public ResultadoCursoGUI() {
		setTitle(tituloTelaResultadoCurso);
		setBounds(100, 100, 711, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		/**
		 * Configura a tabela na interface gráfica para exibição de resultados.
		 * Inicializa o modelo da tabela, adiciona colunas e configura o painel de rolagem.
		 */
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Código");
        tableModel.addColumn("Nome do Curso");
        tableModel.addColumn("Carga Horária");
        tableModel.addColumn("Coordenador");
        tableModel.addColumn("Área");
        
        table = new JTable(tableModel);
        table.setBackground(Color.WHITE);
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 0, 695, 411);
		getContentPane().add(scrollPane);
		
		// Define a localização da janela no centro da tela
		setLocationRelativeTo(null);

	}
	
	/**
	 * Adiciona os dados especificados à tabela.
	 * 
	 * @param codigo O código do curso.
	 * @param nomeCurso O nome do curso.
	 * @param cargaHoraria A carga horária do curso.
	 * @param coordenador O coordenador do curso.
	 * @param selectedOption A área do curso.
	 */
	public void adicionarDadosATabela(String codigo, String nomeCurso, String cargaHoraria, String coordenador, String selectedOption) {
		
		// Adiciona os dados na JTable
        tableModel.addRow(new Object[]{codigo, nomeCurso, cargaHoraria, coordenador, selectedOption});
       
    }
}
