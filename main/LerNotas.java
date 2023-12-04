package main;

import java.util.Scanner;
import java.util.Arrays;

public class LerNotas {
    public static void main (String[] args) {
        int quantAlunos, i;
        float notaAluno, guarda, mediaNotas;
        guarda = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos alunos a turma possui?");
        quantAlunos = sc.nextInt();
        float Alunos[] = new float[quantAlunos];
        for (i=0; i<quantAlunos; i++) {
            System.out.println("Insira a nota do aluno "+(i+1));
            notaAluno = sc.nextFloat();
            Alunos[i] = notaAluno;
            guarda += notaAluno;
        }
        mediaNotas = guarda/quantAlunos;
        Arrays.sort(Alunos);
        System.out.println("A média das notas da turma é: "+mediaNotas);
        System.out.println("O vetor de notas ordenado vale: "+Arrays.toString(Alunos));
    }
}