package main;

//import main.ContaInt; não é necessário importar, pois ContaCorrente ou ContaPoupanca usam a interface ContaInt e DemoConta não utiliza algo de ContaInt
import main.ContaCorrente;
import main.ContaPoupanca;

public class DemoConta {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(1200.20);
        cc.sacar(300);
        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(500.50);
        cp.sacar(25);

        System.out.println("Conta corrente: "+cc.getSaldo());
        System.out.println("Conta poupança: "+cp.getSaldo());
    }
    
}