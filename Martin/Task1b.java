package ctask;

import java.util.Scanner;

public class Task1b {

	public static void main(String[] args) {
		final String ANSI_GREEN = "\u001B[32m", RESET_COLOR = "\u001B[0m";
		Scanner sc = new Scanner(System.in);
		int userInput = 0, sum = 0;
		int count = 0;

		while (count < 5) {
			userInput = sc.nextInt();
			sum = userInput + sum;
			++count;
		}
		sc.close();
		System.out.println(ANSI_GREEN + "The sum of the numbers is: " + sum + RESET_COLOR);

	}

}
