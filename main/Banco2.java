// Modelo Matheus

package main;

import main.Conta2;

public class Banco2 {

	public static void main(String[] args) {
		
		Conta2 p1,p2;
		
		p1 = new Conta2 (12182, "Matheus", 5, 100, 50);
		p2 = new Conta2 (11154, "Fulano", 2, 200, 100);
		
		//depositando na conta
		p1.depositar(100);
		p2.depositar(50);
		
		//sacar da conta
		p1.sacar(50);
		p2.sacar(100);
		
		//transferir saldo
		p1.transferir(p2, 80);
		
		
		//mostrando saldo da conta
		System.out.println("O saldo da conta de: "+p1.getNome()+ " é de: "+p1.getSaldo());
		System.out.println("O saldo da conta de: "+p2.getNome()+ " é de: "+p2.getSaldo());

	}

}
