package exercicios;

import java.util.Scanner;

public class area {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio: ");
		double raio = entrada.nextDouble();
		
		double area = Math.PI * (raio * raio);
		
		double perimetro = 2 * Math.PI * raio;
		
		System.out.println("O resultado do raio é:" + raio);
		System.out.println("Já o resultado do perimetro deu: " + perimetro);
		
		entrada.close();
	}

}
