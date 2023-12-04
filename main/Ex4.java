// Faça um programa que leia um número inteiro positivo N e calcule o
// fatorial desse número.

package main;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int num=0, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número inteiro positivo: ");
        num = sc.nextInt();
        if (num > 0) {
            for(i=num-1; i>0; i--){
                num = num * i;
            }
            System.out.println("O fatorial vale: " +num);
        } else if (num == 0) {
            num = 1;
            System.out.println("O fatorial vale: " +num);
        } else {
            System.out.println("número inválido!");
        }
        sc.close();
    }
}