package main;

import main.Data;
import main.Pessoa;
import main.Funcionario2;
import main.ChefeDepartamento;

public class DemoPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Beatriz de Souza", "22145236598", new Data(3, 10, 1980));
        Funcionario2 f1 = new Funcionario2("João Carlos", "11542365891", 
        new Data(5, 8, 1960), new Data(15, 10, 2000), 2500f); //2500f, o f serve para fazer com que o número 2500 seja tratado como um float, apesar de ter sido declarado como double.
        Funcionario2 f2 = new Funcionario2("Dilson", "12343215312", new Data(14, 7, 2002), new Data(25, 6, 2020), 4000f);
        Funcionario2 f3 = new Funcionario2(p1, new Data(9, 7, 2022), 3000f); //criando um objeto da classe Funcionario. Isso é uma instância da classe Funcionario
        ChefeDepartamento c1 = new ChefeDepartamento(f2, "Informatica", new Data(30, 9, 2023));
        System.out.println(p1+"\n");
        System.out.println(f3+"\n");
        System.out.println(f1+"\n");
        System.out.println(f2+"\n");
        System.out.println(c1+"\n");
    }
}