package one;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	/*
	 * Create a class "Software resource" (software), which has a name,
	 * manufacturer, year of publication and version - class variables. Class fields
	 * should be represented as an array. Provide class methods: initialization
	 * Init() - input of initial data from the keyboard, method of displaying
	 * current data on the screen - Display(). In addition, define the methods of
	 * changing data - Change(), searching for the desired software by year of
	 * publication - Search(). Demonstrate work based on the created class object.
	 */

	private static ArrayList<SoftwareResource> mySoftware = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String searchObject = "";

		for (int i = 0; i < 2; i++) {
			System.out.println("Enter you software parameters N" + (i + 1) + ":");
			mySoftware.add(new Init().run(sc));
		}
		Display();

		System.out.println("Search for the software by year");
		if (sc.hasNext()) {
			searchObject = sc.nextLine();
			System.out.println(Search(searchObject));
		}

		sc.close();
	}

	private static void Display() {
		System.out.println(mySoftware);
	}

	private static String Search(String year) {
		System.out.println("Search for software based on");
		for (SoftwareResource software : mySoftware) {
			if (software.getYearOfPublication().equals(year)) {
				return ("Software name: " + software.name + " year: " + software.yearOfPublication);
			}
		}
		return "There are no records for this year!";
	}

}
