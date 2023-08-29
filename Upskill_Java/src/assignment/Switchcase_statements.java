package assignment;
import java.util.Scanner;

public class Switchcase_statements {
	
	public static void main(String[] args) {
		// to read input from the student
		Scanner scanner = new Scanner(System.in);

		// to enter a student grade
		System.out.print("Enter student grade (A, B, C, D, F): ");
		char grade = scanner.next().charAt(0);

		// Using switch-case statement to determine the grade message based on input
		switch (grade) {
		case 'A':
		System.out.println("Excellent job!");
		break;
		case 'B':
		System.out.println("Good job!");
		break;
		case 'C':
		System.out.println("Average job.");
		break;
		case 'D':
		System.out.println("Needs improvement.");
		break;
		case 'F':
		System.out.println("Failed.");
		break;
		default:
		System.out.println("Invalid grade.");
		break;
		}

		// Close the scanner to release resources
		//scanner.close();
		}
		}