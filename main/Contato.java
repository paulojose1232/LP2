package main;

public class Contato {
	private String nome;
	private String telefone1;
	private String telefone2;
	private String endereco;
	private String relacao;
	
	public Contato(String nome, String telefone1, String telefone2, String endereco, String relacao) {
		this.nome = nome;
		this.telefone1 = telefone1;
		this.telefone2 = telefone2;
		this.endereco = endereco;
		this.relacao = relacao;
	}
	
	public Contato() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getRelacao() {
		return relacao;
	}

	public void setRelacao(String relacao) {
		this.relacao = relacao;
	}
	
	public String toString() {
		return ("\nNome: "+this.nome+"\nTelefone1: "+this.telefone1+
				"\nTelefone2: "+this.telefone2+"\nEndereço: "+this.endereco+
				"\nRelação: "+this.relacao+"\n");
	}
}
