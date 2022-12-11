package ctask;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		final String ANSI_GREEN = "\u001B[32m", RESET_COLOR = "\u001B[0m";
		Scanner sc = new Scanner(System.in);

		double baseNumber = -5.5D, userInput = 0.0D, step = 0.5D, sum = 0;

		userInput = sc.nextDouble();

		if (baseNumber < userInput) {
			while (baseNumber < userInput) {
				sum += baseNumber;
				baseNumber += step;
				System.out.println(baseNumber);
			}
		}
		sc.close();
		System.out.println(ANSI_GREEN + "The number is: " + sum + RESET_COLOR);

	}

}
