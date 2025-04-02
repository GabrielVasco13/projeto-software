package entidades;

public class Livro {
	public String livro;
	public String autor;
	public int quantidade;
	public double valorUnit;
	
	
	public String exibeInfo() {
		
		return "Livro: " + livro + 
				"\nAutor: " + autor + 
				"\nQuantidade: " + quantidade + 
				"\nValorUnit: " + valorUnit;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
