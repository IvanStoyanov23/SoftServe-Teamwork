package creatures;

import java.util.ArrayList;

public class Pets extends Animals {

	public static ArrayList<String> names = new ArrayList<>();

	@Override
	void care() {
		System.out.println("Feed me!");

	}

	public void namesOfMyPets() {
		System.out.println("This is the names of my pets: " + names);
	}

	public void addAPetName(String s) {
		names.add(s);
		System.out.println("The new name is added!");
	}

}
