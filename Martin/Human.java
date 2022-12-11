package creatures;

public class Human extends LivingCreature implements MakeNoice {
	public void walk() {
		System.out.println("Humans have to walk with two legs.");
	}

	public void speak() {
		System.out.println("My name is " + name + ".\n");
	}

	public void breathe() {
		System.out.println("Living creatures breathe every day.");
	}

	public Human(String name) {
		this.name = name;
	}

}
