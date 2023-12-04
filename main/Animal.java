/*
Considerando o contexto de herança, crie um projeto em Java para 
representar a situação abaixo.
• Criação de uma classe Animal que obedeça à seguinte descrição:
o possua os atributos nome (String), comprimento (float),número de patas 
(int), cor (String), ambiente (String) e velocidade média (float);
o implemente um método construtor que receba por parâmetro os 
valores iniciais de cada um dos atributos e atribua-os aos seus 
respectivos atributos.
o Crie os métodos get e set para cada um dos atributos.
o Crie um método ExibirDados, sem parâmetro e do tipo void, que, 
quando chamado, imprime na tela uma espécie de relatório informando 
os dados do animal.
• Criação de uma classe Peixe que herde da classe Animal e obedeça 
à seguinte descrição:
o possua um atributo característica (String: barbatana, cauda, ...)
o implemente um método construtor que receba por parâmetro os 
valores iniciais de cada um dos atributos (incluindo os atributos da classe 
Animal) e atribua-os aos seus respectivos atributos.
o Crie os métodos get e set para o atributo característica. 
o Crie um método ExibirDadosPeixe sem parâmetro e do tipo void, que, 
quando chamado, imprime na tela uma espécie de relatório informando 
os dados do peixe (incluindo os dados do Animal e mais a característica).
• Criação de uma classe Mamífero que herde da classe Animal e 
obedeça à seguinte descrição:
o possua um atributo alimento(String);
o implemente um método construtor que receba por parâmetro os 
valores iniciais de cada um dos atributos (incluindo os atributos da classe 
Animal) e atribua-os aos seus respectivos atributos.
o Crie os métodos get e set para o atributo alimento.
o Crie um método ExibirDadosMamifero sem parâmetro e do tipo void, 
que, quando chamado, imprime na tela uma espécie de relatório 
informando os dados do mamífero (incluindo os dados do Animal e mais 
o alimento).
• Para testar a implementação das classes acima, crie uma classe 
TestarAnimais que possua um método main e instancie objetos para 
cada classe. Ao final chame os métodos para imprimir os dados de 
cada um dos objetos criados.
*/
package main;

abstract class Animal {
    private String nome;
    private float comp;
    private int numPat;
    private String cor;
    private String ambiente;
    private float veloMed;

    public Animal (String nome, float comp, int numPat, String cor, String ambiente, float veloMed) {
        this.nome = nome;
        this.comp = comp;
        this.numPat = numPat;
        this.cor = cor;
        this.ambiente = ambiente;
        this.veloMed = veloMed;
    }

    public Animal () {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getComp() {
        return comp;
    }

    public void setComp(float comp) {
        this.comp = comp;
    }

    public int getNumPat() {
        return numPat;
    }

    public void setNumPat(int numPat) {
        this.numPat = numPat;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public float getVeloMed() {
        return veloMed;
    }

    public void setVeloMed(float veloMed) {
        this.veloMed = veloMed;
    }

    public void ExibirDados() {
        System.out.println("Nome: "+nome);
        System.out.println("Número de patas: "+numPat);
        System.out.println("Cor: "+cor);
        System.out.println("Ambiente: "+ambiente);
        System.out.println("Velocidade média: "+veloMed+"km/h");
    }

}
