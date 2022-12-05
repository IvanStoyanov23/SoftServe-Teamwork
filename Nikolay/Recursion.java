import java.util.*;
import java.lang.*;
public class Recursion {

        public static int recurSum(int n)
        {
            if (n <= 1)
                return n;
            return n + recurSum(n - 1);
        }
        public static void main(String args[])
        {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            System.out.println(recurSum(n));
        }
    }

