package exercicios;

import java.util.Scanner;

public class ConversorMoeda {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    	
	    System.out.println("Escolha uma das conversões da moeda Real para as opções de baixo");
	    System.out.println("1 - Dolar");
	    System.out.println("2 - Euro");
	    System.out.println("3 - Libra");

        int opcao = sc.nextInt();

        if (opcao < 1 || opcao > 3) {
            System.out.println("Opção inválida! Tente novamente.");
        } else {
            System.out.print("Digite o valor em Reais (R$): ");
            double valorReais = sc.nextDouble();

            double valorConvertido = 0;
            String moeda = "";

            final double tax_dolar = 0.20;
            final double tax_euro = 0.18;
            final double tax_libra = 0.15;

            switch (opcao) {
                case 1:
                    valorConvertido = valorReais * tax_dolar;
                    moeda = "Dólares (USD)";
                    break;
                case 2:
                    valorConvertido = valorReais * tax_euro;
                    moeda = "Euros (EUR)";
                    break;
                case 3:
                    valorConvertido = valorReais * tax_libra;
                    moeda = "Libras (GBP)";
                    break;
            }

            System.out.printf("O valor de R$%.2f equivale a %.2f %s.\n", valorReais, valorConvertido, moeda);
        }

        sc.close();
	}

}
