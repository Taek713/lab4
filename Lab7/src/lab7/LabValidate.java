package lab7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LabValidate {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Please enter a valid name: ");
		String input = scnr.nextLine();

		CharSequence inputStr = input;
		Pattern pattern = Pattern.compile(new String("^[a-zA-Z\\s]*$"));
		Matcher matcher = pattern.matcher(inputStr); // using matcher to match user input
		if (matcher.matches()) {
			System.out.println("\nName is valid!");
		} else {
			System.out.print("\nSorry, name is not valid!");
		}

		System.out.print("\nPlease enter a valid email: ");
		input = scnr.nextLine();
		validEmail(scnr.nextLine());

		if (matcher.matches()) {
			System.out.println("\nEmail is valid!");
		} else {
			System.out.print("\nSorry,email is not valid!");
		}
		System.out.print("\nPlease enter a valid phone number: ");
		input = scnr.nextLine();
		if (matcher.matches()) {
			System.out.println("\nPhone Number is Valid!");
		} else {
			System.out.println("\nSorry, phone number is not valid!");
		}
		System.out.print("\nPlease enter a valid date: ");
		input = scnr.nextLine();
		if (matcher.matches()) {
			System.out.println("\nDate is Valid!");
		} else {
			System.out.println("\nSorry, phone number is not valid!");

		}

	}

	public static boolean validateName(String name) {// method for name validating

		String rndm = "[a-zA-Z]+\\.?"; // naming it for random just because but could be regex
		Pattern pattern = Pattern.compile(rndm, Pattern.CASE_INSENSITIVE);// Can only be in all caps
		Matcher matcher = pattern.matcher(name);
		return matcher.find();

	}

	public static boolean validEmail(String email) {

		Pattern p = Pattern.compile("^[a-zA-Z][^!?@$%#]*[@][^!?@$%#]{2,20}(\\.[a-zA-Z]{2,3})$");
		Matcher m = p.matcher(email);

		return false;
	}

	public static boolean validNumber(String number) {

		String sPhoneNumber = "605-8889999";

		Pattern pattern = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
		Matcher matcher = pattern.matcher(sPhoneNumber);
		return false;
	}

	public static boolean validDate(String date) {
		boolean isValid = false;
		String expression = "^[0-1][1-2][- / ]?(0[1-9]|[12][0-9]|3[01])[- /]?(18|19|20|21)\\d{2}$";
		return isValid;
	}
}
