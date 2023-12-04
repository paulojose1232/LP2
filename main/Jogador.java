//Crie uma classe para representar um jogador de futebol, com os 
//atributos nome, posição, nacionalidade, altura e peso. Crie os métodos de 
//acesso aos atributos (setters e getters) e também um método para imprimir 
//todos os dados do jogador. Além disso, defina um método para calcular o 
//IMC do jogador. Em seguida, crie uma classe com o método main utilizando 
//array de objetos para armazenar os dados de até 40 jogadores, de acordo 
//com o desejo do usuário. Ao final, o programa deve exibir todos os dados 
//dos jogadores, bem como o IMC de cada um deles.

package main;

public class Jogador {
    private String nome;
    private String posicao;
    private String pais;
    private double altura;
    private double peso;

    public Jogador(String nome, String posicao, String pais, double altura, double peso) {
        super();
        this.nome = nome;
        this.posicao = posicao;
        this.pais = pais;
        this.altura = altura;
        this.peso = peso;
    }

    public Jogador() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double calcIMC() {
        double imc;
        imc = (getPeso() / (getAltura()*getAltura()));
        return imc;
        // só isso funciona: return getPeso() / (getAltura()*getAltura());
    }

    public String toString() {
        double jogIMC = calcIMC();
        return ("\nNome: "+this.nome+"\nPosição: "+this.posicao+"\nNacionalidade"
        +this.pais+"\nAltura: "+this.altura+"\nPeso: "+this.peso+
        "\nIMC: "+String.format("%.2f", jogIMC));
        //Para IMC sem formatação de casa decimal, use o codigo abaixo:
        //return ("\nNome: "+this.nome+"\nPosição: "+this.posicao+"\nNacionalidade"
        //+this.pais+"\nAltura: "+this.altura+"\nPeso: "+this.peso+"\nIMC: "+calcIMC());
    }
}