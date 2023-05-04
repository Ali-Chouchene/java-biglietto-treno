package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Quanti numeri vuoi estrarre?");
		String inStr = input.nextLine();
		int inNumber =Integer.valueOf(inStr);
		System.out.println("-----------------------------------------------");
		for (int i = 1; i <= inNumber; i++) {
			 if (i % (5 * 3) == 0) {
				 System.out.println("FizzBuzz");
			 }else if((i % 3) == 0) {
				 System.out.println("Fizz");
			 }else if((i % 5) == 0) {
				 System.out.println("Buzz");
			 }else {
				 System.out.println(i);
			 }
		}
		input.close();
	}

}
