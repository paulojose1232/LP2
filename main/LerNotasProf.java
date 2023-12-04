package main;

import java.util.Arrays;
import java.util.Scanner;
public class LerNotasProf
{
    public static void main (String[]args)
    {
        double notas[];
        int qtde;
        double media = 0;
        Scanner sc = new Scanner (System.in);
        System.out.println ("Quantos alunos?");
        qtde = sc.nextInt ();
        notas = new double[qtde];
        for (int i = 0; i < qtde; i++) {
        System.out.println ("Informe a nota " + (i + 1) + ":");
        notas[i] = sc.nextDouble ();
        media = media + notas[i];
        }
        sc.close ();
        media = media / qtde;
        System.out.println ("MC)dia da turma: " + media);
        Arrays.sort (notas);
        System.out.println ("Notas ordenadas:");
        System.out.println (Arrays.toString (notas));
    }
    }
