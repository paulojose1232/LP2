/*
Crie uma classe para representar os dados de um cliente, contendo código, nome, cpf e
telefone. Implemente nessa classe os construtores e métodos de acesso/modificação
necessários e também para impressão. Implemente um método para verificação se um
dado nome é igual ao do objeto, que será utilizado para busca.
Em seguida, crie uma classe CadastroClientes que apresente o seguinte menu:
1- Cadastrar cliente
2- Buscar cliente pelo nome
3- Exibir dados dos clientes
4- Sair
Considere que possam ser cadastrados até 50 clientes, mas o cadastro deve ser feito de
acordo com a vontade do usuário.
*/

package main;

public class Cliente {
	private int codigo;
	private String nome;
	private String cpf;
	private String telefone;
	
	public Cliente(int codigo, String nome, String cpf, String telefone) {
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
	public Cliente() {
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
    public boolean verifNome(String encontCliente) {
		if (getNome().equalsIgnoreCase(encontCliente)) {
			return true;
		}
		else {
			return false;
		}
    }
    
	public String toString() {
		return "Código: "+this.codigo+"\nNome: "+this.nome+
				"\nCPF: "+this.cpf+"\nTelefone: "+this.telefone+"\n";
	}
}