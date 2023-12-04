// com o package main; , para rodar é necessário ir no terminal na pasta
// java e escrever o comando: main.Ex1

package main;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, me, ma;
		int num;
		System.out.println("Informe o numero de identificacao: ");
		num = sc.nextInt();
		System.out.println("informe a prmeira nota: ");
		n1 = sc.nextDouble();
		System.out.println("Informe a segunda nota: ");
		n2 = sc.nextDouble();
		System.out.println("Informe a terceira nota: ");
		n3 = sc.nextDouble();
		System.out.println("Informe a media dos exercicios: ");
		me = sc.nextDouble();	
		sc.close();
		ma = (n1 + 2*n2 + 3*n3 + me)/7;
		System.out.println("\n***Resultado***\n");
		System.out.println("identificação: "+num);
		System.out.println("Nota 1:  "+n1);
		System.out.println("Nota 2:  "+n2);
		System.out.println("Nota 3:  "+n3);
		System.out.println("media exercicios:  "+me);
		System.out.println("media de aproveitamento:  "+ma);
		if (ma>=9) {
			System.out.println("Conceito A");
		}
		else {
			if (ma>=7.5) {
				System.out.println("Conceito B");
			}
			else {
				if (ma>=6) {
					System.out.println("Conceito C");
				}
				else {
					if (ma>=4) {
						System.out.println("Conceito D");
					}
					else {
						System.out.println("Conceito E");
					}
				}
			}
		}
		}
}