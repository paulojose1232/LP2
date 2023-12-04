/*
Escreva uma classe que represente um país. Um país é representado 
através dos atributos: sigla (ex.: BRA), nome, população e a sua dimensão
em Km2
Escreva a classe em Java contendo:
a) Construtor padrão e outro que inicialize a sigla, o nome e a dimensão do país;
b) Métodos de acesso (getter/setter);
c) Um método que retorne a densidade populacional do país;
d) Um método que permita exibir os dados do país.
Em seguida, você deve criar a classe MainPaises que cria uma array de 
países e permite que o usuário cadastre países enquanto desejar. Ao final, 
o programa deve exibir a lista de países cadastrados.
*/
package main;

public class Paises {
    private String sigla;
    private String nome;
    private long pop;
    private int dim;

    public Paises(String sigla, String nome, long pop, int dim) {
        super();
        this.sigla = sigla;
        this.nome = nome;
        this.pop = pop;
        this.dim = dim;
    }

    public Paises() {

    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getPop() {
        return pop;
    }

    public void setPop(long pop) {
        this.pop = pop;
    }

    public int getDim() {
        return dim;
    }

    public void setDim(int dim) {
        this.dim = dim;
    }

    public double CalDen() {
        double dens = ( (double) getPop() / (double) getDim());
        return dens;
    }

    public String toString() {
        double den = CalDen();
        return ("\nSigla: "+this.sigla+"\nNome: "+this.nome+"\nPopulação: "+this.pop+
        "\nDimensão: "+this.dim+"\nDensidade Populacional: "+String.format("%.2f", den)+"\n");
    }
}