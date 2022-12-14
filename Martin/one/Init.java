package one;

import java.util.Scanner;

public class Init {

	public SoftwareResource run(Scanner sc) {

		String name = "", manufacturer = "", yearOfPublication = "", version = "";
		boolean validate = true;
		int index = 0;

		while (validate) {
			switch (index) {
			case 0:
				System.out.println("Enter correct name as input");
				if (sc.hasNext()) {
					name = sc.nextLine();
					index++;
				}
				break;
			case 1:
				System.out.println("Enter correct manufacturer as input");
				if (sc.hasNext()) {
					manufacturer = sc.nextLine();
					index++;
				}
				break;
			case 2:
				System.out.println("Enter correct yearOfPublication as input");
				if (sc.hasNext()) {
					yearOfPublication = sc.nextLine();
					index++;
				}
				break;
			case 3:
				System.out.println("Enter correct version as input");
				if (sc.hasNext()) {
					version = sc.nextLine();
					index++;
				}
				break;
			default:
				validate = false;
				break;
			}

		}

		SoftwareResource resource = new SoftwareResource(name, manufacturer, yearOfPublication, version);
		return resource;
	}

}
