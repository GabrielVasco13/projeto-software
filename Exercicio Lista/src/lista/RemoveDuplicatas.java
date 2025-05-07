package lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveDuplicatas {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>(Arrays.asList("Banana", "Maçã", "Abacate", "Manga"));
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Removendo palavras que contêm: ");
        String letra = scanner.nextLine().toLowerCase();

        // Filtrar palavras que NÃO contêm a letra fornecida
        List<String> palavrasFiltradas = palavras.stream()
                .filter(palavra -> !palavra.toLowerCase().contains(letra))
                .collect(Collectors.toList());

        System.out.println("Palavras originais: " + palavras);
        System.out.println("Palavras após remoção: " + palavrasFiltradas);
	}

}
