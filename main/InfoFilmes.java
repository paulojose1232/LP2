package principal;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Diretor;
import modelo.Filme;

public class InfoFilmes {

	public static void main(String[] args) {
		ArrayList <Filme> filmes = new ArrayList <Filme>();
		Scanner sc = new Scanner(System.in);
		
		Filme f;
		Diretor d;
		
		while(true) {
			int op;
			
			f = new Filme();
			d = new Diretor();
			
			System.out.println("1 - Cadastrar\n2 - Procurar\n3- Imprimir\n4 - Remover\n 5- Sair\n Escolha: ");
			op = sc.nextInt();
			switch (op) {
			case 1 -> {
				System.out.println("Título do filme: ");
				f.setTitulo(sc.next());
				System.out.println("Descrição do filme: ");
				f.setDescricao(sc.next());
				System.out.println("Diretor do filme: ");
				d.setNome(sc.next());
				System.out.println("Nacionalidade do Diretor: ");
				d.setLocalDeOrigem(sc.next());
				System.out.println("Digite o tempo de experiência do diretor (em anos): ");
				d.setTempoExperiencia(sc.nextInt());
				System.out.println("Digite a duração em minutos do filme: ");
				f.setDuracaoEmMinutos(sc.nextInt());
				f.setDiretor(d);
				
				filmes.add(f);
				
				break;
			}
			
			case 2 -> {
				System.out.println("Procure um filme: ");
				String nome = sc.next();
				for(int i = 0; i < filmes.size(); i++) {
					if(filmes.get(i).retornaNome(nome)) {
						System.out.println(filmes.get(i));
					}
				}
				break;
			}
			case 3 -> {
				for(int i = 0; i < filmes.size(); i++) {
					System.out.println(filmes.get(i).toString());
				}
				break;
			}
			case 4 -> {
				System.out.println("Procure um filme para remover: ");
				String nome = sc.next();
				for(int i = 0; i < filmes.size(); i++) {
					if(filmes.get(i).retornaNome(nome)) {
						filmes.remove(i);
					}
				}
			}
			case 5 -> {
				System.out.println("Exibindo antes de sair...");
				for(int i = 0; i < filmes.size(); i++) {
					System.out.println(filmes.get(i).toString());
				}
				System.out.println("Saindo...");
				System.exit(0);
			}
			}
		}

	}

}
