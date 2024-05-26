import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double reset = 0;
		
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
				+ "\nType 9 to calculate tangent, sine, and cosine (and their opposites),"
				+ "\nType 10 to calculate quadratic equations,"
				+ "\nType 11 to calculate compounded interest formulas:");
		
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
		
		System.out.println("Type 1 to do addition,"
				+ "\nType 2 to do subtraction,"
				+ "\nType 3 to do multiplication,"
				+ "\nType 4 to do division,"
				+ "\nType 5 to do comparisons between numbers:");
		decision = input.nextInt();
		
		if (decision == 1) {
			
			double sum = 0;
			
			double num = -1;
			
			while (num != 0) {
				
				System.out.println("What is the number you would like to add? (Input 0 to end the addition):");
				
				num = input.nextInt();
			
				sum = sum + num;
			}
			System.out.printf("The sum of all of the inputted numbers is %.2f", sum);
		}
		else if (decision == 2) {
			
			System.out.println("What is your starting number?");
			
			double diff = input.nextDouble();
			
			double num = -1;
			
			while (num != 0) {
				
				System.out.println("What is the  nextnumber you would like to add? (Input 0 to end the subtraction):");
				
				num = input.nextInt();
			
				diff = diff - num;
			}
			System.out.printf("The difference of all of the inputted numbers is %.2f", diff);
		}
		else if (decision == 3) {
			
			System.out.println("What is your starting number?");
			
			double pd =  input.nextDouble();
			
			double num = 0;
			
			while (num != 1) {
				
				System.out.println("What is the next number you would like to multiply? (Input 1 to end the multiplication):");
				
				num = input.nextInt();
			
				pd = pd * num;
			}
			System.out.printf("The product of all of the inputted numbers is %.2f", pd);
		}
		else if (decision == 4) {
			
			System.out.println("What is your starting number?");
			
			double qt = input.nextDouble();
			
			double num = 0;
			
			while (num != 1) {
				
				System.out.println("What is the next number you would like to divide? (Input 1 to end the division):");
				
				num = input.nextInt();
			
				qt = qt / num;
			}
			System.out.printf("The quotient of all of the inputted numbers is %.2f", qt);
		}
		else if (decision == 5) {
			
			System.out.println("Please enter your first number: ");
			double num1 = input.nextDouble();
			
			System.out.println("Please enter your second number: ");
			double num2 = input.nextDouble();
			
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
		}
	}	
		else if (decision == 3) {
			
		System.out.println("What is the maximum for the n natural numbers formula?:");
				
		int number = input.nextInt();
		
		System.out.println("What is the minimum for the n natural numbers formula?:");
			
		int cnt = input.nextInt();
			
		int sum = 0;
			
		while (cnt <= number) {
				
			sum = sum + cnt;
			
			cnt = cnt + 1;
			
		}
		
		System.out.println(sum);
		
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
			
			double la = Math.log(answer) / Math.log(base);
			
			// la is short for logarithm answer
			
			System.out.printf("The logarithm of %.2f with base %.2f is %.2f.", answer, base, la);
		}
		else if (decision == 3) {
			System.out.println("What is the value of the variable a?:");
			
			double a = input.nextDouble();
			
			System.out.println("What is the value of the variable b?:");
			
			double b = input.nextDouble();
			
			System.out.println("What is the answer you're looking for?:");
			
			double answer = input.nextDouble();
			
			double equation = (Math.log(answer) / Math.log(b));
			
			System.out.printf("%nThe answer to %.2f * %.2f ^ %.2f is %.2f.", a, b, equation, answer);
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
		else if (decision == 10) {
			System.out.println("Please input the variable a:");
			
			double a = input.nextDouble();
			
			System.out.println("Please input the variable b:");
			
			double b = input.nextDouble();
			
			System.out.println("Please input the variable c:");
			
			double c = input.nextDouble();
			
			double discriminant = Math.pow(b, 2) - 4 * a * c;
			
			if (discriminant < 0) {
				System.out.println("There are no real roots");
			}
			else {
			
			double x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
			
			double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
			
			System.out.printf("The roots of the quadratic equation are %.3f and %.3f", x1, x2);
			}
		}
		else if (decision == 11) {
			
			System.out.println("Type 1 to do a fixed compounded interest formula,"
					+ "\nType 2 to do a dynamic compounded interest formula");
			
			decision = input.nextInt();
			
			if (decision == 1) {
			
			System.out.println("What is the starting amount?:");
			
			double a = input.nextDouble();
			
			System.out.println("What is the interest %?: "
					+ "(It probably should be an amount less than 1, "
					+ "for example, if you had 10% interest then you'd put .1, etc.)");
			
			double r = input.nextDouble();
			
			System.out.println("How many cycles of interest is the money going through?:");
			
			double n = input.nextDouble();
			
			double answer = a * Math.pow(r + 1, n);
			
			System.out.printf("Your final amount after interest will be $%.2f.", answer);
			}
			else if (decision == 2) {
				
				System.out.println("What is your starting amount?:");
				
				double a = input.nextDouble();
				
				System.out.println("What is the first interest rate? (For ex. if it was 10% then you'd put .1, etc.");
				
				double r = input.nextDouble();
				
				System.out.println("How many interest cycles will this interest rate be active for?:");
				
				int n = input.nextInt();
				
				double fa = 0;
				
				System.out.println("How many more interest rates will you be going through?:");
				
				int ir = input.nextInt();
				
				fa = (a * Math.pow(1 + r, n));
				
				int cnt = 0;
				while (cnt < ir) {
					
				System.out.printf("%nYour current amount after interest is $%.2f", fa);
				
				System.out.println("\nWhat is the next interest rate? (For ex. if it was 10% then you'd put .1, etc.");
				
				r = input.nextDouble();
				
				System.out.println("How many interest cycles will this interest rate be active for?:");
				
				n = input.nextInt();
				
				fa = (fa * Math.pow(1 + r, n));
				
				System.out.printf("%nYour final amount after interest is $%.2f.", fa);
				
				cnt++;
				
				}
			}
		}
		System.out.println("\n\nPut the number 0 to restart the program,"
				+ "\nPut any other number to stop the program.");
		reset = input.nextDouble();
		}
	}
}