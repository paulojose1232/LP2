package main;

//public abstract class e abstract class são diferentes!
//public abstract class permite que a classe seja acessada por uma classe que está localizada em um outro pacote, bastando importar.
//abstract class só permite que a classe seja utilizada se a nova classe que à utilizará estiver no mesmo pacote, neste caso, no pacote main.
abstract class Pessoa2 {
    private String nome;
    private String endereco;
    
    public Pessoa2(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    public Pessoa2() {

    }

    /*
    Quando usamos extends numa classe abstrata, devemos implementar todos os métodos abstratos que foram declarados na superclasse, 
    ou seja, na classe pai, na classe Pessoa2 que tem como classe filha PessoaFisica e PessoaJuridica
    Como não implementamos atualizaEndereco() em PessoaFisica e PessoaJuridica, vamos removê-lo da superclasse.
    //public abstract void atualizaEndereco();
    */

    public String toString() {
        return "\nNome: "+nome+"\nEndereço: "+endereco+"\n";
    }

}