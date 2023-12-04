// Faça um programa que leia 15 números inteiros e exiba na tela qual
// é o maior dos números lidos.

package main; 

import java.util.Scanner;

public class Ex7 {
	public static void main (String[] args) { 
		int num=0, i, guarda=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 15 números inteiros");
        num = sc.nextInt();
        guarda = num; 
		for (i=0; i<=13; i++) {
			num = sc.nextInt();  
            if (guarda < num) {
                guarda = num;
            }
		}
		System.out.println("O maior numero lido é: "+guarda);
		sc.close();
	}
}