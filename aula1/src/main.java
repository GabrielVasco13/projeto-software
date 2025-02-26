import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor do capital inicial: ");
		double c = entrada.nextDouble();
		
		System.out.println("Digite a taxa de juros (% ao mês): ");
		double t = entrada.nextDouble();
		
		System.out.println("Agora o número de meses: ");
		int meses = entrada.nextInt();
		
		double m = c * Math.pow(1 + t / 100, meses);
		
		System.out.println("Montante total: " + m);
		
		entrada.close();
	}

}
