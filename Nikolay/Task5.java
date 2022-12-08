import java.util.HashMap;
import java.util.Scanner;

    public class Task5 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String enter = sc.nextLine();
            HashMap<String, String> city = new HashMap<String, String>();
            city.put("Madrid", "Spain");
            city.put("Sofia", "Bulgaria");
            city.put("Pleven", "Bulgaria");
            city.put("Burgas", "Bulgaria");
            city.put("Vienna", "Austria");
            city.put("Paris", "France");
            city.put("      ", "Error");

            System.out.println(city.get(enter));
        }
    }

