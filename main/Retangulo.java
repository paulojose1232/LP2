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

public class Retangulo implements Forma {
    private float base;
    private float altura;

    public Retangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public Retangulo() {
        
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float calcularArea() {
        return (base * altura);
    }

    public float calcularPerimetro() {
        return ((2 * base) + (2 * altura));
    }

    public String toString() {
        return("\nBase do retângulo: "+base+"\nAltura do retângulo: "+altura+
        "\nÁrea do retângulo: "+calcularArea()+"\nPerímetro do retângulo: "+calcularPerimetro()+"\n");
    }

}
