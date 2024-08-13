package day8.exceptionsDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

	public static void main(String[] args) {

		System.out.println("Program started...");

		try {
			FileInputStream fis = new FileInputStream("C://file.txt");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		System.out.println("Program ends...");
		
	}

}
