package condicional;

import java.util.Scanner;

public class compras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Informe o valor da sua compra R$: ");
		double vc = sc.nextDouble();
		System.out.println("Metodos de pagamento");
		System.out.println("1 - dinheiro/pix");
		System.out.println("2 - débito");
		System.out.println("3 - crédito");
		int metodoPagamento = sc.nextInt();
		
		switch (metodoPagamento) {
		case 1:
			double vf =  vc * 0.9;
			System.out.println("sua compra deu R$" + vf);
			break;
		
		case 2:
			vf = vc * 0.95;
			System.out.println("sua compra deu R$" + vf);
			break;
			
		case 3:
			System.out.println("sua compra deu R$" + vc);
			System.out.println("2 - 2x, 5% de juros");
			System.out.println("3 - 3x, 10% de juros");
			int mpr = sc.nextInt();
			break;
		default:
			System.out.println("opção inválida");
			break;
		}
	}
}
