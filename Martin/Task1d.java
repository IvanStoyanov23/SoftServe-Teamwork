package ctask;

public class Task1d {

	public static void main(String[] args) {
		int sum = 7;
		for (int i = 1; i <= 9; i++) {
			sum = i * sum;
			System.out.println("The sum is: " + sum);
			sum = 7;
		}

	}

}
