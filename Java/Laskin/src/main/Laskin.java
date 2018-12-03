package main;

import java.util.*;

public class Laskin {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Laskin");
		System.out.println("----------------");
		
		
		while(true) {
			System.out.println("Ensimmäinen numero: ");
			double num1 = input.nextDouble();
			System.out.println("Toinen numero: ");
			double num2 = input.nextDouble();
			System.out.println("Laskutoimitus (+, -, *, /): ");
			String operation = input.next();
			switch(operation) {
				case "+":
					System.out.println(num1 + num2);
					break;
				case "-":
					System.out.println(num1 - num2);
					break;
				case "*":
					System.out.println(num1 * num2);
					break;
				case "/":
					try {
						System.out.println(num1 / num2);
					}
					catch(Exception e) {
						System.out.println("Ei mahdollinen laskutoimitus (" + num1 + operation + num2 + ")");
					}
			}
		}
		
	}

}
