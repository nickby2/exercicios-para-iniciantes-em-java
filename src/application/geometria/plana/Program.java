package application.geometria.plana;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double PI = 3.14159;
		double A, B, C;
		double TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		TRIANGULO = (A * C)/2;
		CIRCULO = C * C * PI; 
		TRAPEZIO = (A + B)*C/2;
		QUADRADO = B * B;
		RETANGULO = A* B;
		
		System.out.printf("TRIANGULO: %.3f%n", TRIANGULO);
		System.out.printf("CIRCULO: %.3f%n", CIRCULO);
		System.out.printf("TRAPEZIO: %.3f%n", TRAPEZIO);
		System.out.printf("QUADRADO %.3f%n" , QUADRADO);
		System.out.printf("RETANGULO: %.3f%n", RETANGULO);

		sc.close();
	}

}
