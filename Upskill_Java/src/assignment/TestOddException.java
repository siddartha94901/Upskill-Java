package assignment;



public class TestOddException {

	
		// Main class containing the method and main function
		public static void checkEvenNumber(int number) throws OddExpection {
		// Method to check if the number is even or odd and throw an exception if odd
		if (number % 2 != 0) {
		throw new OddExpection("Odd number detected: " + number);
		}
		}

		public static void main(String[] args) {
			int inputNumber = 7; // Replace with any integer you want to test

			try {
			checkEvenNumber(inputNumber); // Call the method to check the number
			System.out.println("Number is even.");
			} catch (OddExpection e) {
			System.err.println("Exception: " + e.getMessage());
			}
		}}
