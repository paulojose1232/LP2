/*
Crie uma classe para representar os dados de um cliente, contendo código, nome, cpf e
telefone. Implemente nessa classe os construtores e métodos de acesso/modificação
necessários e também para impressão. Implemente um método para verificação se um
dado nome é igual ao do objeto, que será utilizado para busca.
Em seguida, crie uma classe CadastroClientes que apresente o seguinte menu:
1- Cadastrar cliente
2- Buscar cliente pelo nome
3- Exibir dados dos clientes
4- Sair
Considere que possam ser cadastrados até 50 clientes, mas o cadastro deve ser feito de
acordo com a vontade do usuário.
*/

package main;

//import main.Cliente;
import java.util.Scanner;
import java.util.Arrays;

public class CadastroClientes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtde = 0, escolha, flag = 0;
		String buscaCliente;
		Cliente[] clientes;
		clientes = new Cliente[50];
		while(true) {
			System.out.println("Menu");
			System.out.println("1-Cadastrar cliente (máximo de 50)");
			System.out.println("2-Buscar cliente pelo nome");
			System.out.println("3-Exibir dados dos clientes");
			System.out.println("4-Sair\n");
			escolha = sc.nextInt();
			System.out.println("\n");
			if (escolha == 1) {
				clientes[qtde] = new Cliente();
				System.out.println("Informe o código do cliente: ");
				clientes[qtde].setCodigo(sc.nextInt());
				sc.nextLine();
				System.out.println("Informe o nome do cliente: ");
				clientes[qtde].setNome(sc.nextLine());
				System.out.println("Informe o cpf do cliente: ");
				clientes[qtde].setCpf(sc.nextLine());
				System.out.println("Informe o telefone do cliente: ");
				clientes[qtde].setTelefone(sc.nextLine());
				qtde++;
				System.out.println("Cliente cadastrado com sucesso");
			}
			else if (escolha == 2) {
				if (qtde > 0) {
					boolean achou = false;
					System.out.println("Informe o nome do cliente que deseja buscar: ");
					sc.nextLine();
					buscaCliente = sc.nextLine();
					for (int cont = 0; cont < qtde; cont++) {
						if (clientes[cont].verifNome(buscaCliente)) { 
							System.out.println("\n"+clientes[cont].toString()); 
							achou = true;
						}
					}
					if (achou == false) {
						System.out.println("O cliente buscado não foi encontrado\n");
					}
				}
				else {
					System.out.println("Não há cliente cadastrado\n");
				}
			}
				/*
                flag = 0;
				for (int cont = 0; cont < qtde; cont++) {
					if (clientes[cont].getNome().equalsIgnoreCase(buscaCliente)) {
						System.out.println("\n"+clientes[cont].toString());
                        flag++;
					}
				}
                if (flag == 0) {
                    System.out.println("Não existe cliente com esse nome.\n");
                }
				*/
			else if (escolha == 3) {
				for (int cont = 0; cont < qtde; cont++) {
                    System.out.println("Cliente "+(cont+1));
                    System.out.println(clientes[cont]);
                }
			}
			else if (escolha == 4) {
				break;
			}
		}	
	}
}