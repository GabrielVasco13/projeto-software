package entidades;

public class Moto extends Veiculos {

	private double cilindradas;
	
	public Moto(String marca, String modelo, int ano, double valorDiario, double cilindradas) {
		super(marca, modelo, ano, valorDiario);
		this.cilindradas = cilindradas;
	}

	
}
