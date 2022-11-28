package selenium;

import java.util.Random;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Task 4
		Random rand = new Random();
		int tryCount=10, number=0, user=0;
		number=rand.nextInt(10); 
		while(tryCount>0) {
			if(sc.hasNextInt()) {
				user = sc.nextInt();
				tryCount=checkRandom(tryCount, user, number+1);
			}
			if(tryCount==0) {
				System.out.println("Game over, out luck");
			}	
		}
		sc.close();
	}

	public static int checkRandom(int count, int userNum, int randNum) {
		if(userNum==randNum) {
			System.out.println("You won the game! Number = "+randNum);
		}else if(userNum<randNum) {
			System.out.println("Your number is lesser than original number. Attempt left "+ (count-1));
		}else {
			System.out.println("Your number is greater than original number. Attempt left "+ (count-1));
		}	
		return --count;
	}
}
