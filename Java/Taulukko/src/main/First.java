package main;
import java.util.*;
import fi.jyu.mit.ohj2.Tiedosto;

public class First {

	public static String path = "C:\\atk_vahakangas\\ohjelmointi\\Java\\Taulukko\\src\\main\\data.txt";	
	
	public static void add() {
		ArrayList<String> list = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		
		while(true) {
			//ArrayList<> person = new ArrayList<String>();
			
			System.out.println("Anna nimi: ");
			String name = input.next();
			name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
			
			if(name.equals("!lopeta")) {
				Tiedosto.kirjoitaTiedosto(path, list, true);
				System.out.println("Kirjoittaminen onnistui.");
				break;
			}
			
			
			System.out.println("Anna ikä: ");
			Integer age = input.nextInt();
			String person = name + "," + age;
			list.add(person);
			
			
		}
		
	}
	
	public static void delete() {
		Scanner input = new Scanner(System.in);
		String[] lines = Tiedosto.lueTiedosto(path);
		ArrayList<String> newList = new ArrayList<>();
		newList.addAll(Arrays.asList(lines));
		
		System.out.println("Kirjoita nimi, jonka haluat poistaa: ");
		String name = input.next();
		System.out.println("Kirjoita ikä: ");
		Integer age = input.nextInt();
		try {
			newList.remove(name + "," + age);
		}
		catch(Exception e) {
			System.out.println("Henkilöä ei löydy listasta. ");
		}
		
		Tiedosto.kirjoitaTiedosto(path, newList, false);
	}
	
	
	public static void search() {
		Scanner input = new Scanner(System.in);
		String[] lines = Tiedosto.lueTiedosto(path);
		
		System.out.println("1. Nimen mukaan");
		System.out.println("2. Iän mukaan");
		switch(input.nextInt()) {
			case 1:
				System.out.println("Kirjoita nimi, jota haluat etsiä: ");
				String name = input.next();
				for(String line : lines) {
					if(line.split(",")[0].equals(name)) {
						System.out.println("Löydettiin " + line);
					}
				}
				break;
			case 2:
				System.out.println("Kirjoita ikä, jota haluat etsiä: ");
				String age = input.next();
				for(String line : lines) {
					if(line.split(",")[1].equals(age)) {
						System.out.println("Löydettiin " + line);
					}
				}
				break;
		}
		
	}
	
	
	public static void sorting() {
		Scanner input = new Scanner(System.in);
		String[] lines = Tiedosto.lueTiedosto(path);
		Integer[] ages = new Integer[lines.length];
		System.out.println("1. Nimen mukaan");
		System.out.println("2. Iän mukaan");
		ArrayList<String> newlist = new ArrayList<>();
		newlist.addAll(Arrays.asList(lines));
		
		
		Integer user = input.nextInt();
		
		if(user == 1) {
			java.util.Collections.sort(newlist);
		}
		else if(user == 2) {
			for(int i = 0; i < newlist.size(); i++) {
				for(int j = 1; j < newlist.size() - i;j++) {
					String temp1 = newlist.get(j - 1);
					String temp2 = newlist.get(j);
					if(Integer.parseInt(temp1.substring(temp1.indexOf(",")+1, temp1.length())) > Integer.parseInt(temp2.substring(temp2.indexOf(",")+1, temp2.length()))) {
						String temp = newlist.get(j - 1);
						newlist.set(j - 1, newlist.get(j));
						newlist.set(j, temp);
					}
				}
			}
			
		}
		
		System.out.println("-------------------------------");
		for(String line : newlist) {
			System.out.println(line);
		}
		System.out.println("-------------------------------");
		Tiedosto.kirjoitaTiedosto(path, newlist);
		
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {	
			System.out.println("\n1. Lisää henkilöitä");
			System.out.println("2. Näytä henkilöt");
			System.out.println("3. Poista henkilö");
			System.out.println("4. Hae henkilöä");
			System.out.println("5. Järjestä taulukko");
			System.out.println("6. Tietoa listasta");
			
			Integer user = input.nextInt();
					
			switch(user) {
				case 1:
					add();
					break;
				case 2:
					System.out.println("-------------------------------");
					String[] lines = Tiedosto.lueTiedosto(path);
					for(String line : lines) {
						System.out.println(line);
					}
					System.out.println("-------------------------------");
					break;
				case 3:
					delete();
					break;
				case 4:
					search();
					break;
				case 5:
					sorting();
					break;
				case 6:
					String[] lines2 = Tiedosto.lueTiedosto(path);
					System.out.println("Tiedostossa on tällä hetkellä " + lines2.length + " henkilöä");
					break;
			}
		}
	}

}
