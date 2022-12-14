package tools;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GameSave {
	public static void CreateLog(String name, int score) {
		try {
			FileWriter fw = new FileWriter("src\\values\\SaveLog.txt", true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println("\tName: " + name + " Score: " + score);
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
