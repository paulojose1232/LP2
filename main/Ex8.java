// Faça um programa que, enquanto o usuário desejar, leia números
// inteiros. Ao final, o programa deve exibir a quantidade de números pares e
// ímpares informados.

package main;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        int num=0, i, pares=0, impares=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira numeros inteiros, para parar insira um número negativo: ");
        num = sc.nextInt();
        while (num >= 0) {
            if ((num%2) == 0) {
                pares++;
            } else {
                impares++;
            }
            num = sc.nextInt();
        } 
        System.out.println("Números pares = "+pares+", impares = "+impares);
        sc.close();
    }
}