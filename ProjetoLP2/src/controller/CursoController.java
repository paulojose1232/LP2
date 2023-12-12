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

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.Constants;
import view.CursoGUI;
import view.ResultadoCursoGUI;


/**
 * Controlador para a gestão de cursos em um sistema educacional.
 * Esta classe interage com a interface gráfica {@link CursoGUI} para manipular informações relacionadas a cursos.
 * Implementa a interface {@link Constants} para utilizar constantes específicas.
 */
public class CursoController implements Constants {

    /**
     * Instância da interface gráfica associada a este controlador.
     */
    private CursoGUI cursoGUI;

    /**
     * Construtor da classe CursoController.
     *
     * @param cursoGUI A interface gráfica de cursos associada a este controlador.
     */
    public CursoController(CursoGUI cursoGUI) {
        this.cursoGUI = cursoGUI;
        this.cursoGUI.setController(this);
    }
	
    /**
     * Limpa os campos de entrada na GUI do curso.
     * @param textCodigo O campo de texto para o código do curso.
     * @param textNomeCurso O campo de texto para o nome do curso.
     * @param textCargaHoraria O campo de texto para a carga horária do curso.
     * @param comboBox O campo de combobox para a seleção de um item.
     * @param textCoordenador O campo de texto para o nome do coordenador do curso.
     */
    public void limparCampos(JTextField textCodigo, JTextField textNomeCurso, JTextField textCargaHoraria,
            JComboBox<?> comboBox, JTextField textCoordenador) {
        // Limpa os campos de texto
        textCodigo.setText("");
        textNomeCurso.setText("");
        textCargaHoraria.setText("");
        
        // Verifica se o combobox tem um item selecionado
        if(comboBox.getSelectedIndex() != 0) {
            // Reseta o combobox para a primeira posição se não estiver na posição inicial
            comboBox.setSelectedIndex(0);
        }
        
        // Limpa o campo de texto do coordenador
        textCoordenador.setText("");
    }

	
    /**
     * Método para cadastrar dados de um curso.
     * Obtém os dados da GUI do curso e, se todos os campos estiverem preenchidos,
     * exibe uma mensagem de sucesso, adiciona os dados à tabela na ResultadoCursoGUI
     * e fecha a tela de CadastroGUI, exibindo a ResultadoCursoGUI.
     * Se algum campo estiver vazio, exibe uma mensagem de erro.
     */
    public void cadastrarDados() {
        // Obtém os dados da GUI do curso
        String codigo = cursoGUI.getCodigo();
        String nomeCurso = cursoGUI.getNomeCurso();
        String cargaHoraria = cursoGUI.getCargaHoraria();
        String coordenador = cursoGUI.getCoordenador();
        String selectedOption = cursoGUI.getSelectedOption();

        // Verifica se algum campo está vazio
        if (codigo.isEmpty() || nomeCurso.isEmpty() || cargaHoraria.isEmpty() || coordenador.isEmpty() || selectedOption.isEmpty()) {
            // Exibe mensagem de erro se algum campo estiver vazio
            JOptionPane.showMessageDialog(null, msg_erro_adicionar);
        } else {
            // Exibe mensagem de sucesso
            JOptionPane.showMessageDialog(null, msg_sucesso);

            // Cria uma instância de ResultadoCursoGUI
            ResultadoCursoGUI resultadoCursoGUI = new ResultadoCursoGUI();

            // Adiciona os dados à tabela na ResultadoCursoGUI
            resultadoCursoGUI.adicionarDadosATabela(codigo, nomeCurso, cargaHoraria, coordenador, selectedOption);

            // Fecha a tela de CadastroGUI
            cursoGUI.dispose();

            // Exibe a tela ResultadoCursoGUI com os dados adicionados
            resultadoCursoGUI.setVisible(true);
        }
    }

}
