package main;

import main.Animal;

public class Peixe extends Animal {
    private String caracteristica;

    public Peixe(String nome, float comp, int numPat, String cor, String ambiente, float veloMed, String caracteristica) {
        super(nome, comp, numPat, cor, ambiente, veloMed);
        this.caracteristica = caracteristica;
    }

    public Peixe() {

    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public void ExibirDadosPeixe() {
        ExibirDados();
        System.out.println("Característica: "+caracteristica);
    }
    
}
