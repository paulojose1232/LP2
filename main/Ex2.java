//Faça um programa que leia 10 números inteiros e calcule a média
//desses números.

package main; //nome da pasta em que o arquivo está

import java.util.Scanner;

public class Ex2 { // "nome do arquivo".class
	public static void main (String[] args) { // aqui é main mesmo
		int num=0, i;
		float media, guarda=0;
		Scanner sc = new Scanner(System.in);
		for (i=0; i<=9; i++) {
			System.out.println("Digite 10 números");
			num = sc.nextInt();
			guarda = (guarda + num);
		}
		media = guarda/10;
		System.out.println("A média dos 10 números é:"+media);
		sc.close();
	}
}