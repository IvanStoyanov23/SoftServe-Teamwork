package selenium;

import java.util.HashMap;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Task 5
		   HashMap<String, String> bulgarianCityes = new HashMap<String, String>();
		    bulgarianCityes.put("Sofia", "Bulgaria");
		    bulgarianCityes.put("Plovdiv", "Bulgaria");
		    bulgarianCityes.put("Varna", "Bulgaria");
		    bulgarianCityes.put("England", "London");
		    String userInput = sc.nextLine();
		    System.out.println(bulgarianCityes.get(userInput));
		    sc.close();
	}

}
