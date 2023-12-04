package main;

import main.ContaInt;

public class ContaCorrente implements ContaInt {
    private double saldo;
    private double taxaOperacao = 0.45;
    
    public void depositar(double valor) {
        this.saldo += (valor - taxaOperacao);
    }
    public void sacar(double valor) {
        this.saldo -= (valor + taxaOperacao);
    }
    public double getSaldo() {
        return this.saldo;
    }

}