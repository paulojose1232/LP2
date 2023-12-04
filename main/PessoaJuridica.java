package main;

public class PessoaJuridica extends Pessoa2 {
    private String cnpj;
    
    public PessoaJuridica(String nome, String endereco, String cnpj) {
        super(nome, endereco);
        this.cnpj = cnpj;
    }

    public PessoaJuridica() {

    }

    public String toString() {
        
        return super.toString()+"\nCNPJ: "+this.cnpj;
    }

}