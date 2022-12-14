package game;

import tools.DomParser;
import values.Color;

public class MessageManager {

	public void run() {
		DomParser.init();
		System.out.println(Color.ANSI_CYAN + DomParser.appName + "\n" + DomParser.welcome + "\n" + Color.ANSI_RESET);
	}

	public void mainMenu() {
		System.out.println(Color.ANSI_YELLOW + "\t\t" + DomParser.menu + Color.ANSI_RESET);
	}

	public void whatIsYourName() {
		System.out.println(Color.ANSI_RED + DomParser.yourName + Color.ANSI_RESET);
	}

	public void bye() {
		System.out.println(Color.ANSI_CYAN + DomParser.bye + Color.ANSI_RESET);
	}

	public void legend() {
		System.out.println(Color.ANSI_GREEN + DomParser.legend + Color.ANSI_RESET);
	}

	public void gameOptions() {
		System.out.println(Color.ANSI_YELLOW + DomParser.gameOptions + Color.ANSI_RESET);
	}

	public void gameOver() {
		System.out.println(Color.ANSI_RED + DomParser.gameOver + Color.ANSI_RESET);
	}
}
