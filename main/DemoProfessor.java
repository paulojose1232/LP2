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
import main.Professor;
import main.ProfessorIntegral;
import main.ProfessorHorista;

import java.util.Scanner;
import java.util.ArrayList;

public class DemoProfessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <ProfessorIntegral> professoresI = new ArrayList <ProfessorIntegral>();
        ArrayList <ProfessorHorista> professoresH = new ArrayList <ProfessorHorista>();
        int qtdeProfs = 0, cont = 0; // todas as variáveis são int
        String escolha;
        System.out.println("Escolha a quantidade de professores para o próximo semestre: ");
        qtdeProfs = sc.nextInt();
        sc.nextLine();

        while (cont < qtdeProfs) {
            System.out.println("Qual professor deseja criar? (PI - Professor Integral, PH - Professor Horista)");
            escolha = sc.nextLine();
            switch (escolha) {
                case "PI": {
                    ProfessorIntegral pi = new ProfessorIntegral();
                    System.out.println("Insira o nome do professor: ");
                    pi.setNome(sc.nextLine());
                    System.out.println("Insira a matrícula do professor: ");
                    pi.setMatricula(sc.nextLine());
                    System.out.println("Insira a data de nascimento do professor; dia, mês e ano, respectivamente: ");
                    int dia = sc.nextInt();
                    int mes = sc.nextInt();
                    int ano = sc.nextInt();
                    pi.setDtNasc(new Data(dia, mes, ano));
                    System.out.println("Insira o salário do professor: ");
                    pi.setSalario(sc.nextDouble());
                    cont++;

                    professoresI.add(pi);
                    break;
                }
                case "PH": {
                    ProfessorHorista ph = new ProfessorHorista();
                    System.out.println("Insira o nome do professor: ");
                    ph.setNome(sc.nextLine());
                    System.out.println("Insira a matrícula do professor: ");
                    ph.setMatricula(sc.nextLine());
                    System.out.println("Insira a data de nascimento do professor; dia, mês e ano, respectivamente: ");
                    int dia = sc.nextInt();
                    int mes = sc.nextInt();
                    int ano = sc.nextInt();
                    ph.setDtNasc(new Data(dia, mes, ano));
                    System.out.println("Insira o valor Hora Aula do professor: ");
                    ph.setValorHA(sc.nextDouble());
                    System.out.println("Insira a carga horária semanal do professor: ");
                    ph.setCargaHoraria(sc.nextInt());
                    cont++;

                    professoresH.add(ph);
                    break;
                }
            }
            sc.nextLine();
        }
        System.out.println("Saindo e exibindo os dados de todos os professores\n");
        for(int i = 0; i < professoresI.size(); i++) {
            System.out.println("Professor Integral "+(i+1));
            System.out.println(professoresI.get(i).exibirDados());
        }
        for(int i = 0; i < professoresH.size(); i++) {
            System.out.println("Professor Horista "+(i+1));
            System.out.println(professoresH.get(i).exibirDados());
        }
        sc.close();
    }

}
