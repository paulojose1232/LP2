/*
Considere um novo projeto para a implementação de parte de um sistema bancário. 
Seu programa deve definir uma classe Conta com os seguintes atributos: número 
da conta, nome do proprietário, tipo de conta (1- conta corrente e 2- poupança), 
saldo e limite. Defina os métodos get e set, conforme seja necessário e 
conveniente.
Uma conta poderá ter os seguintes métodos: sacar, depositar, consultar o saldo e 
transferir um valor entre duas contas. Faça as devidas verificações relacionadas ao 
saldo, de acordo com o tipo de conta!
Crie a classe principal do programa para instanciar duas classes do tipo Conta e 
faça operações de depósito, saque, transferências. Ao final, exiba o saldo de cada 
conta.
*/
// Modelo professora

package main;

import main.Conta; // Não precisa pois estão no mesmo pacote

public class Banco {
    public static void main(String[] args) {
        Conta c1, c2;
        c1 = new Conta("25462-5", "Ana Carolina Lima", 1, 200, 100);
        c2 = new Conta("21472-2", "Pedro Souza", 2, 600, 0);
        System.out.println(c1.consultarSaldo());
        c1.depositar(350);
        c1.sacar(400);
        System.out.println(c1.consultarSaldo());
        c1.sacar(600);
        System.out.println(c1.consultarSaldo());
        System.out.println("Conta c2: "+c2.consultarSaldo());
        if (c2.transferir(200, c1)) {
            System.out.println("C1: "+c1.consultarSaldo());
            System.out.println("C2: "+c2.consultarSaldo());
        }
        else {
            System.out.println("\nTransferencia não efetuada!");
        }
    }
}