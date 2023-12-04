/*
Crie uma classe Equipamento com os atributos ligado (tipo boolean) 
e nome e com os métodos liga e desliga. O método liga() torna o 
atributo ligado true e o método desliga() torna o atributo ligado false.
Crie também uma classe EquipamentoSonoro que herda as
características de Equipamento e que possui os atributos volume (tipo 
short) que varia de 0 a 10 e stereo (tipo boolean). A classe ainda deve 
possuir métodos getters e setters, além dos métodos ativarMono() e 
ativarStereo(). O método ativarMono() torna o atributo stereo falso e o 
método ativarStereo() torna o atributo stereo verdadeiro. Ao ligar um 
EquipamentoSonoro através do método liga(), seu volume é 
automaticamente ajustado para 5.
Como forma de testar as classes e herança criadas, você deve criar uma 
classe com o método main para criar instâncias de Equipamento e 
EquipamentoSonoro e exibir seus dados
*/
package main;

public class Equipamento {
    private String nome;
    private boolean ligado; //em java, o valor default (padrão) de um boolean é false

    public Equipamento(String nome) {
        this.nome = nome;
        this.ligado = false;
    }

    public Equipamento() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void liga() {
        this.ligado = true;
    }

    public void desliga() {
        this.ligado = false;
    }

    public String toString() {
        return("Nome: "+nome+"\nLigado: "+ligado+"\n");
    }

}
