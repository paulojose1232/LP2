package main;

public class Caminhao extends Veiculo {
	private int toneladasMax;
	private int alturaMax;
	private float comprimento;
	
	public Caminhao(int peso, int velocMax, int toneladasMax, int alturaMax, float comprimento) {
		super(peso, velocMax);
		this.toneladasMax = toneladasMax;
		this.alturaMax = alturaMax;
		this.comprimento = comprimento;
	}
	
	public Caminhao() {
		
	}

	public int getToneladasMax() {
		return toneladasMax;
	}

	public void setToneladasMax(int toneladasMax) {
		this.toneladasMax = toneladasMax;
	}

	public int getAlturaMax() {
		return alturaMax;
	}

	public void setAlturaMax(int alturaMax) {
		this.alturaMax = alturaMax;
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	
	@Override
	public String toString() {
		return (super.toString()+"Toneladas: "+toneladasMax+"\nAltura: "+alturaMax+"\nComprimento: "+comprimento+"\n");
	}
	
}
