// Modelo professora

// Usamos get para obter informações. Esse tipo de método sempre retorna um valor.
// Usamos set para definir valores. Esse tipo de método geralmente não retorna valores.

package main;

public class Conta {
    private String numConta;
    private String nomeProp;
    private int tipoConta;
    private double saldo;
    private double limite;

    public Conta(String numConta, String nomeProp, int tipoConta, double saldo, double limite) {
        super();
        this.numConta = numConta;
        this.nomeProp = nomeProp;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
        this.limite = limite;
    }

    public Conta() { // Construtor vazio para instanciar objetos sem parâmetros 
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getNomeProp() {
        return nomeProp;
    }

    public void setNomeProp(String nomeProp) {
        this.nomeProp = nomeProp;
    }

    public int getTipoConta() {
        return tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String consultarSaldo() {
        String res;
        res = "Saldo: R$ "+getSaldo();
        if(getTipoConta() == 1)
            res += "Limite: R$ "+getLimite();
        return res;
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        else
            return false;
    }

    public boolean sacar(double valor) {
        if (valor > 0) {
            if(this.tipoConta == 1) {
                if (valor <= (this.getSaldo() + this.getLimite())) {
                    this.saldo -= valor;
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                if (valor <= (this.getSaldo())) {
                    this.saldo -= valor;
                    return true;
                }
                else {
                    return false;
                }
            }
        }
        else {
            return false;
        }
    }

    public boolean transferir (double valor, Conta contaDest) {
        if (valor > 0) {
            if (this.sacar(valor)) { // se o saque for bem sucedido (true) então deposita na conta destino e retorna true para o método transferir 
                contaDest.depositar(valor);
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}