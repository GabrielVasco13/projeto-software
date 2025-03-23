package exercicios;

import java.util.Scanner;

public class Emprestimo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		 System.out.println("Bem-vindo ao sistema de empréstimos!");
	     System.out.print("Digite o valor do empréstimo: R$ ");
	     double valorEmprestimo = sc.nextDouble();

	     System.out.println("Escolha o número de parcelas: ");
	     System.out.println("6 meses (+5%)");
	     System.out.println("12 meses (+10%)");
	     System.out.println("24 meses (+20%)");
	     System.out.print("Digite a opção desejada (6, 12 ou 24): ");

	     int opcao = sc.nextInt();
	     double valorFinal = valorEmprestimo;

	     // Estrutura switch para definir a taxa de juros
	     switch (opcao) {
	         case 6:
	             valorFinal *= 1.05; // Acrescenta 5%
	             break;
	         case 12:
	             valorFinal *= 1.10; // Acrescenta 10%
	             break;
	         case 24:
	             valorFinal *= 1.20; // Acrescenta 20%
	             break;
	         default:
	             System.out.println("Opção inválida! Escolha entre 6, 12 ou 24 meses.");
	             sc.close();
	             return; 
	        }

	        System.out.printf("O valor total a ser pago em %d meses será de R$ %.2f.\n", opcao, valorFinal);
	        
	        sc.close();
	}

}
