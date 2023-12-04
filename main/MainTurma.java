/*
Escreva uma classe que represente um aluno de um curso X. Os dados 
do aluno são: matrícula, nome, nota1, nota2 e média. Escreva a classe em 
Java contendo:
a) Construtor padrão e outro com a matrícula, nome, nota1 e nota2;
b) Métodos de acesso (getter/setter);
c) Um método que retorne a média do aluno (deve ser utilizado no construtor);
d) Um método para comparação de dois nomes, retornando o resultado da 
comparação;
e) Um método que permita exibir os dados do aluno.
Em seguida, você deve criar a classe MainTurma que cria uma lista de 
alunos e permita:
1- Cadastrar um aluno;
2- Buscar um aluno pelo nome;
3- Exibir a lista de alunos
4- Calcular a média da turma.
5- Sair
*/
package main;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

import main.Aluno;

public class MainTurma {

	public static void main(String[] args) {
		int escolha, g1 = 0, flag = 1;
        double mediaT = 0;
		Scanner sc = new Scanner(System.in);
		Aluno[] alunos = new Aluno[50];
		while (flag == 1) {
			System.out.println("Escolha uma opção: \n1- Cadastrar um aluno: (máximo 50)\n2- Buscar um aluno pelo nome: "
					+ "\n3- Exibir a lista de alunos: \n4- Calcular a media da turma: \n5- Sair: ");
			escolha = sc.nextInt();
			sc.nextLine();
			switch (escolha) {
			case 1 -> {
				alunos[g1] = new Aluno();
				System.out.println("Insira a matricula do aluno: ");
				alunos[g1].setMatricula(sc.nextLine());
				System.out.println("Insira o nome do aluno: ");
				alunos[g1].setNome(sc.nextLine());
				System.out.println("Insira a nota 1 do aluno: ");
				alunos[g1].setNota1(sc.nextDouble());
				System.out.println("Insira a nota 2 do aluno: ");
				alunos[g1].setNota2(sc.nextDouble());
				double media = alunos[g1].Media();
                alunos[g1].setMedia(media);
                mediaT += media;
				g1++;
				break;
			}
			case 2 -> {
				if (g1 > 0) {
					boolean achou = false;
					System.out.println("Insira o nome do aluno a ser buscado: ");
					String busAluno = sc.nextLine();
					for (int i = 0; i < g1; i++) {
						if (alunos[i].verifNome(busAluno)) {
							System.out.println("Aluno de nome "+busAluno+" está registrado");
							achou = true;
							break;
						}
					}
						if (achou == false) {
							System.out.println("Aluno de nome "+busAluno+" não está registrado");
						}
				}
				else {
					System.out.println("Não há alunos cadastrados.");
				}
				break;
			}
			case 3 -> {
				for (int i = 0; i < g1; i++) {
					System.out.println("Aluno "+(i+1)+"\n"+alunos[i].toString());
				}
				break;
			}
			case 4 -> {
				System.out.println("Média da turma: "+(mediaT/g1));
				break;
			}
			case 5 -> {
				flag = 0;
				System.out.println("Finalizando programa.");
				break;
			}
			}
		}
		sc.close();
	}
}