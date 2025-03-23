package exercicios;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int somaPares = 0;
		 int somaImpares = 0;
		 
		 System.out.println("Digite números inteiros! (0 para sair)");
		 
		 int numero = sc.nextInt();
		 
		 while (numero != 0) {
			 if (numero % 2 == 0) {
				 somaPares += numero;
			 } else {
				 somaImpares += somaImpares;
			 }
			 numero = sc.nextInt();
		 }
		 
		 
		 System.out.println("Soma dos números pares: " + somaPares);
		 System.out.println("Soma dos números ímpares: " + somaImpares);

		 sc.close();
	}

}
