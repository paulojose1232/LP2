package main;

import main.Data;
import main.Pessoa;

//Apesar de Pessoa importar e usar Data, como em Funcionario2 eu uso Data para criar dtAdm, eu preciso importar Data diretamente.
//Mesmo se eu não usasse dtAdm, como a classe Pessoa usa Data, eu preciso importar Data.
public class Funcionario2 extends Pessoa {
    private Data dtAdm;
    private double salario;

    //quero criar uma pessoa que também é funcionário do zero, usa o construtor abaixo:
    public Funcionario2(String nome, String cpf, Data dtNasc, Data dtAdm, double salario) {
        super(nome, cpf, dtNasc);
        this.dtAdm = dtAdm;
        this.salario = salario;
    }

    //já tenho um objeto do tipo Pessoa criado, quero transformar em funcionario então usa o construtor abaixo:
    public Funcionario2(Pessoa p, Data dtAdm, double salario) {
        super(p.getNome(),p.getCpf(),p.getDtNasc());
        this.dtAdm = dtAdm;
        this.salario = salario;
    }

    public Data getDtAdm() {
        return dtAdm;
    }

    public void setDtAdm(Data dtAdm) {
        this.dtAdm = dtAdm;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonificacao() {
        return this.salario * 0.1;
    }


    public String toString() {
        return (super.toString()+"\nData de admissão: "+dtAdm+"\nSalário: "+salario+"\n");
    }

    final public void reajustarSalario(double reaj) {
        this.salario+=this.salario*reaj;
    }
}