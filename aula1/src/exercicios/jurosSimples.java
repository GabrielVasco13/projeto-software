package exercicios;

import java.util.Scanner;

public class jurosSimples {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite da capital inicial: ");
		double c = entrada.nextDouble();
		
		System.out.println("Digite o valor da taxa");
		double i = entrada.nextDouble();
		
		System.out.println("Digite a qnt de meses");
		double t = entrada.nextDouble();
		
		double juros = c * (i / 100) * t;
		
		double montanteTotal = juros + c;
			
		System.out.println("O valor do juros deu: " + juros);
		System.out.println("E o montante final deu: " + montanteTotal);
		entrada.close();

	}

}
