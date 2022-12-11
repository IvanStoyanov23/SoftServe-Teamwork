package selenium;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Task 2
		int number = 0;
		boolean positive = true;
		String sumStr = "";
		if (sc.hasNextInt()) {
			number = sc.nextInt();
			if (number < 0) {
				positive = false;
			}
			sumStr = positive ? "positive " : "negative ";
			if (!positive) {
				number = Math.abs(number);
			}
			if (number > 9 && number < 100) {
				sumStr += "two-digit";
			} else if (number >= 0 && number < 10) {
				sumStr += "one_digit";
			} else {
				sumStr += "many-digits";
			}
			System.out.println(sumStr);
		}
		sc.close();
	}

}
