package main;

import java.util.Scanner;
//import main.Pessoa2; não é necessário importar, pois PessoaFisica ou PessoaJuridica usam a classe abstrata Pessoa2 e DemoPessoa3 não utiliza algo de Pessoa2
import main.Data;
import main.PessoaFisica;
import main.PessoaJuridica;

public class DemoPessoa3 {
    public static void main(String[] args) {
        PessoaFisica pf1 = new PessoaFisica("João Silva", "Rua Três, 54, Rio de Janeiro", "11236589657", new Data(03,02,2013));
        PessoaJuridica pj1 = new PessoaJuridica("Mercado da Vila", "Rua São João, 467, Vila Rica, Volta Redonda", "5551255");
        System.out.println(pf1);
        System.out.println();
        System.out.println(pj1);
    }

}