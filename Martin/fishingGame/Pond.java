package test;

import java.util.ArrayList;
import java.util.Random;

public class Pond extends Fish {
	
	final static String poor = "poor", rich = "rich", normal = "normal";
	static ArrayList<String> fishList = new ArrayList<>();
	
	public static void getFishes() {
		Random rn = new Random();
		int number = rn.nextInt(14);
		
		for(int i=0;i<number;i++) {
			fishList.add(fish[i]);
			System.out.println(i+1 + " " + fish[i]);
		}
	}
	public static boolean lostFish(String name) {
//		Random rn = new Random();
//		int number = rn.nextInt(14);
		
		if(fishList.contains(name)) {
			fishList.remove(name);
			System.out.println(name + " is removed");
			return true;
		}
		System.out.println(name + " is not in the list");
		return false;
	}
	public static String obtainFish() {
		Random rn = new Random();
		int number = rn.nextInt(14);
		
		return fish[number];
	}
	public static boolean checkExist(String name) {
		return fishList.contains(name);
	}
	public static void showState() {
		String s="";
		if(fishList.size()<5) {
			s=poor;
		}else if(fishList.size()<11) {
			s=normal;
		}else {
			s=rich;
		}
		System.out.println("The pond is "+s);
	}
}
