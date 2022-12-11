package selenium;

import java.util.Scanner;

public class Task {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Task 1
		var radius = 5;
		var square = 10;
		var passage = 2;
		task1(radius, square, passage);

		sc.close();
	}

	public static void task1(int radius, int square, int passage) {
		boolean checkQuestion = false;
		if (radius + passage <= square / 2) {
			checkQuestion = true;
		}
		System.out.println(checkQuestion ? "Yes, it is possible." : "No, it is not impossible.");
	}

}
