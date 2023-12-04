//Crie um novo projeto que defina uma classe para representar um 
//círculo. Dois atributos precisam ser definidos: raio, que é do tipo double e 
//possui como valor default 1 e cor, que armazenada um valor do tipo String 
//e tem como valor default “vermelho”. A classe deve implementar os 
//métodos de acesso aos atributos (getters e setters), além de definir um 
//método para calcular a área do círculo (2 ∗ 𝜋 ∗ 𝑟^2)
//e outro para exibir os 
//dados do círculo. Em seguida, crie uma classe contendo o método main e 
//instancie dois círculos. Altere a cor e o raio dos círculos, calcule a área e 
//exiba seus dados. 

// Usamos get para obter informações. Esse tipo de método sempre retorna um valor.
// Usamos set para definir valores. Esse tipo de método geralmente não retorna valores.

package main;

public class Circulo {
    private double raio = 1;
    private String cor = "vermelho";

    public Circulo(double raio, String cor) {
        super();
        this.raio = raio;
        this.cor = cor;
    }

    public Circulo() {
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double calcAreaCirc() {
        if (getRaio() > 0) {
            double areaCirc;
            areaCirc = (2 * 3.14159265 * (getRaio()*getRaio()));
            return areaCirc;   
        }
        else {
            System.out.println("Raio menor que zero.");
            return 1;
        }
    }

    public String consultarCirc() {
        String dadosCirc;
        double area = calcAreaCirc();
        dadosCirc = "Raio: "+getRaio()+"\nCor: "+getCor()+
        "\nArea: "+String.format("%.2f", area)+"\n";
        return dadosCirc;
    }
}