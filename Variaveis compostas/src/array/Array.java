package array;

import java.util.ArrayList;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		
		// 	Tipos primitivos = int, double, char
		//	Objetos = String, Integer, Double
		
		List<String> listaNomes = new ArrayList<>();
		
		listaNomes.add("Jorge");
		listaNomes.add("Cleiton");
		listaNomes.add("dENIS");
		listaNomes.add("Cringe");

		// verificando o tamanho do array
		
		for(String nome: listaNomes) {
			System.out.println(nome);
		}
		
		System.out.println(listaNomes.size());
		
		System.out.println(listaNomes.isEmpty());
		
		
		
		// estudar sobre os metodos da lista
	}

}
