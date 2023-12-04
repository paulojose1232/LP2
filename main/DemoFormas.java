/* 
Para trabalhar as formas e suas propriedades com seus alunos, uma professora deseja automatizar alguns cálculos e você deve ajudá-la nesse processo. 
As formas trabalhadas nesse momento são: quadrado, retângulo e círculo. 
Todas essas formas possuem, em comum, dois tipos de cálculo: da área e do perímetro.  
Para isso você deve desenvolver uma classe, classe abstrata ou interface (você deve escolher a melhor opção) de nome Forma onde serão declarados dois métodos abstratos:
• float calcularArea();
• float cacularPerimetro();
Além disso, você deve definir:
uma classe de nome Retângulo, caracterizada pelos atributos lado e altura, ambos do tipo float. Implemente na classe Retângulo os métodos definidos em Forma, além de métodos para acesso aos dados e impressão.
Uma classe Círculo, caracterizada pelo atributo raio, do tipo float. Implemente na classe Círculo os métodos definidos em Forma e métodos para acesso aos dados e impressão.
Uma classe Quadrado, caracterizada pelo atributo lado. Implemente na classe Quadrado os métodos definidos em Forma e métodos para acesso aos dados e impressão.
Ao final, você deve criar uma classe DemoFormas, em que você deverá, enquanto o usuário desejar, criar um objeto do tipo escolhido pelo usuário e fazer o cálculo correspondente, exibindo o resultado de cada forma criada ao final.
*/
package main;

import main.Forma;
import main.Retangulo;
import main.CirculoF;
import main.Quadrado;

import java.util.Scanner;
import java.util.ArrayList;

public class DemoFormas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Quadrado> quadrados = new ArrayList <Quadrado>();
        ArrayList <CirculoF> circulos = new ArrayList <CirculoF>();
        ArrayList <Retangulo> retangulos = new ArrayList <Retangulo>();
        int escolha = 0;

        while (escolha != 4) {
            System.out.println("Escolha uma opção: ");
            System.out.println("1-criar Círculo, 2-criar Quadrado, 3-criar Retângulo, 4-Sair");
            escolha = sc.nextInt();
            sc.nextLine();
            switch (escolha) {
                case 1: {
                    CirculoF c = new CirculoF();
                    System.out.println("Insira o raio do círculo: ");
                    c.setRaio(sc.nextFloat());

                    circulos.add(c);
                    break;
                }
                case 2: {
                    Quadrado q = new Quadrado();
                    System.out.println("Insira o lado do quadrado: ");
                    q.setLado(sc.nextFloat());

                    quadrados.add(q);
                    break;
                }
                case 3: {
                    Retangulo r = new Retangulo();
                    System.out.println("Insira a base e a altura do retângulo, respectivamente: ");
                    r.setBase(sc.nextFloat());
                    r.setAltura(sc.nextFloat());

                    retangulos.add(r);
                    break;
                }
                case 4: {
                    System.out.println("Saindo e exibindo os dados de cada forma criada");
                    for(int i = 0; i < circulos.size(); i++) {
                        System.out.println("Círculo "+(i+1));
                        System.out.println(circulos.get(i).toString());
                    }
                    for(int i = 0; i < quadrados.size(); i++) {
                        System.out.println("Quadrado "+(i+1));
                        System.out.println(quadrados.get(i).toString());
                    }
                    for(int i = 0; i < retangulos.size(); i++) {
                        System.out.println("Retângulo "+(i+1));
                        System.out.println(retangulos.get(i).toString());
                    }
                    break;
                }
            }
        }

        sc.close();
    }

}