package selenium;

public class Task3 {

	public static void main(String[] args) {
		//Task 3
		int year = 2000, century=0;
		if (year%100==0) {
			century=year/100;
		} else {
			century=year/100 + 1;
		}
		System.out.println(century);
	}
}
