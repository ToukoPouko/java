import java.util.*;

public class First {

	public static void main(String[] args) {
		Map<String, Integer> person = new LinkedHashMap<String, Integer>();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Anna nimi: ");
		String name = input.next();
		System.out.println("Anna ikä: ");
		Integer age = input.nextInt();
		person.put(name, age);

	}

}
