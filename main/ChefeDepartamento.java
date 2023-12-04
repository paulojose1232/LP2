package main;

import main.Data;
import main.Pessoa;
import main.Funcionario2;

public class ChefeDepartamento extends Funcionario2 {
    private String nomeDepto;
    private Data dtPromo;

    //Cria um ChefeDepartamento do zero, sem ter criado funcionario antes
    public ChefeDepartamento(String nome, String cpf, Data dtNasc, Data dtAdm, double salario,
    String nDepto, Data dtPromo) {
        super(nome, cpf, dtNasc, dtAdm, salario);
        nomeDepto = nDepto;
        this.dtPromo = dtPromo;
    }

    //Usa a classe Funcionario, então para declarar um ChefeDepartamento, um funcionário já deve ter sido criado
    public ChefeDepartamento(Funcionario2 f, String nDepto, Data dtPromo) {
        super(f.getNome(),f.getCpf(),f.getDtNasc(),f.getDtAdm(),f.getSalario());
        nomeDepto = nDepto;
        this.dtPromo = dtPromo;
    }

    public String getNomeDepto() {
        return nomeDepto;
    }
    public void setNomeDepto(String nomeDepto) {
        this.nomeDepto = nomeDepto;
    }
    public Data getDtPromo() {
        return dtPromo;
    }
    public void setDtPromo(Data dtPromo) {
        this.dtPromo = dtPromo;
    }

    public String toString() {
        return (super.toString()+"\nNome do departamento: "+nomeDepto+"\nData de promoção:"+dtPromo);
    }
}