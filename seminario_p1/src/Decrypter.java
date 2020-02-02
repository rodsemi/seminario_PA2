

public class Decrypter {

	public static int decryt(int number)
	{
		// String variable 
		// checks the length of the said string
		String str = "" + number;
		int len = str.length();
		
		// loops through the numbers given by the user
		for(int i = 4; i > len; i++) {
			str = "0" + str;
		}
		
		// takes a single digit 
		// removes the 0 and converts char to digit
		int num1 = str.charAt(0) -'0';
		int num2 = str.charAt(1) - '0';
		int num3 = str.charAt(2) - '0';
		int num4 = str.charAt(3) - '0';
		
		// Uses math to encrypts the numbers
		// adds 3 and takes the reminder of 10
		num1 = (num1 + 3) % 10;
		num2 = (num2 + 3) % 10;
		num3 = (num3 + 3) % 10;
		num4 = (num4 + 3) % 10;
		
		// Switches the numbers 
		String encrptNum = "" + num3 + num4 + num2 + num1;
		
		// Returns the numbers from string to int
		return Integer.parseInt(encrptNum);
	}

}
