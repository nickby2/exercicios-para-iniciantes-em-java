package application.conta.funcionarios;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number, hours;
		double salaryPerHour, salary;
		
		number = sc.nextInt();
		hours = sc.nextInt();
		salaryPerHour = sc.nextDouble();
		
		salary = hours * salaryPerHour;
		
		System.out.println("Number: " + number);
		System.out.println("Salary: " + salary);
		
		
		sc.close();
	}

}
