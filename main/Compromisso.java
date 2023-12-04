package main;

import main.Data;
import main.Hora;

public class Compromisso {
    /*
    data
    horario
    descricao
    */
   private Data data;
   private Hora horario;
   private String descricao;

   public Compromisso(Data dt, Hora h, String desc) {  
        data = dt;
        horario = h;
        descricao = desc;
   }

   public Compromisso(int dia, int mes, int ano, int h, int m, int s, String desc) {
        data = new Data(dia, mes, ano);
        horario = new Hora(h, m, s);
        descricao = desc;

   }

    public String toString() {
        return "\nData: "+data+"\nHorário: "+horario //data poderia ser trocado para this.data, horario tbm e tal
        +"\nDescrição: "+descricao;
    }












}