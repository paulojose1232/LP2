// versão professora

package main;
//import main.Cliente2;
import java.util.Scanner;


public class CadastroClientes2 {

    public static void exibeMenu() {
        System.out.println("**** Menu ****");
        System.out.println("1- Cadastrar cliente");
        System.out.println("2- Buscar cliente");
        System.out.println("3- Exibir clientes");
        System.out.println("4- Sair");
    }

    public static void main(String[] args) {
        /*
        System.out.println("**** Menu ****");
        System.out.println("1- Cadastrar cliente");
        System.out.println("2- Buscar cliente");
        System.out.println("3- Exibir clientes");
        System.out.println("4- Sair");
        */
        Scanner sc = new Scanner(System.in);
        Cliente2[] clientes = new Cliente2[50];
        int op;
        int qtde = 0;
        do {
            exibeMenu();
            System.out.println("Escolha sua opção: ");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:{
                    System.out.println("\nCadastro de clientes:\n ");
                    clientes[qtde] = new Cliente2();
                    System.out.println("Informe o código: ");
                    clientes[qtde].setCodigo(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Informe o nome: ");
                    clientes[qtde].setNome(sc.nextLine());
                    System.out.println("Informe o cpf: ");
                    clientes[qtde].setCpf(sc.nextLine());
                    System.out.println("Informe o telefone: ");
                    clientes[qtde].setTelefone(sc.nextLine());
                    qtde++;
                    break;
                } 
                case 2:{
                    System.out.println("\nBusca de clientes:\n ");
                    if (qtde>0) {
                        String nome;
                        boolean achou = false;
                        System.out.println("\nNome do cliente desejado: ");
                        nome = sc.nextLine();
                        for(int i=0;i<qtde;i++) {
                            if(clientes[i].verificaNome(nome)) { // verificaNome é um método da classe Cliente que verifica se o nome do cliente é igual ao nome buscado 
                                achou = true;
                                System.out.println("\nCliente:\n");
                                System.out.println(clientes[i]);
                                break;
                            }
                        }
                        if(achou==false)
                            System.out.println("\nCliente não está cadastrado!");
                    }
                    else {
                        System.out.println("\nNão temos clientes cadastrados");
                    }
                    break;
                }
                case 3:{
                    if (qtde>0) {
                        System.out.println("\nLsta de clientes:\n");
                        for(int i=0; i<qtde; i++) {
                            System.out.println(clientes[i]);
                        }
                    }
                    else {
                        System.out.println("\nSem Clientes cadastrados no momento:\n");
                    }
                    break;
                }
                case 4:{
                    System.out.println("\nEncerrando o programa...");
                    break;
                }
                default:{
                    System.out.println("Opção inválida!");
                    break;
                }
            }
        }while(op != 4);
    }
}