package application.conta.pecas;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int code1, code2, quantity1, quantity2;
		double price1, preco1, preco2, price2, total;
		
		code1 = sc.nextInt();
		quantity1 = sc.nextInt();
		price1 = sc.nextDouble();
		
		code2 = sc.nextInt();
		quantity2 = sc.nextInt();
		price2 = sc.nextDouble();
		
		preco1 = price1 * quantity1;
		preco2 = price2 * quantity2;
		total = preco1 + preco2;
		
		System.out.printf("Valor a pagar: %.2f", total);
		
		sc.close();
		
	}

}
