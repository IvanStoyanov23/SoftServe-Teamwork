package test;

public class FishingGame extends Pond{

	public static void main(String[] args) {
		
		getFishes();
		showState();
		String name = obtainFish();
		if(checkExist(name)) {
			System.out.println("You alredy have this type fish");
		}else {
			System.out.println("You have new fish: "+name);
		}
		lostFish("Shark");
		showState();

	}

}
