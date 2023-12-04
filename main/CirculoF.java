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

public class CirculoF implements Forma {
    private float raio;

    public CirculoF(float raio) {
        this.raio = raio;
    }

    public CirculoF() {
        
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float calcularArea() {
        return (float) (Math.PI * Math.pow(raio, 2)); // O resultado de (Math.PI * Math.pow(raio, 2) retorna um double, como calcularArea() é do tipo float, temos que fazer o type cast, conversão de tipo, de double para float e para isso usamos (float)
    }

    public float calcularPerimetro() {
        return (float) (2 * Math.PI * raio); // O resultado de 2*Math.PI*raio retorna um double, como calcularPerimetro() é do tipo float, temos que fazer o type cast, conversão de tipo, de double para float e para isso usamos (float)
    }

    public String toString() {
        return ("\nRaio do círculo: "+raio+"\nÁrea do círculo: "+calcularArea()+
        "\nPerímetro do círculo: "+calcularPerimetro()+"\n");
    }

}
