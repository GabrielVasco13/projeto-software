package exercicios;

import java.util.Scanner;

public class fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro positivo: ");
		int numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.println("Não pode ter digito 0");
		} else {
			long fatorial = 1;
			for(int i = 1; i <= numero; i++) {
				fatorial *= i;
			}
			System.out.println("O fatorial de " + numero + " é: " + fatorial);
		}
		
		sc.close();
	}

}
