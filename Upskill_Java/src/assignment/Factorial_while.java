package assignment;
import java.util.Scanner;//java library
public class Factorial_while {
	public static void main(String[] args) {

		int A=1; int B=1; //intialize the variables 
//to get number from the user
	
		System.out.println("Number"); 
		Scanner s= new Scanner(System.in);
		int c=s.nextInt();
//using while loop statement
		while(A<=c) { B=B*A;
	A++;
		}
//to print the given number
		System.out.println(B);
	}
}
