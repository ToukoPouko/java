package at03;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashMap;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Phonebook {

	public static Scanner input = new Scanner(System.in);
	public static String userInput;	
	public static Map<String, List<String>> book = new LinkedHashMap<String, List<String>>();	
	
	public static void addPerson() throws IOException {
		 
		String name;
		String number;
		String address;
		List<String> values = new ArrayList<String>();
		
		/*try {
			Files.write(Paths.get("C:\\atk_vahakangas\\ohjelmointi\\java_projects\\src\\at03\\entries.txt"), "aaa".getBytes(), StandardOpenOption.APPEND);
		}catch(IOException e) {
			
		}*/
		
		System.out.println("Name: ");
		name = input.next();
		System.out.println("Number: ");
		number = input.next();
		values.add(number);
		System.out.println("Address: ");
		address = input.next();
		values.add(address);
		book.put(name, values);
		System.out.println("Added " + name + " to the phonebook!");
		
		// File processing work in progress!
		
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
	
	private static void viewPhonebook() {
		for(String key: book.keySet()) {
			if (book.size() <= 0) {
				System.out.println("Your phonebook is empty!");
			}
			System.out.println(key + ", " + book.get(key).get(0) + ", " + book.get(key).get(1));
		}
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
	
	public static void deletePerson() {
		System.out.println("Who do you want to delete? (type the name): ");
		String temp = input.next();
		book.remove(temp);
		System.out.println("Deleting " + temp + " was succesful");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(1 == 1) {
		
			System.out.println("------------------------------------------");
			System.out.println("1. Add new person");
			System.out.println("2. View phonebook");
			System.out.println("3. Delete person");
			userInput = input.next();
		
			switch (userInput) {
				case "1": 
					addPerson();
					break;
				case "2": 
					viewPhonebook();
					break;
				case "3": 
					deletePerson();
					break;
			}
		}
		
		
	}
	
	

}
