/*
Considere um sistema para cadastramento de filmes. Trabalharemos com duas classes de modelo: Diretor e Filme. 
Todo filme tem um diretor. Desse modo, você deve definir uma classe Diretor em Java, com 
 as seguintes características:
    Atributos: nome, tempo de experiência (em anos), local de origem.
    Construtores para a classe;
    Métodos getters e setters;
    Método para impressão.
Em seguida, você deve construir uma classe Filme em Java, com as seguintes características:
    A classe deve possuir quatro atributos: titulo, descrição, diretor e duracaoEmMinutos.
    Crie os construtores padrão e completo;
    Crie os métodos de acesso (get e set) para os atributos da classe;
    Crie um método exibirDuracaoEmHoras que converta o valor em minutos para horas e 
    apresente a mensagem “O filme TITULO possui X horas e Y minutos de duração”.
    Faça um método de comparação na classe que retorne os dados do filme caso o título
     do objeto em questão seja igual ao informado;
    Acrescente também na classe um método para exibição dos dados do filme.
Considerando a classe Filme definida, crie uma classe MainFilme que possua um método main de modo que seja possível testar a classe Filme criada na questão anterior.
    Crie um arrayList de Filmes; 
    Cadastre os filmes enquanto o usuário desejar.
    Solicite ao usuário um título para efetuar a busca do filme e retorne o resultado.
    Ao final, para cada filme, você deve exibir o título e a quantidade de horas. 
*/
package main;   

public class Diretor {
    private String nome;
    private int tempoExp;
    private String localOrigem;

    public Diretor(String nome, int tempoExp, String localOrigem) {
        this.nome = nome;
        this.tempoExp = tempoExp;
        this.localOrigem = localOrigem;
    }

    public Diretor() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTempoExp() {
        return tempoExp;
    }

    public void setTempoExp(int tempoExp) {
        this.tempoExp = tempoExp;
    }

    public String getLocalOrigem() {
        return localOrigem;
    }

    public void setLocalOrigem(String localOrigem) {
        this.localOrigem = localOrigem;
    }

    public String toString() {
        return ("\nNome: "+this.nome+"\nTempo de experiência: "+this.tempoExp+
        "\nNacionalidade: "+this.localOrigem);
    }
}