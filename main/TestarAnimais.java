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

import main.Animal;
import main.Peixe;
import main.Mamifero;

public class TestarAnimais {
    public static void main(String[] args) {
        Peixe p1 = new Peixe("Robalo", 1.50f, 0, "Azul", "Aquático", 30.0f, "Barbatana"); //para colocar como float ao invés de double, no final do número precisa colocar 'f'
        Mamifero m1 = new Mamifero("Urso", 2.20f, 4, "Preto", "Floresta", 48.0f, "Carne");

        p1.ExibirDadosPeixe();
        System.out.println();
        m1.ExibirDadosMamifero();
    }

}
