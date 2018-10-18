package bonuslab20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//Using only array lists for all methods.
public class BonusLab20 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		Map<String, Double> inventory = new HashMap<>(); // Create a Map for items in the store
		inventory = fillInventory(inventory); // assigns the method to a variable in the main to use

		ArrayList<String> shoppingCart = new ArrayList<>(); // array to add items to the shopping cart
		String cont = "y";// cont for continue
		String userInput;

		do {
			userInput = getValidInventoryChoice(scnr, "Please enter a menu item:", inventory);

			shoppingCart.add(userInput); // add items to the shoppingCart
			listPrice(shoppingCart, inventory); // Prints out items in the cart and the prices in
												// the cart

			System.out.println("Add another item? y/n");
			cont = scnr.nextLine();

		} while (cont.trim().toLowerCase().startsWith("y"));// use trim() to eliminate the spaces,toLowerCase to turn
															// the strings to lower case, and startsWith to check if the
															// prefix of the boolean "y" is true or not

		System.out.println("Thanks for shopping with us! \nThis is what's in your cart:");
		listPrice(shoppingCart, inventory); // prints out columns of what's in the cart and their price
		average(shoppingCart, inventory); // calls average method
		highest(shoppingCart, inventory); // calls highest method
		lowest(shoppingCart, inventory); // calls lowest method
	}

	private static Map<String, Double> fillInventory(Map<String, Double> inventory) {// Using double for items prices

		inventory.put("Kalbi", 3.99);// inventory.put for printing out the inventory items. Can also make a list as
										// long as you want.
		inventory.put("Kimchi", 4.99);
		inventory.put("Noodles", 7.39);
		inventory.put("Cheetos", 1.49);
		inventory.put("Udon", 6.59);
		inventory.put("Juice", 1.39);
		inventory.put("Water", 1.29);
		inventory.put("Tea", 1.99);
		inventory.put("Pop", 1.19);

		String format = "%s\t\t%s"; // Formatting the display table, using \t to tab 6 spaces.

		System.out.println("Welcome to Guenther's Market!\n");
		System.out.printf(format, "Item", "Price");
		System.out.println("\n======================");// Formatting the line under Items and the prices.
		for (Map.Entry<String, Double> entry : inventory.entrySet()) {// enhanced for loops for all methods
			System.out.println(entry.getKey() + "\t\t$" + entry.getValue());
		}

		return inventory;
	}

	private static String getValidInventoryChoice(Scanner scnr, String prompt, Map<String, Double> inventory) {
		String userInput = null; // keep null
		boolean inputIsValid = false;

		do {
			System.out.println(prompt);
			userInput = scnr.nextLine();
			if (inventory.keySet().contains(userInput)) { // Using KeySet to get to values of HashMap
				break; // Break the loop
			} else {
				System.out.println("Sorry, we don't offer this item, please try again.");
				continue;
			}
		} while (inputIsValid == false);// Set to false when input fails

		return userInput;// returning the user input
	}

	private static void average(ArrayList<String> shoppingCart, Map<String, Double> inventory) {// Method for getting
																								// the average price
		double sum = 0;// the total price, added together
		int count = 0; // the number of individual items
		for (String essentials : shoppingCart) { // Think of it as "essentials for shopping cart" as word play to help,
													// hence why i named it essentials

			// sum get from the inventory,
			// the "value" of the "key" in this case fruit!
			sum += inventory.get(essentials);
			count++;
		}
		System.out.println("Average price: " + sum / count);
	}

	private static void highest(ArrayList<String> shoppingCart, Map<String, Double> inventory) {// Method for getting
																								// highest price
		double highest = 0.0;// Set to 0.0 then add later to get actual total

		for (String food : shoppingCart) {// Using enhanced for loops to shorten work

			if (highest < inventory.get(food)) {
				highest = inventory.get(food);
			}
		}
		System.out.println("Highest Price: " + highest);

	}

	private static void lowest(ArrayList<String> shoppingCart, Map<String, Double> inventory) {// Method for getting
																								// lowest price
		double lowest = 1e9; // using 1e-9 means one times ten to the negative ninth power.

		for (String fats : shoppingCart) {// Naming methods anything related to shopping at a grocery store.

			if (lowest > inventory.get(fats)) {
				lowest = inventory.get(fats);
			}
		}
		System.out.println("Lowest Price: " + lowest);

	}

	private static void listPrice(ArrayList<String> shoppingCart, Map<String, Double> inventory) {// Method for listing
																									// the price
		double price = 0.0; // Using double because we are working with money and need a decimal

		for (String item : shoppingCart) {
			price = inventory.get(item);
			System.out.println(item + "\t\t " + price);
		}

	}

}
