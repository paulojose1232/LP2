package main;

import main.Veiculo;

public class CarroPasseio extends Veiculo {
	private String cor;
	private String modelo;
	
	public CarroPasseio(int peso, int velocMax, String cor, String modelo) {
		super(peso, velocMax);
		this.modelo = modelo;
		this.cor = cor;
	}
	
	public CarroPasseio() {
		
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public String toString() {
		return (super.toString()+"Cor: "+this.cor+"\nModelo: "+modelo+"\n");
	}
	
}
