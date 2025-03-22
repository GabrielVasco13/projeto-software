package exercicios;

import java.util.Random;
import java.util.Scanner;

public class AdivinhaNumero {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(10); // Gera um número entre 0 e 9
        int chute;

        System.out.println("Tente adivinhar o número entre 0 e 9:");

        do {
            System.out.print("Digite seu palpite: ");
            chute = sc.nextInt();

            if (chute < 0 || chute > 9) {
                System.out.println("Número fora do intervalo! Tente novamente.");
            } else if (chute < numeroAleatorio) {
                System.out.println("Muito baixo! Tente novamente.");
            } else if (chute > numeroAleatorio) {
                System.out.println("Muito alto! Tente novamente.");
            }
        } while (chute != numeroAleatorio);

        System.out.println("Parabéns! Você acertou o número " + numeroAleatorio + "!");
        sc.close();

	}

}
