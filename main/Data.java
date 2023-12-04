package main;

public class Data {
    private int dia; 
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data() {

    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }


    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean comparaData(Data dt2) {
        if(this.dia==dt2.dia && this.mes==dt2.mes && this.ano==dt2.ano) {
            return true;
        }
        else {
            return false;
        }
    }

    public String toString() {
        return (this.dia+"/"+this.mes+"/"+this.ano+"\n");
    }
}