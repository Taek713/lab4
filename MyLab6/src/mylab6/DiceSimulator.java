package mylab6;

import java.util.Random;
import java.util.Scanner;

public class DiceSimulator {
	private static final Random random = new Random();

	public static void main(final String[] args) {
		String studentNum;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to the Grand Circus Casino!");
		System.out.print("How many sides should the die have? ");

		studentNum = scnr.nextLine();

		
		int answer;
		try (Scanner scanner = new Scanner(System.in)) { // Closing anything that might throw an exception with a try
															// statement
			answer = scnr.nextInt();
		}
		final int[] results = new int[11]; // int[] is the array type, holding the value, hence 11.
		for (int x = 0; x < answer; x++) {
			results[generateRandomDieRoll(x) - 2]++;// Also using brackets to index into my array int []
		}
		System.out.println(String.format("%s  ", answer));
		for (int i = 0; i < 11; i++) {
			System.out.println(String.format("%s ", i + 2, results[i]));
			System.out.println(String.format("%s ", i + 2, results[i]));
		}
	}

	public static int generateRandomDieRoll(int sides) {
		return random.nextInt(6) + random.nextInt(6) + 2;

	}

}
