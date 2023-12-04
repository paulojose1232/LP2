package main;

import main.Data;

public class PessoaFisica extends Pessoa2 {
    private String cpf;
    private Data dtNasc;
    
    //Construtor PessoaFisica vazio permite instanciar um objeto PessoaFisica sem colocar informações, vazio.
    public PessoaFisica() {

    }

    public PessoaFisica(String nome, String endereco, String cpf, Data dtNasc) {
        super(nome, endereco);
        this.cpf = cpf;
        this.dtNasc = dtNasc;
    }

    public String toString() {
        
        //retorna a toString da classe super, da classe pai, ou seja, o toString da classe Pessoa2
        return super.toString()+"\nCPF: "+this.cpf+"\nData de nascimento: "+this.dtNasc+"\n";
    }

}