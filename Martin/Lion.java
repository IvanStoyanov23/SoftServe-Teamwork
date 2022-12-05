package task11;

public class Lion extends Animal implements Legs{
	String name;

	public Lion(String name) {
		super();
		this.name = name;
	}

	public void name() {
		System.out.println("This is "+name);
	}
	public void roar() {
		System.out.println("Laugh roar");
	}
	
	@Override
	public void howItMoves(String s) {
		System.out.println("Lion move with "+s+" legs");
		Legs.super.howItMoves(s);
	}
	

}
