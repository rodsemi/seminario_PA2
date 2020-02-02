
import java.util.Scanner;

/*
 * This is the main function for the encrypt and 
 * decrypt app
 */

public class Application {

	public static void main(String[] args) {
		
		// Scanner function 
		Scanner y = new Scanner(System.in);
		
		// while loop displays the menu to user 
		// and takes input
		while(true) {
			System.out.println("Please choose what you want to do in the below options.");
			System.out.println("1. Encrypte a number.");
			System.out.println("2. Decrypte a number.");
			System.out.println("3. Exit from the program.");
			String userInput = y.nextLine();
			int input = 0;
			
			// Java kept attacking me to add a try function while working with 
			// the scanner to check for errors and to make a private class that is
			// located at the bottom 
			// Checks that the input valid
			// If not prompts the user with a message
			try {
				input = Integer.parseInt(userInput);
				if(input < 1 || input > 3) {
					throw new IllegalArgumentException();
				}
			}catch (Exception e) {
					System.out.println("Please try again!");
				}
			
			// If the user clicks 1 (Encrypt) 
			if(input == 1) {
				System.out.println("Please provide a number to encrypte: ");
				int choice = getInput(y);
				System.out.println("Encrypted number: ");
				String encrptNum = "" + Encrypter.encryp(choice);
				int len = encrptNum.length();
				for(int i = 4; i > len; i--) {
					encrptNum = "0" + encrptNum;
				}
				System.out.println(encrptNum);
				
		}
			// If the user clicks 2 (Decrypt)
			else if(input == 2) {
					System.out.println("Please provide a number to decrypte: ");
					int choice = getInput(y);
					System.out.println("Decrypted number: ");
					String decrptNum = "" + Decrypter.decryt(choice);
					int len = decrptNum.length();
					for(int i = 4; i > len; i--) {
						decrptNum = "0" + decrptNum;
			}
					System.out.println(decrptNum);
				
			
		}
			// If the user clicks 3 
			// Program prompts a message to the user
			// and shuts down 
			else if(input == 3) {
				System.out.println("Thank you for choosing my Encrypte and Decrypte application!");
				break;
			}
		
		
		}
		
	}

	// Takes the users input
	private static int getInput(Scanner y) {
		String userInput; 
		
		// Checks to make sure the users
		// input is the proper length 
		// checks for errors and returns 
		// users input in int form 
		userInput = y.nextLine();
		if(userInput.length() != 4) {
			return -1;
		}else {
			try {
				int choice = Integer.parseInt(userInput);
				return choice;
			} catch (Exception e) {
				return -1;
				
			}
		}
		
	}

	
}
