package main;

import main.Veiculo;
import main.CarroPasseio;
import main.Caminhao;

import java.util.Scanner;
import java.util.ArrayList;

public class DemoVeiculos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList <CarroPasseio> carrosP = new ArrayList <CarroPasseio>();
		ArrayList <Caminhao> carrosC = new ArrayList <Caminhao>();
		int qtde = 0, flag = 0;
		int escolha;
		
		while (flag == 0) {
			System.out.println("Escolha uma opção:\nCriar CarroPasseio-1\nCriar Caminhao-2\nSair-3");
			escolha = sc.nextInt();
			sc.nextLine();
			switch(escolha) {
				case 1 : {
					CarroPasseio cp = new CarroPasseio();
					System.out.println("Insira o peso do veículo: ");
					cp.setPeso(sc.nextInt());
					System.out.println("Insira a velocidade máxima do veículo: ");
					cp.setVelocMax(sc.nextInt());
					System.out.println("Insira a cor do veículo: ");
					sc.nextLine();
					cp.setCor(sc.nextLine());
					System.out.println("Insira o modelo do veículo: ");
					cp.setModelo(sc.nextLine());
					
					carrosP.add(cp);
					break;
				}
				case 2 : {
					Caminhao cc = new Caminhao();
					System.out.println("Insira o peso do veículo: ");
					cc.setPeso(sc.nextInt());
					System.out.println("Insira a velocidade máxima do veículo: ");
					cc.setVelocMax(sc.nextInt());
					System.out.println("Insira a carga máxima suportada em toneladas: ");
					cc.setToneladasMax(sc.nextInt());
					System.out.println("Insira a altura do veículo: ");
					cc.setAlturaMax(sc.nextInt());
					System.out.println("Insira o comprimento do veículo: ");
					cc.setComprimento(sc.nextInt());
					
					carrosC.add(cc);
					break;
				}
				case 3 : {
					System.out.println("Saindo e exibindo os dados de todos os veiculos\n");
			        for(int i = 0; i < carrosP.size(); i++) {
			            System.out.println("Carro Passeio "+(i+1));
			            System.out.println(carrosP.get(i));
			        }
					for(int i = 0; i < carrosC.size(); i++) {
			            System.out.println("Caminhão "+(i+1));
			            System.out.println(carrosC.get(i));
			        }
					flag = 1;
				}
			}
		}
		sc.close();
	}

}
