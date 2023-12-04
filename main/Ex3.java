//Faça um programa em Java que leia uma quantidade desconhecida de números 
//e conte quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. 
//A entrada de dados deve terminar quando for lido um número negativo. 
//Ao final, o programa deve exibir o resultado contabilizado em cada intervalo,
//bem como a quantidade total de números lidos.

package main;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int num=0, i, h1=0, h2=0, h3=0, h4=0;
        Scanner sc = new Scanner(System.in);
        while (num>=0)
        {
            System.out.println("Insira números para um número (digite um numero negativo para finalizar): ");
            num = sc.nextInt();
            if (num >= 0 && num <= 25)
            {
                h1++;
            }
            else if (num >= 26 && num <= 50)
            {
                h2++;
            }
            else if (num >= 51 && num <= 75)
            {
                h3++;
            }
            else if (num >= 76 && num <= 100)
            {
                h4++;
            }
        }
        System.out.println("Numeros ente 0 e 25: "+h1);
        System.out.println("Numeros ente 26 e 50: "+h2);
        System.out.println("Numeros ente 51 e 75: "+h3);
        System.out.println("Numeros ente 76 e 100: "+h4);
    }
}