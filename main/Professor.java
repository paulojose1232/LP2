/*
Você foi designado para participar do desenvolvimento de uma aplicação
para gerenciar os dados dos professores de uma instituição.
Os dados básicos dos professores são: nome, matrícula e data de
nascimento. Um professor pode ser classificado como “Integral” ou como
“Horista”. O primeiro tipo de professor, além dos dados básicos, possui um
campo salário que armazenará um valor fixo. Já o segundo tipo, além dos
dados básicos, armazena o valor da hora/aula, a carga horária semanal e
possui um método getSalario() que retorna o cálculo do salário.
Defina as classes envolvidas: Professor, ProfessorHorista e
ProfessorIntegral, aplicando os conceitos de Composição, Herança,
Polimorfismo, Classe abstrata e Interface, quando necessário.
Para cada classe acima, você deve definir seus atributos, construtor,
métodos getters e setters (de acordo com a necessidade) e um método
exibirDados(), que retorna uma String com os dados formatados para
futura impressão. Aplique a reutilização quando necessário. Para a classe
“Horista”, esse método deve exibir não só o valor da hora/aula e carga
horária, como o salário a partir desses dados.
Com base nesse contexto, faça uma classe DemoProfessor instancie
professores tanto da classe ProfessorIntegral como ProfessorHorista e
exiba os dados de cada professor ao final.
Amplie o programa anterior, criando um array de professor e solicitando ao
usuário a quantidade de professores que será alocada para o próximo
semestre da instituição. Em seguida, faça a leitura de todos os professores,
com suas respectivas diferenças de acordo com a categoria do professor
(solicite ao usuário).
Ao final, todos os dados devem ser exibidos
*/
package main;

import main.Data;

abstract class Professor {
    private String nome;
    private String matricula;
    private Data dtNasc; 

    public Professor(String nome, String matricula, Data dtNasc) {
        this.nome = nome;
        this.matricula = matricula;
        this.dtNasc = dtNasc;
    }

    public Professor() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    } 

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Data getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Data dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String exibirDados() {
        return ("\nNome: "+nome+"\nMatrícula: "+matricula+"\nData de nascimento: "+dtNasc);
    }

}
