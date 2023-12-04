/*
Faça um programa que, a partir de um texto digitado pelo usuário, 
conte o número de caracteres total e o número de palavras (palavra é 
definida por qualquer sequência de caracteres delimitada por espaços em 
branco) e exiba o resultado. 
*/
package main;

import java.util.Scanner;

public class TotalString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto, textoSE;
        int tamTexto, tamTextoSE, numEsp, numPal;
        System.out.println("Insira o texto: ");
        texto = sc.nextLine();
        tamTexto = texto.length();
        textoSE = texto.replace(" ", "");
        tamTextoSE = textoSE.length();
        numEsp = tamTexto - tamTextoSE;
        numPal = numEsp + 1;
        System.out.println("Número de caracteres: "+tamTexto+"\nNúmero de palavras: "
        +numPal);
        sc.close();
    }
}