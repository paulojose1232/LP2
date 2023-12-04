/*
Considere um sistema para cadastramento de filmes. Trabalharemos com duas classes de modelo: Diretor e Filme. 
Todo filme tem um diretor. Desse modo, você deve definir uma classe Diretor em Java, com 
 as seguintes características:
    Atributos: nome, tempo de experiência (em anos), local de origem.
    Construtores para a classe;
    Métodos getters e setters;
    Método para impressão.
Em seguida, você deve construir uma classe Filme em Java, com as seguintes características:
    A classe deve possuir quatro atributos: titulo, descrição, diretor e duracaoEmMinutos.
    Crie os construtores padrão e completo;
    Crie os métodos de acesso (get e set) para os atributos da classe;
    Crie um método exibirDuracaoEmHoras que converta o valor em minutos para horas e 
    apresente a mensagem “O filme TITULO possui X horas e Y minutos de duração”.
    Faça um método de comparação na classe que retorne os dados do filme caso o título
     do objeto em questão seja igual ao informado;
    Acrescente também na classe um método para exibição dos dados do filme.
Considerando a classe Filme definida, crie uma classe MainFilme que possua um método main de modo que seja possível testar a classe Filme criada na questão anterior.
    Crie um arrayList de Filmes; 
    Cadastre os filmes enquanto o usuário desejar.
    Solicite ao usuário um título para efetuar a busca do filme e retorne o resultado.
    Ao final, para cada filme, você deve exibir o título e a quantidade de horas. 
*/
package main;

import main.Diretor;
import main.Filme;

import java.util.Scanner;
import java.util.ArrayList;

public class MainFilme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Filme> filmes = new ArrayList <Filme>();
        int escolha = 0;

        while (escolha != 3) {
            System.out.println("Escolha uma opção: \n1- Cadastrar filme\n2- Buscar filme\n3- Sair");
            escolha = sc.nextInt();
            sc.nextLine();
            switch (escolha) {
                case 1: {
                    Diretor d = new Diretor();
                    Filme f = new Filme();
                    System.out.println("Insira o título do filme: ");
                    f.setTitulo(sc.nextLine());
                    System.out.println("Insira a descrição do filme: ");
                    f.setDescricao(sc.nextLine());
                    System.out.println("Insira a duração em minutos do filme: ");
                    f.setDuracaoMinutos(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Insira o diretor do filme: ");
                    d.setNome(sc.nextLine());
                    System.out.println("Insira a nacionalidade do diretor: ");
                    d.setLocalOrigem(sc.nextLine());
                    System.out.println("Insira o tempo de experiência em anos do diretor: ");
                    d.setTempoExp(sc.nextInt());
                    f.setDiretor(d);

                    filmes.add(f);
                    break;
                }
                case 2: {
                    int flag = 0;
                    System.out.println("Qual o título do filme?");
                    String tit = sc.nextLine();
                    for(int i = 0; i < filmes.size(); i++) {
                        if (filmes.get(i).encontFilme(tit)) {
                            System.out.println(filmes.get(i).toString());
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 0) {
                        System.out.println("Filme não encontrado.");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Saindo e exibindo os dados de todos os filmes cadastrados");
                    for(int i = 0; i < filmes.size(); i++) {
                        System.out.println("Filme "+(i+1));
                        System.out.println(filmes.get(i).toString());
                    }
                    break;
                }
            }
        }
        sc.close();
    }
    
}