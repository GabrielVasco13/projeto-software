import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		   
		Scanner sc = new Scanner(System.in);
		
		int maquina = (int) (Math.random() * 10);

		int usuario;
		
		do {
			System.out.println("Coloque um número: ");
			usuario = sc.nextInt();
			
			if (usuario < maquina) {
				System.out.println("Informe um numero maior");
			} else if (usuario > maquina) {
				System.out.println("Informe um numero menor");
			}
		} while(usuario != maquina);
		
		System.out.println("Parabens, vc venceu");
	
		
		sc.close();
	}

}
