// Usamos get para obter informações. Esse tipo de método sempre retorna um valor.
// Usamos set para definir valores. Esse tipo de método geralmente não retorna valores.

package main;

public class Produto {
    private int codigo;
    private String nome, unidMedida;
    private double preco, estoque;
    
    public Produto(int codigo, String nome, String unidMedida, double preco, double estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.unidMedida = unidMedida;
        this.preco = preco;
        this.estoque = estoque;
    }

    public Produto() {
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

    public String getUnidMedida() {
        return unidMedida;
    }

    public void setUnidMedida(String unidMedida) {
        this.unidMedida = unidMedida;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getEstoque() {
        return estoque;
    }

    public void setEstoque(double estoque) {
        this.estoque = estoque;
    }

    public String toString() {
        return ("\nCodigo: "+this.codigo+"\nNome: "+this.nome+"\nUnidMedida: "+this.unidMedida+
        "\nPreco: "+this.preco+"\nEstoque: "+this.estoque);
    }
}