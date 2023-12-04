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

public class Aluno {
	private String matricula;
	private String nome;
	private double nota1;
	private double nota2;
	private double media;
	
	public Aluno(String matricula, String nome, double nota1, double nota2, double media) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.media = media;
	}
	
	public Aluno() {
		
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}
	
	public double Media() {
		media = (getNota1()+getNota2())/2;
		return media;
	}
	
	public boolean verifNome(String encontAluno) {
		if (getNome().equalsIgnoreCase(encontAluno)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return ("\nMatricula: "+this.matricula+"\nNome: "+this.nome+"\nNota 1: "+nota1+
				"\nNota 2: "+this.nota2+"\nMédia: "+media+"\n");
	}
}
