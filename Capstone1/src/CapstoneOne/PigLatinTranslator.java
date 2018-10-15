package CapstoneOne;

import java.util.Scanner;

public class PigLatinTranslator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String[] word;
		String vowels = ("aeiouAEIOU");
		String choice = "y";
		System.out.println("Welcome to the Pig Latin Translator!\n");

		do {
			// Prompt and read user for user to import a word to be translated
			System.out.println("Enter a line to be translated: ");
			String sentence = scnr.nextLine();
			word = sentence.split(" ");

			for (int i = 0; i < word.length; i++) {
				// Puts first letter to Lower Case if needed
				word[i] = word[i].toLowerCase();
			}

			// Validates if the first letter of the word starts with a vowel
			char firstChar = '0';
			boolean startsWithVowel = false;

			for (int j = 0; j < word.length; j++) {
				firstChar = word[j].charAt(0);
				int vowelIndex = vowels.indexOf(firstChar); // Find where the vowels are
				startsWithVowel = (vowelIndex >= 0);
			}

			for (int i = 0; i < word.length; i++) {

				// If the word begins with and vowels, add way to the end of the word
				if (startsWithVowel) {
					System.out.println(word[i] + "way");

				} else {
					// add consonants to the end and add ay
					String restOfWord = word[i].substring(1);
					System.out.println("" + restOfWord + firstChar + "ay");
				}
			} // End for loop
			System.out.println("Translate another line? (y/n)"); // Ask to translate another line
			choice = scnr.nextLine();

		} while (choice.equalsIgnoreCase("y")); // If answer is y, then continue, otherwise it end.
		scnr.close();
	}

}
