package exercicios;

import java.util.Scanner;

public class MediaNums {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     int soma = 0, quantidade = 0, numero;
	     do {
	    	 System.out.print("Digite um número (0 para sair): ");
	    	 numero = sc.nextInt();

	    	  if (numero != 0) {
	    		  soma += numero;
	    		  quantidade++;
	    	  }
	     } while (numero != 0);

	     if (quantidade > 0) {
	    	 double media = (double) soma / quantidade;
	    	 System.out.printf("A média dos números digitados é: %.2f\n", media);
	     } else {
	    	 System.out.println("Nenhum número foi digitado.");
	     }
	     
	     sc.close();

	}

}
