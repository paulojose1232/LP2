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

package main;

//import main.Circulo;

public class CircMain {
    public static void main(String [] args) {
        Circulo c1, c2;
        c1 = new Circulo();
        c2 = new Circulo();
        System.out.println(c1.consultarCirc());
        System.out.println(c2.consultarCirc());
        c1.setRaio(4);
        c1.setCor("Azul");
        c2.setRaio(8);
        c2.setCor("Cinza");
        System.out.println(c1.consultarCirc());
        System.out.println(c2.consultarCirc());
        //c1.calcAreaCirc();
        //c2.calcAreaCirc();
        //System.out.println(c1.consultarCirc());
        //System.out.println(c2.consultarCirc());
    }
}