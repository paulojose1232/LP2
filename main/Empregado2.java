// versão professora
package main;

public class Empregado2 {
	private String nome;
	private String sobrenome;
	private double salMensal;
	
	public Empregado2(String nome, String sobrenome, double salMensal) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		if (salMensal<0)
			this.salMensal=0.0;
		else
			this.salMensal = salMensal;
	}
	
	public String getNome() {
		return (nome);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalMensal() {
		return salMensal;
	}

	public void setSalMensal(double salMensal) {
		if (salMensal<0)
			this.salMensal=0.0;
		else
			this.salMensal = salMensal;
	}
	
	public String toString() {
		return ("\nFuncionário:\nNome Completo: "+nome+
				" "+sobrenome+"\nSalário: "+salMensal);
	}
	
}
