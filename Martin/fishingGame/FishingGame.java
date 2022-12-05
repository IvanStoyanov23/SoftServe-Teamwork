package test;

public class FishingGame{

	public static void main(String[] args) {
		Pond pond = new Pond();
		
		pond.getFishes();
		pond.showState();
		String name = pond.obtainFish();
		if(pond.checkExist(name)) {
			System.out.println("You alredy have this type fish");
		}else {
			System.out.println("You have new fish: "+name);
		}
		pond.lostFish("Shark");
		pond.showState();
	}
}
