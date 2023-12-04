package main;

import java.util.Scanner;

public class Aula03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;
		System.out.println("Informe a sua idade: ");
		idade = sc.nextInt();
		//System.out.println("Voce tem "+idade+" anos.");
		if (idade<0) {
			System.out.println("Idade Inválida!");
		}
		else {
			System.out.println("voce tem "+idade+" anos");
			if(idade>18) {
				System.out.println("Voce é um adulto!");
			}
			else {
				if(idade>12) {
					System.out.println("Voce é um adolesecente!");
				}
				else {
					System.out.println("voce é uma criança!");
				}
			}
		}
	}
}