// versão colega
package main;

public class Funcionario {
	private String Nome;
	private String Sobrenome;
	private double Salario;
	
	public void Funcionario(String nome, String Sobrenome, double Salario) {
		this.Nome = nome;
		this.Sobrenome = Sobrenome;
		this.Salario = Salario;
	}
	
	public String GetNome() {
		return Nome;
	}
	public String GetSobrenome() {
		return Sobrenome;
	}
	public double getSalario() {
		return Salario;
	}
	
	public void SetNome(String Nome) {
		this.Nome = Nome;
	}
	public void SetSobrenome(String Sobrenome) {
		this.Sobrenome = Sobrenome;
	}
	public void SetSalario(double Salario) {
		if(Salario > 0) {
			this.Salario = Salario;
		}
		else {
			this.Salario = 0.0;
		}
	}
	
}