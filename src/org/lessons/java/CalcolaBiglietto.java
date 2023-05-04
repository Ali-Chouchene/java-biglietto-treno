package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Quanti chilometri vuoi percorrere?");
		String kmStr = input.nextLine();
		System.out.println("Quanti anni ha il passeggero?");
		String ageStr = input.nextLine();
		double total;
		double kmPrice = 0.21;
		if(Integer.valueOf(ageStr) < 18) {
			double subtotal = Integer.valueOf(kmStr) * kmPrice;
			double sold = (subtotal * 20)/ 100;
			total = subtotal - sold;
		}else if(Integer.valueOf(ageStr) > 65) {
			double subtotal = Integer.valueOf(kmStr) * kmPrice;
			double sold = (subtotal * 40)/ 100;
			total = subtotal - sold;
		}else {
			total = Integer.valueOf(kmStr) * kmPrice;
		}
		System.out.print(Math.round(total * 100.0) / 100.0 + "€");
		input.close();

	}

}
