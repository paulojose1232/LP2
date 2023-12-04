package main;

import java.util.Scanner;

public class Aula02 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int matricula, qtdeH;
		float valorHora, salario;
		System.out.println("Digite a sua matricula: ");
		matricula = leitura.nextInt();
		System.out.println("Digite a quantidade horas trabalhadas: ");
		qtdeH = leitura.nextInt();
		System.out.println("Digite o valor da hora aula: ");
		valorHora = leitura.nextFloat();
		salario = qtdeH * valorHora;
		System.out.printf("O seu salário é R$%.1f", salario);
	}
}