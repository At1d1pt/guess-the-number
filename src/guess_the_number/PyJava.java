package guess_the_number;

import java.util.Scanner;

public class PyJava {
	Scanner myScanner = new Scanner(System.in);
	
	public void print(String text) {
		System.out.println(text);
	}
	
	public String input(String msg) {
		System.out.println(msg);
		String input_data = myScanner.nextLine();
		return(input_data);
	}
	
	public Boolean close_scanner() {
		myScanner.close();
		return(true);
	}
}
