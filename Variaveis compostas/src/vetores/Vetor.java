package vetores;

public class Vetor {

	public static void main(String[] args) {
		
		double[] notasAlunos = new double[5];
		String[] nomeAlunos = new String[45];
		
		// Atribuição de valor
		notasAlunos[0] = 10.0;
		notasAlunos[1] = 5.6;
		notasAlunos[2] = 4.9;
		
		nomeAlunos[0] = "jorge";
		
		// System.out.println(notasAlunos[0]);
		
		// Utilização do for
		for(double nota: notasAlunos) {
			System.out.println(nota);
		}
		
		for (var i = 0; i == 5; i++) {
			System.out.println(nomeAlunos);
		}
	}

}
