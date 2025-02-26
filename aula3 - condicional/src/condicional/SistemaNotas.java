package condicional;

import java.util.Scanner;

public class SistemaNotas {

	public static void main(String[] args) {
		// Media
		// -  Aprovado - 7 a 10
		// -  Reprovado - 0 a 6.9	
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		
		
		System.out.println("A sua media é:" + media);
		
		if (media >= 7) {
			System.out.println("Voce foi aprovado :D");
		} else if (media >=5) {
			System.out.println("Você está de recuperação!");
			System.out.println("Digite a nota do exame: ");
			double notaex = entrada.nextDouble();
		
			double mf = (media + notaex) / 2;
			if (mf>=7) {
				System.out.println("Aprovado!");
			}
			else {
				System.out.println("Reprovado!");
			}
		}
		else{
			System.out.println("Voce foi reprovado.");
		}
			
		entrada.close();
	}

}
