package creatures;

public class Main {

	public static void main(String[] args) {
		Human aleko = new Human("Aleko");
		aleko.breathe();
		aleko.walk();
		aleko.speak();

		Pets fishes = new Pets();
		fishes.addAPetName("Nemo");
		fishes.addAPetName("Alice");
		fishes.care();
		fishes.namesOfMyPets();

	}

}
