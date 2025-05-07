package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListaNomes {

	public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Alice");
        nomes.add("Carlos");
        nomes.add("Amanda");
        nomes.add("Marcos");

        // Busca aos nomes
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a letra inicial para filtrar: ");
        String letra = scanner.nextLine().toUpperCase();

        // Filtragem de nomes 
        List<String> nomesFiltrados = nomes.stream()
                .filter(nome -> nome.toUpperCase().startsWith(letra))
                .collect(Collectors.toList());

        // Exibe os nomes
        System.out.println("Nomes encontrados que começam com \"" + letra + "\": " + nomesFiltrados);
        System.out.println("Total de nomes: " + nomesFiltrados.size());


	}

}
