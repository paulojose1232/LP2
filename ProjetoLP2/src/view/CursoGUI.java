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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;

import controller.CursoController;
import model.Constants;


/**
 * A classe CursoGUI representa um objeto que gerencia a interface gráfica do usuário.
 */
public class CursoGUI extends JFrame implements Constants{

	/**
	 * O número de série da classe.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * O campo de texto para o código do curso.
	 */
	private JTextField textCodigo;
	
	/**
	 * O campo de texto para o nome do curso.
	 */
	private JTextField textNomeCurso;
	
	/**
	 * O campo de texto para a carga horária do curso.
	 */
	private JTextField textCargaHoraria;
	
	/**
	 * O campo de texto para o coordenador do curso.
	 */
	private JTextField textCoordenador;
	
	/**
	 * O controlador do curso.
	 */
	private CursoController controller;
	
	/**
	 * A caixa de seleção para a área do curso.
	 */
	private JComboBox<String> comboBox;
	
	/**
	 * O rótulo para o coordenador do curso.
	 */
	private JLabel lblCoordenador;
	
	/**
	 * O rótulo para a área do curso.
	 */
	private JLabel lblAreaCurso;
	
	/**
	 * O rótulo para o código do curso.
	 */
	private JLabel lblCodigo;
	
	/**
	 * O rótulo para o nome do curso.
	 */
	private JLabel lblNomeCurso;
	
	/**
	 * O rótulo para a carga horária do curso.
	 */
	private JLabel lblCargaHoraria;
	
	/**
	 * O botão "Limpar".
	 */
	private JButton btnLimpar;
	
	/**
	 * O botão "Cadastrar".
	 */
	private JButton btnCadastrar;
	
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
					CursoGUI frame = new CursoGUI();
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
     * Construtor da classe CursoGUI.
     */
	public CursoGUI() {
		setTitle(tituloTelaCurso);
		setBounds(100, 100, 300, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		// Configuração dos rótulos e campos de texto
		lblCodigo = new JLabel(codigo);
		lblCodigo.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCodigo.setBounds(48, 25, 188, 14);
		getContentPane().add(lblCodigo);
		
		lblNomeCurso = new JLabel(nomecurso);
		lblNomeCurso.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNomeCurso.setBounds(48, 73, 188, 14);
		getContentPane().add(lblNomeCurso);
		
		lblCargaHoraria = new JLabel(cargahoraria);
		lblCargaHoraria.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCargaHoraria.setBounds(48, 121, 188, 14);
		getContentPane().add(lblCargaHoraria);
		
		textCodigo = new JTextField();
		textCodigo.setFont(new Font("Arial", Font.PLAIN, 14));
		textCodigo.setBounds(48, 41, 188, 22);
		getContentPane().add(textCodigo);
		textCodigo.setColumns(10);
		
		textNomeCurso = new JTextField();
		textNomeCurso.setFont(new Font("Arial", Font.PLAIN, 14));
		textNomeCurso.setColumns(10);
		textNomeCurso.setBounds(48, 89, 188, 22);
		getContentPane().add(textNomeCurso);
		
		textCargaHoraria = new JTextField();
		textCargaHoraria.setFont(new Font("Arial", Font.PLAIN, 14));
		textCargaHoraria.setColumns(10);
		textCargaHoraria.setBounds(48, 137, 188, 22);
		getContentPane().add(textCargaHoraria);
		
		lblAreaCurso = new JLabel(areaCurso);
		lblAreaCurso.setFont(new Font("Arial", Font.PLAIN, 15));
		lblAreaCurso.setBounds(48, 169, 188, 14);
		getContentPane().add(lblAreaCurso);
		
		comboBox = new JComboBox<>();
		comboBox.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox.setBounds(48, 185, 188, 22);
		getContentPane().add(comboBox);
		adicionarItensAoComboBox();
		
		lblCoordenador = new JLabel(coordenador);
		lblCoordenador.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCoordenador.setBounds(48, 217, 188, 14);
		getContentPane().add(lblCoordenador);
		
		textCoordenador = new JTextField();
		textCoordenador.setFont(new Font("Arial", Font.PLAIN, 14));
		textCoordenador.setColumns(10);
		textCoordenador.setBounds(48, 233, 188, 22);
		getContentPane().add(textCoordenador);
		
		// Botão para limpar os campos
		btnLimpar = new JButton(buttonLimpar);
		btnLimpar.setFont(new Font("Arial", Font.PLAIN, 11));
		btnLimpar.setBounds(48, 265, 90, 23);
		getContentPane().add(btnLimpar);
		
		/**
		 * Configura os eventos e ações dos componentes na interface gráfica para cadastrar cursos.
		 */
		controller = new CursoController(this);

		// Adiciona o listener para o botão "Limpar" no controller
		btnLimpar.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        controller.limparCampos(textCodigo, textNomeCurso, textCargaHoraria, comboBox, textCoordenador);
		    }
		});

		// Configuração do botão "Cadastrar"
		btnCadastrar = new JButton(buttonCadastrar);
		btnCadastrar.setFont(new Font("Arial", Font.PLAIN, 11));
		btnCadastrar.setBounds(146, 265, 90, 23);
		getContentPane().add(btnCadastrar);

		// Adiciona o listener para o botão "Cadastrar" no controller
		btnCadastrar.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        if (controller != null) {
		            controller.cadastrarDados();
		        }
		    }
		});		
		
		// Define a localização da janela no centro da tela
		setLocationRelativeTo(null);

	}
	
	/**
	 * Adiciona itens à caixa de seleção (ComboBox) representando as áreas dos cursos.
	 */
	private void adicionarItensAoComboBox() {
	    comboBox.addItem("");
	    comboBox.addItem("Ciências Humanas");
	    comboBox.addItem("Ciências Exatas");
	}

	/**
	 * Obtém o código inserido no campo de texto.
	 * @return O código do curso.
	 */
	public String getCodigo() {
	    return textCodigo.getText();
	}

	/**
	 * Obtém o nome do curso inserido no campo de texto.
	 * @return O nome do curso.
	 */
	public String getNomeCurso() {
	    return textNomeCurso.getText();
	}

	/**
	 * Obtém a carga horária inserida no campo de texto.
	 * @return A carga horária do curso.
	 */
	public String getCargaHoraria() {
	    return textCargaHoraria.getText();
	}

	/**
	 * Obtém o coordenador inserido no campo de texto.
	 * @return O nome do coordenador do curso.
	 */
	public String getCoordenador() {
	    return textCoordenador.getText();
	}

	/**
	 * Obtém a opção selecionada na caixa de seleção representando a área do curso.
	 * @return A área do curso.
	 */
	public String getSelectedOption() {
	    return (String) comboBox.getSelectedItem();
	}

	/**
	 * Define o controlador associado à interface gráfica.
	 * @param controller O controlador da interface gráfica.
	 */
	public void setController(CursoController controller) {
	    this.controller = controller;
	}
	
}
