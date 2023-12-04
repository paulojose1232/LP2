package main;

/*
Contratos? ／人◕ ‿‿ ◕人＼
interfaces são sempre públicas
*/

public interface ContaInt { // interface, não é classe!
    public void depositar(double valor);
    public void sacar(double valor);
    public double getSaldo();
}