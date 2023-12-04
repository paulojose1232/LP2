package main;

public class Ponto {
    private int x;
    private int y;
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean eIgual (Ponto p2) {
        if ((this.x == p2.x) && (this.y == p2.y))
            return true;
        else
            return false;
    }

    public String toString() {
        
        return("("+this.x+","+this.y+")");
    }
}