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
	
	public void emprestaLivro(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public void devolveLivro(int quantidade) {
		this.quantidade += quantidade;
	}
	
	
}
