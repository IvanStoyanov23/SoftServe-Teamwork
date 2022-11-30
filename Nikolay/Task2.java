import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int x;
        System.out.println("Please enter a number");
        x = reader.nextInt();
        if ((x > 9 && x < 100) || (x < -9 && x > -100)) {
            System.out.println("positive");
            main(args);
        } else {
            System.out.println("negative");
            main(args);
        }
    }
}