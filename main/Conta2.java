// Modelo Matheus

package main;

public class Conta2 {
	private int numeroconta;
	private String nome;
	private int tipoconta; //1-cc e 2-cp
	private double saldo;
	private double limite;
	
	
	public Conta2() {
		
	}
	
	public Conta2(int numeroconta, String nome, int tipoconta, double saldo, double limite) {
		this.numeroconta = numeroconta;
		this.nome = nome;
		this.tipoconta = tipoconta;
		this.saldo = saldo;
		this.limite = limite;
	}
	

	public int getNumeroconta() {
		return numeroconta;
	}

	public void setNumeroconta(int numeroconta) {
		this.numeroconta = numeroconta;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public int getTipoconta() {
		return tipoconta;
	}

	public void setTipoconta(int tipoconta) {
		if(this.getTipoconta()!= 1 || this.getTipoconta() != 2) {
			System.out.println("Tipo de conta inválido!");
			
		}
		else {
			this.tipoconta = tipoconta;
		}
	}

	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void sacar(double valor) {
		if(valor <= this.getSaldo() && this.getSaldo()+this.getLimite() >= valor) {
			saldo = saldo - valor;
		}
		else {
			System.out.println("Saque não concluido!");
		}
	}
	
	public void depositar(double valor) {
		if(valor > 0) {
			saldo = saldo + valor;
		}
		else {
			System.out.println("Deposito não concluido!");
		}
		
	}
	
	public void transferir(Conta2 destino, double valor) {
		if(valor > 0 && valor <= this.getSaldo()) {
			sacar(valor);
			destino.depositar(valor);
		}
	}
	
	public void consulta() {
		
	}
}