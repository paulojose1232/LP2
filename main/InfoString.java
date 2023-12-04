/*
Faça um programa que, a partir de uma string digitada pelo usuário, 
imprima: 
a) O número de caracteres da string. 
b) A string com todas suas letras em maiúsculo. 
c) O número de vogais da string. 
d) Se a string digitada começa com “A” (ignorando maiúsculas/minúsculas). 
e) Se a string digitada termina com “O” (ignorando maiúsculas/minúsculas). 
f) Se a string é um palíndromo ou não. 
*/
package main;

import java.util.Scanner;
import java.util.Arrays;

public class InfoString {
    public static void main(String[] args) {
        String cadeia, GranCadeia, PeqCadeia, cadeiaSemEspaco;
        boolean comecaA = false, terminaO = false, palindromo = true;
        int tamCadeia, tamCadeiaSemEspaco, numLetras = 0, numVogais = 0, numDigitos = 0;
        char comp1, comp2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a string: ");
        cadeia = sc.nextLine();
        tamCadeia = cadeia.length();
        cadeiaSemEspaco = cadeia.replace(" ", "");
        tamCadeiaSemEspaco = cadeiaSemEspaco.length();
        GranCadeia = cadeia.toUpperCase();
        PeqCadeia = cadeia.toLowerCase();
        for (int i = 0; i < tamCadeia; i++) {
            char letra = PeqCadeia.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                numVogais++;
            }
            if (Character.isLetter(letra)) {
                numLetras++;
            }
            if (Character.isDigit(letra)) {
                numDigitos++;
            }
        }
        comecaA = PeqCadeia.startsWith("a");
        terminaO = PeqCadeia.endsWith("o");
        for (int i = 0; i < tamCadeia/2; i++) {
            comp1 = PeqCadeia.charAt(i);
            comp2 = PeqCadeia.charAt(tamCadeia-1-i);
            if (comp1 != comp2) {
                palindromo = false;
                break;
            }
        }
        System.out.println("Cadeia digitada: " + cadeia);
        System.out.println("Número de caracteres: "+tamCadeia+
        "\nNúmero de caracteres sem espaço: "+tamCadeiaSemEspaco+
        "\nNúmero de letras: "+numLetras+
        "\nNúmero de números: "+numDigitos+
        "\nCadeia em maiúsculo: "+GranCadeia+
        "\nNúmero de vogais da cadeia: "+numVogais+
        "\nCadeia começa com A? "+comecaA+
        "\nCadeia termina com O? "+terminaO+
        "\nCadeia é um palíndromo? "+palindromo);
        sc.close();
    }
}