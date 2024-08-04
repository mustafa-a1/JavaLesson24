package day3;

public class BrowserSwitchStatement {

	public static void main(String[] args) {

	determineBrowser("edge");
		
		
	}

	// Write a switch statement to determine which browser to be launched. Chrome,
	// edge, firefox.

	public static void determineBrowser(String browserName) {

		switch (browserName) {
		case "chrome": {
			System.out.println("Chrome is launched.");
			break;
		}
		case "firefox": {
			System.out.println("Firefox is launched.");
			break;
		}
		case "edge": {
			System.out.println("Edge is launched.");
			break;
		}
		default: {
			System.out.println("This browser is not supported.");
		}

		}
	}

}
