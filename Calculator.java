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
				+ "\nType 5 to determine whether or not a number is a multiple of another,"
				+ "\nType 6 to calculate the slope of the line between two points,"
				+ "\nType 7 to calculate exponents, exponential functions and logarithms,"
				+ "\nType 8 to calculate Pythagorean Theorem,"
				+ "\nType 9 to calculate tangent, sine, and cosine (and their opposites):");
		
		int decision = input.nextInt();
		
		if (decision == 1) {
		
		System.out.println("Please enter the radius of the circle: ");
		double radius = input.nextDouble();
		
		double circumference = 2 * Math.PI * radius;
		
		double area = radius * radius * Math.PI;
		
		double diameter = radius * 2;
		
		System.out.printf("The circumference of the circle is %.2f.", circumference);
		
		System.out.printf("%nThe area of the circle is %.2f.", area);
		
		System.out.printf("%nThe diameter of the circle is %.2f.%n", diameter);
		}
		
		else if (decision == 2) {
		
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
		
		System.out.printf("%nThe difference between %.2f and %.2f is %.2f.", num1, num2, difference);
		
		System.out.printf("%nThe product of %.2f and %.2f is %.2f.", num1, num2, product);
		
		System.out.printf("%nThe quotient of %.2f and %.2f is %.2f.", num1, num2, quotient);
		// Printing out statements for use in comparing the numbers that the user gave,
		// as well as adding, subtracting, multiplying and dividing them. 
		
		
		}
		else if (decision == 3) {
			
		System.out.println("Please input the number you would like to do "
					+ "the sum of n number formula for:");
		int nnumber = input.nextInt();
			
		int cnt = 1;
			
		int sum1 = 0;
			
		while (cnt <= nnumber) {
				
			sum1 = sum1 + cnt;
			
			cnt = cnt + 1;
			
		}
		
		System.out.println(sum1);
		
		}
		else if (decision == 4) {
			
		System.out.println("Please enter your integer: ");
		
		int number = input.nextInt();
			
		if (number % 2 == 0) {
				System.out.printf("The number %d is even.", number);
		}	
		else {
				System.out.printf("The number %d is odd.", number);
		}
	}
		else if (decision == 5) {
			
		System.out.println("Please enter your first integer: ");
	
		int number1 = input.nextInt();
			
		System.out.println("Please enter your second integer: ");
		int number2 = input.nextInt();
			
		if (number1 % number2 == 0) {
			
			System.out.printf("The number %d is a multiple of %d.", number1, number2);
			
		}
		
		else {
		
			System.out.printf("The number %d is NOT a multiple of %d.", number1, number2);
			
		}
			}
		else if (decision == 6) {
		
			System.out.println("What is the first x coordinate?:");
			
			double x1 = input.nextDouble();
			
			System.out.println("What is the first y coordinate?:");
			
			double y1 = input.nextDouble();
			
			System.out.println("What is the second x coordinate?:");
			
			double x2 = input.nextDouble();
			
			System.out.println("What is the second y coordinate?:");
			
			double y2 = input.nextDouble();
			
			double x2minusx1 = x2 - x1;
			
			double y2minusy1 = y2 - y1;
			
			System.out.printf("The slope of the line is %.2f/%.2f.", y2minusy1, x2minusx1);
		}
		else if (decision == 7) {
		
		System.out.println("Type 1 to calculate exponents,"
					+ "\nType 2 to calculate logarithms,"
					+ "\nType 3 to calculate an exponential function:");
		decision = input.nextInt();
			
		if (decision == 1) {
				
		System.out.println("What is the base number?:");
			
		double basenumber = input.nextDouble();
		
		System.out.println("What is the exponent?:");
			
		double exponent = input.nextDouble();
			
		double answer = Math.pow(basenumber, exponent);

		System.out.printf("%.2f to the power of %.2f is %.2f.", basenumber, exponent, answer);	
		}
		else if (decision == 2) {
		
			System.out.println("What is the base of the logarithm?:");
			double base = input.nextDouble();
			
			System.out.println("What is the final answer?:");
			double answer = input.nextDouble();
			
			double logarithmanswer = Math.log(answer) / Math.log(base);
			
			System.out.printf("The logarithm of %.2f with base %.2f is %.2f.", answer, base, logarithmanswer);
		}
		else if (decision == 3) {
			System.out.println("What is the value of the variable a?:");
			
			double variablea = input.nextDouble();
			
			System.out.println("What is the value of the variable b?:");
			
			double variableb = input.nextDouble();
			
			System.out.println("What is the value of the exponent?:");
			
			double exponent = input.nextDouble();
			
			double equation = variablea * Math.pow(variableb, exponent);
			
			System.out.printf("%nThe answer to %.2f * %.2f ^ %.2f is %.2f.", variablea, variableb, exponent, equation);
		}
	}
		else if (decision == 8) {
			System.out.println("Type 1 to calculate a side length,"
					+ "\nType 2 to calculate the hypotenuse:");
			decision = input.nextInt();
			
			if (decision == 1) {
			
				System.out.println("What is the known side length?:");
				
				double sideA = input.nextDouble();
				
				System.out.println("What is the hypotenuse?:");
				
				double hypotenuse = input.nextDouble();
				
				double answer = Math.sqrt((hypotenuse * hypotenuse) - (sideA * sideA));
				
				System.out.printf("The length of the unknown side is %.2f.", answer);
			}
				else if (decision == 2) {
					System.out.println("What is the first known side length?:");
				
					double sideA = input.nextDouble();
					
					System.out.println("What is the second known side length?:");
					
					double sideB = input.nextDouble();
					
					double answer = Math.sqrt((sideA * sideA) + (sideB * sideB));
					
					System.out.printf("The hypotenuse of the triangle is %.2f.", answer);
	}
}
		else if (decision == 9) {
			System.out.println("What is the side length opposite to angle theta?:");
			
			double opposite = input.nextDouble();
			
			System.out.println("What is the side length adjacent to angle theta?:");
			
			double adjacent = input.nextDouble();
			
			System.out.println("What is the length of the hypotenuse?:");
			
			double hypotenuse = input.nextDouble();
			
			double sin = (opposite / hypotenuse);
			
			double cos = (adjacent / hypotenuse);
			
			double tan = (opposite / adjacent);
			
			double csc = (hypotenuse / opposite);
			
			double secant = (hypotenuse / adjacent);
			
			double cotangent = (adjacent / opposite);
			
			System.out.printf("The sin of angle theta is %.2f", sin);
			
			System.out.printf("%nThe cosine of angle theta is %.2f", cos);
			
			System.out.printf("%nThe tangent of angle theta is %.2f", tan);

			System.out.printf("%nThe cosecant of angle theta is %.2f", csc);
			
			System.out.printf("%nThe secant of angle theta is %.2f", secant);
			
			System.out.printf("%nThe cotangent of angle theta is %.2f", cotangent);
		}
		System.out.println("\n\nPut the number 0 to restart the program,"
				+ "\nPut any other number to stop the program.");
		reset = input.nextInt();
		}
	}
}
