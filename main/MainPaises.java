/*
Escreva uma classe que represente um país. Um país é representado 
através dos atributos: sigla (ex.: BRA), nome, população e a sua dimensão
em Km2
Escreva a classe em Java contendo:
a) Construtor padrão e outro que inicialize a sigla, o nome e a dimensão do país;
b) Métodos de acesso (getter/setter);
c) Um método que retorne a densidade populacional do país;
d) Um método que permita exibir os dados do país.
Em seguida, você deve criar a classe MainPaises que cria uma array de 
países e permite que o usuário cadastre países enquanto desejar. Ao final, 
o programa deve exibir a lista de países cadastrados.
*/
package main;

import main.Paises;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList; // Se fosse criar um array dinâmico, sem saber o tamanho

public class MainPaises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtde = 0;
        System.out.println("Insira a quantidade de países que deseja cadastrar: ");
        qtde = sc.nextInt();
        Paises[] paises = new Paises[qtde];
        for (int i = 0; i < qtde; i++) {
            sc.nextLine(); // Limpa buffer
            System.out.println("País "+(i+1));
            paises[i] = new Paises();
            System.out.println("Insira a sigla do país: ");
            paises[i].setSigla(sc.nextLine());
            System.out.println("Insira o nome do país: ");
            paises[i].setNome(sc.nextLine());
            System.out.println("Insira a população do país: ");
            paises[i].setPop(sc.nextLong());
            System.out.println("Insira a área do país em km²: ");
            paises[i].setDim(sc.nextInt());
        }
        System.out.printf("\nDados dos países: \n");
        for (int i = 0; i < qtde; i++) {
            System.out.println("País "+(i+1)+paises[i].toString());
        }
        sc.close();
    }
}