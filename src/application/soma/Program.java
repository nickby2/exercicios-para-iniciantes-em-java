package application.soma;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses 
		 n�meros com uma mensagem explicativa, conforme exemplos.
		 */
		
		Scanner sc = new Scanner(System.in);
		int x, y, soma;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		soma = x + y;
		
		System.out.println("Soma: " + soma);
		
		sc.close();

	}

}
