package assignment;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		//  Scanner to read user input
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter a string
		System.out.print("Enter a string: ");
		String original = scanner.nextLine();

		// Using StringBuilder to reverse the string
		StringBuilder reversed = new StringBuilder(original);
		reversed.reverse();

		
		System.out.println("Reversed String: " + reversed);
		
		}
		}
	