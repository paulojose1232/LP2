// Faça um programa que lê um valor n inteiro e positivo e que calcula a
// seguinte soma:
// S = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n

package main;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int num=0;
        float guarda=0, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número");
        num = sc.nextInt();
        if (num >= 0) {
            for (i=num; i>0; i--) {
                guarda = guarda + 1/i;
            }
            System.out.printf("A soma vale: %.4f\n", guarda); // para imprimir casa decimais especificas
                                                            // usa-se printf e %.f
        }
        else {
            System.out.println("número inválido!");
        }
        sc.close();
    }
}