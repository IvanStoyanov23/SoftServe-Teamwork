package ctask;

public class Task1c {

	public static void main(String[] args) {
	
		//3. Calculate the sum of 1! + 2! + 3! + ... + n !, n <10. Incoming data: n = 3.
	
		int n = 5, sum = 1;
		for (int i = 1; i <= n; i++) {
			sum = sum * i;
			System.out.println("Current step " + sum);
		}
		System.out.println("Factorial of " + n + " is " + sum);
	}

}
