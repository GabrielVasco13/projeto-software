package vetores;

import java.util.Scanner;

public class Vetor2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos itens vc deseja inserir? ");
		int tamanhoVetor = sc.nextInt();
		
		double[] notasAlunos = new double[tamanhoVetor];
		
		for(int i = 0; i < notasAlunos.length; i++) {
			System.out.println("Informe uma nota entre 0 a 10");
			double nota = sc.nextDouble();
			
			if (nota > 10 || nota < 0) {
				System.out.println("Sua nota é invalida");
				i--;
			} else {
				notasAlunos[i] = nota;
			}
			
		}
		
		for(double nota: notasAlunos) {
			System.out.println(nota);
		}
		
		
		sc.close();
	}

}
