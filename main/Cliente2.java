// versão professora

package main;

public class Cliente2 {
    private int codigo;
    private String nome;
    private String cpf;
    private String telefone;

    public Cliente2() {

    }

    public Cliente2(int codigo, String nome, String cpf, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String toString() {
        return ("Código: "+this.codigo+"\nNome: "+this.nome+
        "\nCpf: "+this.cpf+"\nTelefone: "+this.telefone+"\n");
    }

    public boolean verificaNome(String nomeBusca) {
        if (this.nome.equalsIgnoreCase(nomeBusca)) {
            return true;
        }
        else {
            return false;
        }
    }
}