// Crie um novo projeto que defina uma classe para representar um 
//triângulo. Três atributos precisam ser definidos: l1, l2 e l3. Cada atributo 
//representa um dos lados do triângulo, do tipo inteiro. A classe deve 
//implementar construtores (padrão e completo), os métodos de acesso aos 
//atributos (getters e setters), além de definir um método para informar o 
//tipo do triângulo (equilátero, isósceles ou escaleno) e outro para exibir os 
//dados do triângulo. Em seguida, crie uma classe contendo o método main 
//e instancie dois triângulos. Exiba os dados de cada triângulo, bem como o 
//seu tipo.
//OBS.: Equilátero = três lados iguais, Isósceles = 2 lados iguais e escaleno = 
//todos os lados diferentes.

package main;

import main.Triangulo;

public class TriangMain {
    public static void main(String[] args) {
        Triangulo t1, t2, t3;
        t1 = new Triangulo(4, 4, 4);
        t2 = new Triangulo(2, 2, 8);
        t3 = new Triangulo(3, 5, 7);
        System.out.println("Dados do Triângulo 1 "+t1.toString());
        System.out.println("Dados do Triângulo 2 "+t2.toString());
        System.out.println("Dados do Triângulo 3 "+t3.toString());
    }
}