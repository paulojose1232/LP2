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

public class Filme {
    private String titulo;
    private String descricao;
    private int duracaoMinutos;
    private Diretor diretor;

    public Filme(String titulo, String descricao, int duracaoMinutos
    ,Diretor diretor, String nome, int tempoExp, String localOrigem) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.duracaoMinutos = duracaoMinutos;
        diretor = new Diretor(nome, tempoExp, localOrigem);
    }

    public Filme() {

    }

    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public String exibirDuracaoEmHoras() {
        int horas = this.duracaoMinutos / 60;
        int minutos = this.duracaoMinutos % 60;
        return ("O filme "+this.titulo+" possui "+horas+" horas e "+minutos+" minutos de duração");
    }

    public boolean encontFilme(String busTitulo) {
        return this.titulo.equalsIgnoreCase(busTitulo);
    }

    public String toString() {
        return ("\nTítulo: "+this.titulo+"\nDescrição: "+this.descricao+
        "\nDuração: "+exibirDuracaoEmHoras()+"\nDiretor"+this.diretor+"\n");
    }
}