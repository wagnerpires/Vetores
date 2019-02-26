package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// VETORES TIPO VALOR
		/* 3
		 * 1.72
		 * 1.56
		 * 1.80
		 * = 1.69
		*/	
		
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("VETORES TIPO VALOR");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextDouble();
		}
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i];
		}
		double avg = sum / n;
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		sc.close();
	}
}
*/
		// VETORES TIPO REFERÊNCIA
		/* 3
		 * TV
		 * 900.00
		 * Fryer
		 * 400.00
		 * Stove
		 * 800.00
		*/
 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("VETORES TIPO REFERÊNCIA");
		int n = sc.nextInt();
		
		Product[] vect = new Product[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}		
		
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / n;
		System.out.printf("AVERAGE PRICE: %.2f%n", avg);
		
		sc.close();
	}
}