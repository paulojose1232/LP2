/*
Crie um vetor capaz de armazenar 50 números inteiros. Em seguida faça 
o seu preenchimento automático com os números de 101 a 150, ou seja, 
na posição número 0 ponha 101, na posição 1 ponha o número 102, e 
assim sucessivamente. Em seguida, exiba os valores deste vetor.
*/
package main;

import java.util.Arrays;

public class Vet50 {
    public static void main(String[] args) {
        //int[] vet50int = new int[50]; // na mesma linha
        int vet50int[], num = 101;
        vet50int = new int[50];
        for (int i = 0; i < 50; i++) {
            vet50int[i] = num;
            num++;
        }
        System.out.println("Valores do vetor vet50int: \n"+Arrays.toString(vet50int));
    }
}