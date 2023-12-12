package main;

abstract class Veiculo {
	private int peso;
	private int velocMax;
	
	public Veiculo(int peso, int velocMax) {
		this.peso = peso;
		this.velocMax = velocMax;
	}
	
	public Veiculo() {
		
	}
	
	public int getPeso() {
		return peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public int getVelocMax() {
		return velocMax;
	}
	
	public void setVelocMax(int velocMax) {
		this.velocMax = velocMax;
	}
	
	public String toString() {
		return ("Peso do veículo: "+peso+"\nVelocidade máxima: "+velocMax+"\n");
	}
	
}
