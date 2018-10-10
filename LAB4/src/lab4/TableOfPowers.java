package lab4;

import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int firstInput;
		int sqr, cube;
		String userResponse = "yes";
		do {
			System.out.println("Enter an integer: ");
			firstInput = scnr.nextInt();
			System.out.println("Number" + "      " + "Squared" + "      " + "Cubed");
			System.out.println("======" + "      " + "=======" + "      " + "======");

			for (int i = 1; i <= firstInput; i++) {
				sqr = i * i;
				cube = i * i * i;
				System.out.println(i + "          " + sqr + "            " + cube + "           ");

			}
			System.out.println("Would you like to continue (Y/N)?");
			userResponse = scnr.next();
		} while (userResponse.equals("yes"));
		userResponse = scnr.next();
		

	}

}
