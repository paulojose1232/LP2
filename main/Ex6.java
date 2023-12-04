// A prefeitura do Rio de Janeiro abriu uma linha de crédito para os seus
// funcionários. O valor máximo da prestação não poderá ultrapassar 30% do
// salário bruto. Faça um programa em Java que permita entrar com o salário
// bruto e o valor da prestação e informe se o empréstimo pode ou não ser
// concedido.

package main;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int salario=0, prestacao=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o seu salário: ");
        salario = sc.nextInt();
        System.out.println("Insira a prestação: ");
        prestacao = sc.nextInt();
        if (prestacao<=salario*0.3) {
            System.out.println("O empréstimo pode ser concedido.");
        }
        else {
            System.out.println("O empréstimo não pode ser concedido.");
        }
    sc.close();
    }
}