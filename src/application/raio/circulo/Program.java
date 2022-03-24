package application.raio.circulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double PI = 3.14159;
		double raio, area;
		
		raio = sc.nextDouble();
		
		area = PI * raio * raio;
		
		System.out.printf("A = %.4f", area);
		
		sc.close();
		
	}

}
