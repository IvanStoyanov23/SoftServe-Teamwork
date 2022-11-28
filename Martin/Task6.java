package selenium;

import java.util.Arrays;

public class Task6 {

	public static void main(String[] args) {
		//Task 6
		int[] row1 = {2,3,5}, row2 = {0,8,0}, row3 = {67,9,3};
		int[] col = new int[3];
		for(int i =0;i<3;i++) {
			col[0] = row1[i];
			col[1] = row2[i];
			col[2] = row3[i];
			Arrays.sort(col);
			System.out.print("col: ");
			for(int n : col) {
				System.out.print(n + " ");
			}
			System.out.println("");
		}
	}
}
