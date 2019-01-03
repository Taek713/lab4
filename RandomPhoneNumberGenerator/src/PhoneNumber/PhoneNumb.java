package PhoneNumber;

import java.util.Random;

public class PhoneNumb {

	public static void main(String[] args) { // Main method
		String x = "248"; // Create a string for the phones area code
		
		Random y = new Random(); // Generator for random number
		System.out.println(x + y.nextInt(10000000)); // Output by adding "x" with random y (y.nextInt())
	}
}
