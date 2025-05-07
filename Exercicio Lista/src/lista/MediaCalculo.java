package lista;

import java.util.Arrays;
import java.util.List;

public class MediaCalculo {

	public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40);

        // Calcula a soma
        int soma = numeros.stream().mapToInt(Integer::intValue).sum();

        // Calcula a média
        double media = numeros.isEmpty() ? 0 : (double) soma / numeros.size();

        // Exibe os resultados
        System.out.println("Lista de números: " + numeros);
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);


	}

}
