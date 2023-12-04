package main;

import main.Produto; // Não precisa pois estão no mesmo pacote
import java.util.Scanner;

public class ProdMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); // Criação do objeto de leitura do teclado
        Produto[] produtos; // Declaração do vetor de produtos (apenas referência) 
        int qtde;
        System.out.println("Informe a quantidade de produtos: ");
        qtde = sc.nextInt(); // Leitura da quantidade de produtos
        produtos = new Produto[qtde]; // Aloca memória para o vetor de produtos
        for (int i = 0; i < qtde; i++) {
            produtos[i] = new Produto(); // Aloca memória para cada produto do vetor de produtos 
            System.out.println("informe o codigo do produto: ");
            produtos[i].setCodigo(sc.nextInt()); // Leitura do código do produto i 
            sc.nextLine(); // Limpa o buffer do teclado
            System.out.println("Informe o nome do produto: ");
            produtos[i].setNome(sc.nextLine());
            //sc.nextLine();
            System.out.println("Informe a unidade de medida do produto: ");
            produtos[i].setUnidMedida(sc.nextLine());
            System.out.println("Informe o preço do produto: ");
            produtos[i].setPreco(sc.nextDouble());
            System.out.println("Informe a quantidade em estoque do produto: ");
            produtos[i].setEstoque(sc.nextDouble());
        }
        sc.close();
        System.out.println("\n**** Lista de produtos ****");
        for (int i = 0; i < produtos.length; i++) { // Percorre o vetor de produtos
            System.out.println(produtos[i]); // Imprime o produto i 
        }
    }
}