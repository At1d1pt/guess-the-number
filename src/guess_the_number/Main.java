package guess_the_number;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Integer dif_lvl;
		
		PyJava py = new PyJava();
		
		
		Random my_rand_obj = new Random();
		
		
		
		String d = py.input("Choose Difficulty [e , n , h]: ").toLowerCase();
		
		if (d.equals("h")) {
			dif_lvl = 50;
		} else if (d.equals("e")) {
			dif_lvl = 10;
		} else if (d.equals("n")) {
			dif_lvl = 25;
		} else {
			dif_lvl = 25;
		}
		
		int n = my_rand_obj.nextInt(dif_lvl);
		py.print("Guess The Number!\nThe number lies between 0 and "+String.valueOf(dif_lvl)+"\n\n");
		
		for (int tries = 3 ; tries > 0 ; tries--) {
			String inputed_num = py.input("Enter a number: ");
			
			if (Integer.parseInt(inputed_num) == n) {
				py.print("You guessed the number!");
				break;
			} else {
				if (Integer.parseInt(inputed_num) > n) {
					py.print("Wrong number! You have "+String.valueOf(tries-1)+" tries left.\nHint: The number is less than "+inputed_num);
					continue;
				}
				
				else {
					py.print("Wrong number! You have "+String.valueOf(tries-1)+" tries left.\nHint: The number is greater than "+inputed_num);
					continue;
				}
			}
		}
		
		py.close_scanner();
	}
}