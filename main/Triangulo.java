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

public class Triangulo {
    private int l1;
    private int l2;
    private int l3;

    public Triangulo(int l1, int l2, int l3) {
        super();
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public Triangulo() {
    }

    public int getL1() {
        return l1;
    }

    public void setL1(int l1) {
        this.l1 = l1;
    }

    public int getL2() {
        return l2;
    }

    public void setL2(int l2) {
        this.l2 = l2;
    }

    public int getL3() {
        return l3;
    }

    public void setL3(int l3) {
        this.l3 = l3;
    }

    public String tipoTriangulo() {
        if (getL1() == getL2() && getL2() == getL3()) {
            return "Equilátero";
        }
        else if (getL1() == getL2() || getL2() == getL3() || getL1() == getL3()) {
            return "Isósceles";
        }
        else {
            return "Escaleno";
        }
    }

    public String toString() {
        return ("\nLado A: "+this.l1+"\nLado B: "+this.l2+"\nLado C: "+this.l3+
        "\nTipo do Triângulo: "+tipoTriangulo()+"\n");
    }
}