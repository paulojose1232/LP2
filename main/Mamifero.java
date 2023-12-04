package main;

import main.Animal;

public class Mamifero extends Animal {
    private String alimento;

    public Mamifero(String nome, float comp, int numPat, String cor, String ambiente, float veloMed, String alimento) {
        super(nome, comp, numPat, cor, ambiente, veloMed);
        this.alimento = alimento;
    }

    public Mamifero() {

    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public void ExibirDadosMamifero() {
        ExibirDados();
        System.out.println("Alimento: "+alimento);
    }

}
