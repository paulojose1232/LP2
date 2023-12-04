//Crie uma classe para representar um jogador de futebol, com os 
//atributos nome, posição, nacionalidade, altura e peso. Crie os métodos de 
//acesso aos atributos (setters e getters) e também um método para imprimir 
//todos os dados do jogador. Além disso, defina um método para calcular o 
//IMC do jogador. Em seguida, crie uma classe com o método main utilizando 
//array de objetos para armazenar os dados de até 40 jogadores, de acordo 
//com o desejo do usuário. Ao final, o programa deve exibir todos os dados 
//dos jogadores, bem como o IMC de cada um deles.

package main;

//import main.Jogador;
import java.util.Scanner;
import java.util.Arrays;

public class JogMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Jogador[] jogadores;
        int qtde;
        System.out.println("Informe a quantidade de jogadores, até 40: ");
        qtde = sc.nextInt();
        jogadores = new Jogador[qtde];
        // Jogador[] jogadores; jogadores = new Jogador[qtde]; posso fazer assim também:
        // Jogador[] jogadores = new Jogador[qtde];
        for (int i = 0; i < qtde; i++) {
            jogadores[i] = new Jogador();
            System.out.println("Informe o nome do jogador: ");
            sc.nextLine(); // limpa o buffer do teclado
            jogadores[i].setNome(sc.nextLine());
            System.out.println("informe a posição que joga: ");
            jogadores[i].setPosicao(sc.nextLine());
            System.out.println("Informe a nacionalidade do jogador: ");
            jogadores[i].setPais(sc.nextLine());
            System.out.println("Informe a altura do jogador em metros(use vírgula): ");
            jogadores[i].setAltura(sc.nextDouble());
            System.out.println("Informe o peso do jogador em quilos: ");
            jogadores[i].setPeso(sc.nextDouble());
        }
        sc.close();
        // Poderia fazer também assim: System.out.println(Arrays.toString(jogadores));
        System.out.println("\nDados dos jogadores: ");
        for (int i = 0; i < jogadores.length; i++) {
            System.out.println(jogadores[i]);
        }
    }
}