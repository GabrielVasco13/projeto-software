package principal;

import java.util.Scanner;

import entidades.Livro;

public class Main {

	public static void main(String[] args) {
		
		Livro pedroGay = new Livro();
		Scanner sc = new Scanner(System.in);
		
		pedroGay.livro = "A culpa é do pedro";
		pedroGay.autor = "Pedroko";
		pedroGay.quantidade = 100;
		pedroGay.valorUnit = 80;
		System.out.println("Informe a quantidade de livros emprestados: ");
		int quantidade = sc.nextInt();
		
		pedroGay.emprestaLivro(quantidade);
		
		
		System.out.println(pedroGay.exibeInfo());	
		sc.close();
	}

}
