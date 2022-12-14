package game;

import java.util.Scanner;

import tools.GameSave;

public final class FishingGame {

	private static MessageManager print = new MessageManager();
	private static Pond pond = new Pond();
	private static int count = 6, score = 0;
	private static String userInput = "", userSelector = "";
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Init Strings
		print.run();

		primaryMenu();
		

		sc.close();
	}

	private static void newGame() {
		while (userSelector.length() < 3) {
			print.whatIsYourName();
			userSelector = sc.nextLine();
		}
		gameOptions();
	}
	private static void gameOptions() {
		System.out.println("Your try counter is: " + count);
		if(count>0) {
			print.gameOptions();
			userInput = sc.nextLine();
			switch (userInput) {
				case "1" -> {pond.getFishes(); count--; retryCounterGameMenu();}
				case "2" -> {pond.lostFish("Shark"); retryCounterGameMenu();}
				case "3" -> {pond.showState(); retryCounterGameMenu();}
				case "4" -> retryCounter();

				default -> retryCounterGameMenu();
			}
		}else {
			GameSave.CreateLog(userInput, score);
			print.gameOver();
		}
	}
	private static void primaryMenu() {
		print.mainMenu();
		userInput = sc.nextLine();
		
		switch (userInput) {
			case "1" -> newGame();
			case "2" -> { print.legend(); retryCounter(); }
			case "3" -> System.out.println("Not implemented!");
			case "4" -> {
				count = 0;
				print.bye();
			}

			default -> retryCounter();
		}
		
	}
	private static void retryCounter() {
		if(count>0) {
			primaryMenu();
		}
	}
	private static void retryCounterGameMenu() {
		if(count>0) {
			gameOptions();
		}
	}
	
	
	
	
}
