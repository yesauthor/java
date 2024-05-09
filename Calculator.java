import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int reset = 0;
		
		while (reset == 0) {
		reset = 1;
			
		System.out.println("Type 1 to calculate circle formulas,"
				+ "\nType 2 to calculate simple formulas, "
				+ "\nType 3 to calculate the sum of n natural numbers formula,"
				+ "\nType 4 to determine whether or not a number is odd or even,"
				+ "\nType 5 to determine whether not not a number is a multiple of another:");
		
		int math = input.nextInt();
		
		if (math == 1) {
		
		System.out.println("Please enter the radius of the circle: ");
		double radius = input.nextDouble();
		
		double circumference = 2 * Math.PI * radius;
		
		double area = radius * radius * Math.PI;
		
		double diameter = radius * 2;
		
		System.out.printf("The circumference of the circle is %.2f.", circumference);
		
		System.out.printf("%nThe area of the circle is %.2f.", area);
		
		System.out.printf("%nThe diameter of the circle is %.2f.%n", diameter);
		}
		
		else if (math == 2) {
		
		System.out.println("Please enter your first number: ");
		double num1 = input.nextDouble();
		
		System.out.println("Please enter your second number: ");
		double num2 = input.nextDouble();
		// Asking the user for numbers that the program will use in following calculations
		
		double sum = num1 + num2;
		
		double difference = num1 - num2;
		
		double product = num1 * num2;
		
		double quotient = num1 / num2;
		
		if (num1 == num2) {
			System.out.printf("%.2f is equal to %.2f.", num1, num2);
		}
		else {
			System.out.printf("%.2f is NOT equal to %.2f.", num1, num2);
		}
		if (num1 >= num2) {
			System.out.printf("%n%.2f is greater than or equal to %.2f.", num1, num2);
		}
		else {
			System.out.printf("%n%.2f is less than or equal to %.2f.", num1, num2);
		}
		System.out.printf("%nThe sum of %.2f and %.2f is %.2f.", num1, num2, sum);
		
		System.out.printf("%nThe difference between %.2f and %.2f is %.2f", num1, num2, difference);
		
		System.out.printf("%nThe product of %.2f and %.2f is %.2f", num1, num2, product);
		
		System.out.printf("%nThe quotient of %.2f and %.2f is %.2f", num1, num2, quotient);
		// Printing out statements for use in comparing the numbers that the user gave,
		// as well as adding, subtracting, multiplying and dividing them. 
		
		
		}
		else if (math == 3) {
			System.out.println("Please input the number you would like to do the euler formula for:");
			int euler = input.nextInt();
			
			int cnt = 1;
			
			int sum1 = 0;
			while (cnt <= euler) {
				sum1 = sum1 + cnt;
				cnt = cnt + 1;
			}
			System.out.println(sum1);
			}
		else if (math == 4) {
			
			System.out.println("Please enter your integer: ");
			int number = input.nextInt();
			
			if (number % 2 == 0) {
				System.out.printf("The number %d is even", number);
			}	
			else {
				System.out.printf("The number %d is odd", number);
			}
		}
		else if (math == 5) {
			
			System.out.println("Please enter your first integer: ");
			int number1 = input.nextInt();
			
			System.out.println("Please enter your second integer: ");
			int number2 = input.nextInt();
			
			if (number1 % number2 == 0) {
				System.out.printf("The number %d is a multiple of %d", number1, number2);
			}
			else {
				System.out.printf("The number %d is NOT a multiple of %d", number1, number2);
				}
			}
			System.out.println("\n\nPut the number 0 to restart the program,"
					+ "\nPut any other number to stop the program.");
			reset = input.nextInt();
		}
	}
}