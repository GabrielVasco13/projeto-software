package principal;

import entidades.Livro;

public class Main {

	public static void main(String[] args) {
		
		Livro pedroGay = new Livro();
		
		pedroGay.livro = "A culpa é do pedro";
		pedroGay.autor = "Pedroko";
		pedroGay.quantidade = 100;
		pedroGay.valorUnit = 80;
		
		System.out.println(pedroGay.exibeInfo());		
	}

}
