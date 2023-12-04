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

import main.Equipamento;

public class EquipamentoSonoro extends Equipamento {
    private short volume;
    private boolean stereo;

    public EquipamentoSonoro(String nome) {
        super(nome);
        this.volume = (short) 0;
        this.stereo = false;
    }

    public EquipamentoSonoro() {

    }

    public short getVolume() {
        return volume;
    }

    public void setVolume(short volume) {
        if (volume >= 0 && volume <= 10) {
            this.volume = volume;
        }
        else {
            System.out.println("O volume deve estar entre 0 e 10.");
        }
    }

    public void ativarMono() {
        this.stereo = false;
    }

    public void ativarStereo() {
        this.stereo = true;
    }
    
    @Override //em Equipamento.java, temos um método liga(), e aqui em EquipamentoSonoro também temos. Aqui em EquipamentoSonoro, devemos adicionar @Override para que o compilador saiba que estamos usando este método e não o de Equipamento.java
    public void liga() {
        super.liga();
        volume = 5;
    }

    @Override
    public String toString() {
        return(super.toString()+"Volume: "+volume+"\nStéreo: "+stereo+"\n"); //O compilador Java é inteligente o suficiente para entender que, se você simplesmente usar volume dentro de um método da própria classe, ele se refere automaticamente à variável da instância volume, logo não é necessário usar this.volume.
    }

}
