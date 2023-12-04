package main;

public class Hora {
    private int hora;
    private int min;
    private int seg;

    public Hora(int hora, int min, int seg) {
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    public Hora() {

    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    public boolean comparaHora(int h, int m, int s) {
        if(hora==h && min==m && seg==s) {
            return true;
        }
        else {
            return false;
        }
    }

    public String toString() {
        return ("\n"+this.hora+":"+this.min+":"+this.seg+"\n");
    }
}