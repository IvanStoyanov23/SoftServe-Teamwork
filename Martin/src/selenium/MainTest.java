package selenium;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class MainTest {
	
	

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//Task 1
//		var radius = 5;
//		var square = 10;
//		var passage = 2;
//		task1(radius, square, passage);
		
		//Task 2
//		int number=0;
//		boolean positive = true;
//		String sumStr ="";
//		if(sc.hasNextInt()) {
//			number = sc.nextInt();
//			if(number<0){ positive = false;}
//			sumStr = positive? "positive ":"negative ";
//			if(!positive) {
//				number  = Math.abs(number);
//			}
//			if(number>9 && number<100) {
//				sumStr+="two-digit";
//			}else if (number >=0 && number <10) {
//				sumStr+="one_digit";
//			}else {
//				sumStr+="many-digits";
//			}
//			System.out.println(sumStr);
//		}
		//Task 3
//		int year = 2000, century=0;
//		if (year%100==0) {
//			century=year/100;
//		} else {
//			century=year/100 + 1;
//		}
//		System.out.println(century);

		//Task 4
//		Random rand = new Random();
//		int tryCount=10, number=0, user=0;
//		number=rand.nextInt(10); 
//		while(tryCount>0) {
//			if(sc.hasNextInt()) {
//				user = sc.nextInt();
//				tryCount=checkRandom(tryCount, user, number+1);
//			}
//			if(tryCount==0) {
//				System.out.println("Game over, out luck");
//			}	
//		}

		//Task 5
//		   HashMap<String, String> bulgarianCityes = new HashMap<String, String>();
//		    bulgarianCityes.put("Sofia", "Bulgaria");
//		    bulgarianCityes.put("Plovdiv", "Bulgaria");
//		    bulgarianCityes.put("Varna", "Bulgaria");
//		    bulgarianCityes.put("England", "London");
//		    String userInput = sc.nextLine();
//		    System.out.println(bulgarianCityes.get(userInput));
		
		//Task 6
//		int[] row1 = {2,3,5}, row2 = {0,8,0}, row3 = {67,9,3};
//		int[] col = new int[3];
//		for(int i =0;i<3;i++) {
//			col[0] = row1[i];
//			col[1] = row2[i];
//			col[2] = row3[i];
//			Arrays.sort(col);
//			System.out.print("col: ");
//			for(int n : col) {
//				System.out.print(n + " ");
//			}
//			System.out.println("");
//		}
		
		//Task 7
		
		
		
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
	
	public static void task1(int R, int S, int K) {
		boolean checkQuestion = false;
		if(R+K<=S/2) {
			checkQuestion = true;
		}
		System.out.println(checkQuestion? "Yes, it is possible.":"No, it is not impossible.");
	}

}
