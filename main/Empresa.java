// versão colega
package main;

import java.util.Scanner;

public class Empresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		String nome, sobrenome; double salario;
		
		System.out.println("Qual o nome do funcionário: ");
		nome = sc.nextLine();
		System.out.println("Qual o sobrenome do funcionário: ");
		sobrenome = sc.nextLine();
		//sc.next();
		System.out.println("Qual o salario mensal do funcionário: ");
		salario = sc.nextDouble();
		f1.SetNome(nome); f1.SetSobrenome(sobrenome);f1.SetSalario(salario);
		System.out.println("O funcionario " + f1.GetNome() + " " + f1.GetSobrenome() + " recebe R$: " + f1.getSalario() + " mensais sendo " + 12*f1.getSalario() + " anual");
		System.out.println("O aumento de 10% de " +f1.GetNome()+ " É de " + (0.1 * f1.getSalario() + f1.getSalario()) + "ao todo");
	}
}
