package main;
import java.util.*;
import fi.jyu.mit.ohj2.Tiedosto;

public class First {

	public static void main(String[] args) {
		Map<String, Integer> person = new LinkedHashMap<String, Integer>();
		Scanner input = new Scanner(System.in);
		String[] lines = Tiedosto.lueTiedosto("D:\\Ohjelmointi\\java\\Java\\Taulukko\\src\\main\\data.txt");
		
		System.out.println("Anna nimi: ");
		String name = input.next();
		System.out.println("Anna ikä: ");
		Integer age = input.nextInt();
		person.put(name, age);
		

	}

}
