package exercicios;

import java.util.Scanner;

public class media {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Prazer aluno! digite a sua 1º Nota: ");
		double m1 = entrada.nextDouble();
		
		System.out.println("Agora digite a 2º Nota: ");
		double m2 = entrada.nextDouble();
		
		System.out.println("Para finalizar, digite a 3º Nota: ");
		double m3 = entrada.nextDouble();
		
		double media = (m1 + m2 + m3) / 3;
		
		System.out.println("Sua média final é: " + media);
		
		entrada.close();
	}

}
