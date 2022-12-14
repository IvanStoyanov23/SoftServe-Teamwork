package ctask;

public class Task1d {

	public static void main(String[] args) {
	
		//Display the multiplication table by 7:
		int sum = 0;
		final int n = 7;
		for (int i = 1; i <= 9; i++) {
			sum = i * n;
			System.out.println(i + " X " + n + " = " + sum);
		}

	}

}
