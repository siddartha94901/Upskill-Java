package assignment;
import java.util.Scanner;
public class without_reverseString {
	public static void main(String[] args) {
		// Scanner to read user input
		Scanner scanner = new Scanner(System.in);

		// user to enter a string
		System.out.print("Enter a string: ");
		String original = scanner.nextLine();

		// string to a character array
		char[] charArray = original.toCharArray();

		// Calculate the length of the character array
		int length = charArray.length;

		// Initialize a new character array to store the reversed string
		char[] reversedArray = new char[length];

		// Reverse the characters by copying from original array to reversed array
		for (int i = 0; i < length; i++) {
		reversedArray[length - i - 1] = charArray[i];
		}

		// Convert the reversed character array back to a string
		String reversed = new String(reversedArray);
		
		System.out.println("Reversed String: " + reversed);

		
		}
		}

