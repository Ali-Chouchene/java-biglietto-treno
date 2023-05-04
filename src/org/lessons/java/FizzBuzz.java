package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Quanti numeri vuoi estrarre?");
		String inStr = input.nextLine();
		int inNumber = 0;
		if(inStr != "") {
			inNumber = Integer.valueOf(inStr);
		}
		System.out.println("-----------------------------------------------");
		input.close();
		if(inNumber > 0) {
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
		}else {
			for (int i = 1; i <= 100; i++) {
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
		}
		}

	

}
