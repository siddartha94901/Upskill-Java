package assignment;
import java.util.Scanner;

public class If_nested {
	//main method
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);//to get data from user
		System.out.print("Enter student grade (A, B, C, D, F): ");//to evaluate
		char grade = scanner.next().charAt(0);
//using if nested statement
		if (grade == 'A') {
		System.out.println("Excellent job!");
		} else {
		if (grade == 'B') {
		System.out.println("Good job!");
		} else {
		if (grade == 'C') {
		System.out.println("Average job.");
		} else {
		if (grade == 'D') {
		System.out.println("Needs improvement.");
		} else {
		if (grade == 'F') {
		System.out.println("Failed.");
		} else {
		System.out.println("Invalid grade.");
		}
		}
		}
		}
		}
		}
		}
		

