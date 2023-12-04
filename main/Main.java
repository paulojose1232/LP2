package main;

import main.Data;
import main.Hora;

public class Main {
    public static void main(String[] args) {
        Data dt1, dt2;
        Hora h1;
        Compromisso comp1, comp2;

        dt1 = new Data(12, 10, 2023);
        h1 = new Hora(10, 15, 10);
        dt2 = new Data(15, 10, 2022);
        comp1 = new Compromisso(dt1, h1, "Aula LP2");
        comp2 = new Compromisso(23, 11, 2023, 15, 0, 0, "Reunião projeto final");
        if (dt1.comparaData(dt2)) {
            System.out.println("Datas iguais");
        }
        else {
            System.out.println("Datas diferentes");
        }
        System.out.println("Data 1: "+dt1);
        System.out.println("Hora 1: "+h1);

        System.out.println("\nCompromisso 1: "+comp1);
        System.out.println("\nCompromisso 2: "+comp2);
    }
}