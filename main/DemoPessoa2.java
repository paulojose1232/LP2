package main;

import main.ChefeDepartamento;
import main.Data;
import main.Funcionario2;
import main.Pessoa;

public class DemoPessoa2 {
    public static void main(String[] args) {
        Data dt = new Data(2,5,1945);
        Funcionario2 f1;
        Funcionario2 f2;
        f1 = new Funcionario2("Marcos Lins","2256325458",dt,new
        Data(15,3,2000),3000);
        f2 = new ChefeDepartamento("Ana Luiza", "111526666", dt, new //Cria um ChefeDepartamento do zero, foi necessário implementar um novo construtor na classe ChefeDepartamento
        Data(20,10,2015), 5000,"Financeiro", new Data(22,9,2020));
        System.out.println(f1.getBonificacao());
        System.out.println(f2.getBonificacao());
    }
}