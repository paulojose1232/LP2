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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import model.Constants;
import view.AdmGUI;


/**
 * Controlador para a interface gráfica do administrador (AdmGUI).
 * Gerencia eventos e interações com a GUI do administrador.
 */
public class AdmController implements Constants {
    private AdmGUI admGUI;
    private ArrayList<String> listaNovosUsuarios;

    /**
     * Construtor do controlador, recebe a referência para a AdmGUI.
     * @param admGUI A interface gráfica do administrador.
     */
    public AdmController(AdmGUI admGUI) {
        this.admGUI = admGUI;
        initComponents();
        this.listaNovosUsuarios = new ArrayList<>();
        
        // Configurar o ouvinte de eventos do botão "Adicionar"
        admGUI.setBtnAdicionarListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtém os dados do campo de login e senha
                String novoUsuario = admGUI.getTextNovoUsuario();
                String novaSenha = admGUI.getPasswordField();
                
                // Verifica se os campos estão vazios
                if(novoUsuario.isEmpty() || novaSenha.isEmpty()) {
                    JOptionPane.showMessageDialog(admGUI, msg_erro_adicionar);
                }
                else {
                    // Verifica se o usuário já existe na lista
                    if (listaNovosUsuarios.contains(novoUsuario)) {
                        JOptionPane.showMessageDialog(admGUI, msg_erro_duplicado);
                    }
                    else {
                        listaNovosUsuarios.add(novoUsuario);
                        // Adiciona os dados à tabela na GUI
                        admGUI.adicionarNaTabela(novoUsuario, novaSenha);
                    }
                }
            }
        });
        
        // Configurar o ouvinte de eventos do botão "Atualizar"
        JButton btnAtualizar = admGUI.getBtnAtualizar();
        btnAtualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                atualizarDados();
            }
        });
        
        // Configurar o ouvinte de eventos do botão "Limpar"
        JButton btnLimpar = admGUI.getBtnLimpar();
        btnLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lidarComCliqueBotaoLimpar();
            }
        });
    }

    /**
     * Inicializa os componentes da GUI, configurando o ouvinte de eventos do botão "Deletar".
     */
    private void initComponents() {
        JButton btnDeletar = admGUI.getBtnDeletar();
        btnDeletar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deletarDadosTabela();
            }
        });
    }
    
    /**
     * Método para deletar as linhas selecionadas da tabela na GUI do administrador.
     */
    private void deletarDadosTabela() {
        // Obtém a referência para a tabela na GUI do administrador
        JTable tabela = admGUI.getTabela();
        
        // Obtém o modelo da tabela
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        
        // Obtém as linhas selecionadas na tabela
        int[] linhasSelecionadas = tabela.getSelectedRows();

        // Remove as linhas selecionadas da tabela
        for (int i = linhasSelecionadas.length - 1; i >= 0; i--) {
            model.removeRow(linhasSelecionadas[i]);
        }
    }

    /**
     * Método para atualizar os dados na célula selecionada da tabela na GUI do administrador.
     */
    private void atualizarDados() {
        // Obtém a referência para a tabela na GUI do administrador
        JTable table = admGUI.getTabela();
        
        // Obtém a linha e coluna selecionadas na tabela
        int row = table.getSelectedRow();
        int column = table.getSelectedColumn();

        // Verifica se uma célula válida foi selecionada
        if (row >= 0 && column >= 0) {
            // Verifica se a coluna selecionada é a coluna de senha
            if (column == 1) {
                // Supondo que você obtenha o novo valor a partir de um JOptionPane
                String novaSenha = JOptionPane.showInputDialog(admGUI, informa_senha);

                // Verifica se o usuário forneceu uma nova senha
                if (novaSenha != null) {
                    // Oculta a senha e define o novo valor na célula
                    String senhaOculta = ocultarSenha(novaSenha);
                    table.setValueAt(senhaOculta, row, column);
                }   
            } else {
                // Para outras colunas, supondo que você obtenha o novo valor a partir de um JOptionPane
                Object novoUsuario = JOptionPane.showInputDialog(admGUI, informa_usuario);

                // Verifica se o usuário forneceu um novo valor
                if (novoUsuario != null) {
                    // Define o novo valor na célula
                    table.setValueAt(novoUsuario, row, column);
                }
            }
        } else {
            // Exibe uma mensagem de erro se nenhuma célula válida foi selecionada
            JOptionPane.showMessageDialog(admGUI, msg_erro_atualizar);
        }
    }

    /**
     * Método para ocultar a senha real substituindo cada caractere por '*'.
     * @param senha A senha real a ser ocultada.
     * @return A senha ocultada.
     */
    private String ocultarSenha(String senha) {
        StringBuilder senhaOculta = new StringBuilder();
        for (int i = 0; i < senha.length(); i++) {
            senhaOculta.append("*");
        }
        return senhaOculta.toString();
    }

    /**
     * Método para lidar com o clique no botão "Limpar" na GUI do administrador.
     * Limpa os campos de login e senha na GUI.
     */
    public void lidarComCliqueBotaoLimpar() {
        if (admGUI != null) {
            // Obtém referências para os campos de login e senha na GUI
            JTextField textNovoUsuario = admGUI.getTextLoginField();
            JPasswordField passwordField = new JPasswordField();
            
            // Limpa os campos de login e senha
            if (textNovoUsuario != null) {
                textNovoUsuario.setText("");
            }
            if (passwordField != null) {
            	admGUI.setPasswordFieldText("");// Limpar o campo de senha passwordField
            }
        }
    }

}
