package exercicios;
import java.util.Scanner;

public class temp {

	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus celsius: ");
		double celsius = entry.nextDouble();
		
		double fahrenheit = (celsius * 9/5) + 32;
		double kelvin = celsius + 273.15;
		
		System.out.println("A temperatura em fahrenheit é: " + fahrenheit);
		System.out.println("A temperatura em kelvin é: " + kelvin);
		
		entry.close();

	}

}
