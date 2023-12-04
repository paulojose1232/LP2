package main;

import main.Contato;

import java.util.Scanner;

public class MainContatos {

	public static void main(String[] args) {
		int qtde = 0, flag = 1, escolha;
		Scanner sc = new Scanner(System.in);
		Contato[] contatos = new Contato[30];
		
		while (flag == 1) {
			System.out.println("Escolha uma opção: \n1- Cadastrar um contato (maximo 30)\n"
					+ "2- Exibir todos os contatos \n3- Finalizar o programa");
			escolha = sc.nextInt();
			sc.nextLine();
			switch (escolha) {
			case 1: {
				contatos[qtde] = new Contato();
				System.out.println("Insira o nome do contato: ");
				contatos[qtde].setNome(sc.nextLine());
				System.out.println("Insira o telefone 1 do contato: ");
				contatos[qtde].setTelefone1(sc.nextLine());
				System.out.println("Insira o telefone 2 do contato: ");
				contatos[qtde].setTelefone2(sc.nextLine());
				System.out.println("Insira o endereço do contato: ");
				contatos[qtde].setEndereco(sc.nextLine());
				System.out.println("Insira a relação do contato (Quem se refere ao contato): ");
				contatos[qtde].setRelacao(sc.nextLine());
				qtde++;
				break;
			}
			case 2: {
				if (qtde > 0) {
					for(int i = 0; i < qtde; i++) {
						System.out.println("Contato "+(i+1));
						System.out.println(contatos[i].toString());
					}
					break;
				}
				else {
					System.out.println("Não há contatos registrados.");
					break;
				}
			}
			case 3: {
				System.out.println("Saindo do programa.");
				flag = 0;
				break;
			}
			default :{
				System.out.println("Opção inválida");
				break;
			}
			}
		}
		sc.close();
	}

}
