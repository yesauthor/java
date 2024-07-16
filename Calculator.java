import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		ArrayList<Double> Data = new ArrayList<Double>();
		ArrayList<Double> stdev = new ArrayList<Double>();
		Map<Integer, Integer> FrequencyMap = new HashMap<>();
		String reset = "reset";
		
		while (reset.equals("reset")) {
		reset = "no reset";
			
		System.out.println("Enter the type of math you would like to do (refer to the readme to understand what to type to get the code to work): ");
		
		// to do list: add more stuff for quadratics; different formulas such as root formulas and vertex formulas
		// also how to find vertex and roots from those specific formulas
		// add probability of d4, d6, d8, d10, d12, d20, d100, card and coin presets (h or t) as well as custom presets that dont include those.
		
		
		String decision = input.next();
		
		if (decision.equals("circle")) {
			
			System.out.println("\nType the option you would like that is located in the readme:");
			
			decision = input.next();
			
			if (decision.equals("simple")) {
		
		System.out.println("Please enter the radius of the circle: ");
		double radius = input.nextDouble();
		
		double circumference = 2 * Math.PI * radius;
		
		double area = radius * radius * Math.PI;
		
		double diameter = radius * 2;
		
		System.out.printf("The circumference of the circle is %.2f.", circumference);
		
		System.out.printf("%nThe area of the circle is %.2f.", area);
		
		System.out.printf("%nThe diameter of the circle is %.2f.%n", diameter);
		}
			if (decision.equals("rad")) {
			
			System.out.println("\nType the option you would like that is located in the readme:");
			
			decision = input.next();
			
			if (decision.equals("rads")) {
				
				System.out.println("What's the amount of degrees are you trying to convert to radians?:");
				
				double degrees = input.nextDouble();
				
				double equation = degrees / 180;
				
				System.out.printf("Radians: %.3f𝛑", equation);
				
			}
			else if (decision.equals("deg")) {
				
				System.out.println("How many radians are you trying to convert to degrees?:");
				
				double radians = input.nextDouble();
				
				double equation = 180 * radians;
				
				System.out.printf("Degrees: %.3f", equation);
			}
		}
	}	
		else if (decision.equals("simple")) {
		
		System.out.println("Type the option you would like that is located in the readme:");
		
		decision = input.next();
		
		if (decision.equals("add")) {
			
			double sum = 0;
			
			double num = -1;
			//number
			
			while (num != 0) {
				
				System.out.println("What is the number you would like to add? (Input 0 to end the addition):");
				
				num = input.nextDouble();
			
				sum = sum + num;
			}
			System.out.printf("The sum of all of the inputted numbers is %.2f", sum);
		}
		else if (decision.equals("subtract")) {
			
			System.out.println("What is your starting number?");
			
			double diff = input.nextDouble();
			//difference, the solution of subtraction.
			
			double num = -1;
			
			while (num != 0) {
				
				System.out.println("What is the  nextnumber you would like to add? (Input 0 to end the subtraction):");
				
				num = input.nextDouble();
			
				diff = diff - num;
			}
			System.out.printf("The difference of all of the inputted numbers is %.2f", diff);
		}
		else if (decision.equals("multiply")) {

			System.out.println("What is your starting number?");
			
			double pd =  input.nextDouble();
			//product, the solution of multiplication.
			
			double num = 0;
			
			while (num != 1) {
				
				System.out.println("What is the next number you would like to multiply? (Input 1 to end the multiplication):");
				
				num = input.nextDouble();
			
				pd = pd * num;
			}
			System.out.printf("The product of all of the inputted numbers is %.2f", pd);
		}
		else if (decision.equals("divide")) {
			
			System.out.println("What is your starting number?");
			
			double qt = input.nextDouble();
			//quotient, the solution of division
			
			double num = 0;
			
			while (num != 1) {
				
				System.out.println("What is the next number you would like to divide? (Input 1 to end the division):");
				
				num = input.nextDouble();
			
				qt = qt / num;
			}
			System.out.printf("The quotient of all of the inputted numbers is %.2f", qt);
		}
		else if (decision.equals("compare")) {
			
			decision = "yes";
			
			while (decision.equals("yes")) {
				
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
				
			System.out.println("Would you like to compare more numbers? Type yes if so.");
			
			decision = input.next();
				
			}
		}
	}
}	
		else if (decision.equals("euler")) {
			
		System.out.println("What is the maximum for the n natural numbers formula?:");
				
		int number = input.nextInt();
		
		System.out.println("What is the minimum for the n natural numbers formula?:");
			
		int cnt = input.nextInt();
		//counter for decision
			
		int sum = 0;
			
		while (cnt <= number) {
				
			sum = sum + cnt;
			
			cnt = cnt + 1;
			
		}
		
		System.out.println(sum);
		
		} 
		else if (decision.equals("evenodd")) {
			
			decision = "continue";
			
		while (decision.equals("continue")) {
			
		System.out.println("Please enter your integer: ");
		
		int number = input.nextInt();
					
		if (number % 2 == 0) {
				System.out.printf("The number %d is even.", number);
		}	
		else {
				System.out.printf("The number %d is odd.", number);
		}
		System.out.println("Type continue if you would like to input more numbers:");
		
		decision = input.next();
	}
}
		else if (decision.equals("multiple")) {
			
		decision = "continue";
		
		while (decision.equals("continue")) {
			
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
		System.out.println("Type 'continue' if you would like to input more numbers:");
		
		decision = input.next();
	}
}
		else if (decision.equals("slope")) {
		
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
			
			//slope formula is y2 - y1/x2 - x1; these variables are named in the exact same way.
			
			System.out.printf("The slope of the line is %.2f/%.2f.", y2minusy1, x2minusx1);
		}
		else if (decision.equals("exp")) {
		
		System.out.println("Type the option you would like that is located in the readme:");
		decision = input.next();
			
		if (decision.equals("exp")) {
			
			while (decision.equals("exp")) {
				
		System.out.println("What is the base number?:");
			
		double basenumber = input.nextDouble();
		
		System.out.println("What is the exponent?:");
			
		double exponent = input.nextDouble();
			
		double answer = Math.pow(basenumber, exponent);

		System.out.printf("%.2f to the power of %.2f is %.2f.%n", basenumber, exponent, answer);	
		
		System.out.println("Type exp to input another exponent, type anything else to end the loop.");
		
		decision = input.next();
		}
	}
		else if (decision.equals("sqrt")) {
			
			while (decision.equals("sqrt")) {

				System.out.println("What is the base number?:");
				
				double basenumber = input.nextDouble();
					
				double answer = Math.sqrt(basenumber);

				System.out.printf("The square root of %.2f is %.2f.%n", basenumber, answer);	
				
				System.out.println("Type sqrt to input another number to get the square root of, type anything else to end the loop.");
				
				decision = input.next();
			}
		}
		else if (decision.equals("log")) {
			
			while (decision.equals("log")) {
		
			System.out.println("What is the base of the logarithm?:");
			double base = input.nextDouble();
			
			System.out.println("What is the final answer?:");
			double answer = input.nextDouble();
			
			double la = Math.log(answer) / Math.log(base);
			
			// la is short for logarithm answer
			
			System.out.printf("The logarithm of %.2f with base %.2f is %.2f.", answer, base, la);
			
			System.out.println("Type log to input another logarithm, type anything else to end the loop.");
			
			decision = input.next();
		}
	}
		else if (decision.equals("ycoord")) {
			
			while (decision.equals("ycoord")) {
			System.out.println("What is the value of the variable a?:");
			
			double a = input.nextDouble();
			
			System.out.println("What is the value of the variable b?:");
			
			double b = input.nextDouble();
			
			System.out.println("What is the power of the variable?:");
			
			double exponent = input.nextDouble();
			
			// variables are named after the equation; a * b^n
			
			double equation = a * Math.pow(b, exponent);
			
			System.out.printf("%nThe answer (correlating to the y value) to %.2f * %.2f ^ %.2f is %.2f.", a, b, exponent, equation);
			
			System.out.println("Type ycoord to input another exponential function, type anything else to end the loop.");
			
			decision = input.next();
		}
	}
		else if (decision.equals("xcoord")) {
			
			while (decision.equals("xcoord")) {
			System.out.println("What is the value of the variable a?:");
			
			double a = input.nextDouble();
			
			System.out.println("What is the value of the y?:");
			
			double y = input.nextDouble();
			
			System.out.println("What is the power of the variable b?:");
			
			double exponent = input.nextDouble();
			
			// variables are named after the equation; a * b^n
			
			double answer = a * Math.pow(y, exponent);
			
			System.out.printf("%nThe answer (correlating to the x value) to %.2f * %.2f ^ %.2f is %.2f.", a, y, exponent, answer);
			
			System.out.println("Type xcoord to input another exponential function, type anything else to end the loop.");
			
			decision = input.next();
		}
	}
}
		else if (decision.equals("pythag")) {
			System.out.println("Type side to calculate a side length,"
					+ "\nType hypot to calculate the hypotenuse:");
			decision = input.next();
			
			if (decision.equals("side")) {
			
				System.out.println("What is the known side length?:");
				
				double sideA = input.nextDouble();
				
				System.out.println("What is the hypotenuse?:");
				
				double hypotenuse = input.nextDouble();
				
				double answer = Math.sqrt((hypotenuse * hypotenuse) - (sideA * sideA));
				
				// hypotenuse ^ 2 - a side of the triangle ^ 2 = missing side length ^ 2
				
				System.out.printf("The length of the unknown side is %.2f.", answer);
			}
				else if (decision.equals("hypot")) {
					System.out.println("What is the first known side length?:");
				
					double sideA = input.nextDouble();
					
					System.out.println("What is the second known side length?:");
					
					double sideB = input.nextDouble();
					
					double answer = Math.sqrt((sideA * sideA) + (sideB * sideB));
					
					// side a ^ 2 + side b ^ 2 = hypotenuse ^ 2
					
					System.out.printf("The hypotenuse of the triangle is %.2f.", answer);
	}
}
		else if (decision.equals("cossintan")) {
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
			
			// all triangle formulas, just search it up at this point idfk, also i never double checked this so might b wrong
			
			System.out.printf("The sin of angle theta is %.2f", sin);
			
			System.out.printf("%nThe cosine of angle theta is %.2f", cos);
			
			System.out.printf("%nThe tangent of angle theta is %.2f", tan);

			System.out.printf("%nThe cosecant of angle theta is %.2f", csc);
			
			System.out.printf("%nThe secant of angle theta is %.2f", secant);
			
			System.out.printf("%nThe cotangent of angle theta is %.2f", cotangent);
		}
		else if (decision.equals("quad")) {
			
			System.out.println("\nType the option you would like that is located in the readme:");
			
			decision = input.next();
			
			if (decision.equals("rootstan")) {
			
			System.out.println("Please input the variable a:");
			
			double a = input.nextDouble();
			
			System.out.println("Please input the variable b:");
			
			double b = input.nextDouble();
			
			System.out.println("Please input the variable c:");
			
			double c = input.nextDouble();
			
			double discriminant = Math.pow(b, 2) - 4 * a * c;
			
			// following the quadratic formula for -b +- sqrt b^2 - 4 * a * c
			
			if (discriminant < 0) {
				System.out.println("There are no real roots");
			}
			else {
			
			double x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
			
			double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
			
			System.out.printf("The roots of the quadratic equation are %.3f and %.3f", x1, x2);
			}
		}
			else if (decision.equals("rootsvert")) {
				
			}
	}
		else if (decision.equals("intr")) {
			
			System.out.println("\nType the option you would like that is located in the readme:");
			
			decision = input.next();
			
			if (decision.equals("fixed")) {
				
			while (decision.equals("fixed")) {
			
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
			
			System.out.println("Type fixed if you'd like to calculate the fixed interest rate of a different amount:");
			
			decision = input.next();
		}
	}
			else if (decision.equals("dynam")) {
				
				System.out.println("What is your starting amount?:");
				
				double a = input.nextDouble();
				
				// a = original amount
				
				System.out.println("What is the first interest rate? (For ex. if it was 10% then you'd put .1, etc.");
				
				double r = input.nextDouble();
				
				// r = first interest rate
				
				System.out.println("How many interest cycles will this interest rate be active for?:");
				
				int n = input.nextInt();
				
				// n = amount of interest cycles (usually years or other measurements of time
				
				double fa = 0;
				
				// final amount that will be shown at the end
				
				System.out.println("How many more interest rates will you be going through?:");
				
				int ir = input.nextInt();
				
				// ir = used to keep track of how many interest rates the money will go through
				
				fa = (a * Math.pow(1 + r, n));
				
				for (int cnt = 0;cnt < ir; cnt++) {
					
				System.out.printf("%nYour current amount after interest is $%.2f", fa);
				
				System.out.println("\nWhat is the next interest rate? (For ex. if it was 10% then you'd put .1, etc.");
				
				r = input.nextDouble();
				
				System.out.println("How many interest cycles will this interest rate be active for?:");
				
				n = input.nextInt();
				
				fa = (fa * Math.pow(1 + r, n));
				}
				System.out.printf("%nYour final amount after interest is $%.2f.", fa);
			}
		} 
		else if (decision.equals("bmi")) {
			
			decision = "continue";
			
			while (decision.equals("continue")) {
			
			System.out.println("What is your height in inches?: ");
			double height = input.nextDouble();
			
			System.out.println("What is your weight in pounds?: ");
			double weight = input.nextDouble();
			
			double bmi = weight / Math.pow(height, 2) * 703;
			
			System.out.printf("Your Body Mass Index is %.2f%n", bmi);
			
			if (bmi < 18.5) {
				System.out.println("You are considered underweight for your height.");
			}
			else if (18.6 < bmi & bmi < 24.9) {
				System.out.println("You are considered average weight for your height");
			}
			else if (25 < bmi & bmi < 29.9) {
				System.out.println("You are considered overweight for your height");
			} 
			else {
				System.out.println("You are considered obese for your height.");
			}
			
			System.out.println("Would you like to continue measuring bmi? Type continue if so, type anything else to stop.");
			
			decision = input.next();
		}
	}
		else if (decision.equals("gpa")) {
		
		double total = 0;
		double GPA = 0;
		double average;
		int cnt = 0;
		int Aplus = 0;
		int A = 0;
		int Aminus = 0;
		int Bplus = 0;
		int B = 0;
		int Bminus = 0;
		int Cplus = 0;
		int C = 0;
		int Cminus = 0;
		int Dplus = 0;
		int D = 0;
		int F = 0;
		
		decision = "yes";
		
		while (decision.equals("yes")) {
			
		System.out.println("Please enter numerical grade.");
		
		average = input.nextDouble();
		total = total + average;
		cnt = cnt + 1;
		
		if (average <= 100 & average >= 97) {
			Aplus++;
			GPA = GPA + 4;
		}
		else if (average >= 93 & average < 97) {
			A++;
			GPA = GPA + 4;
		}
		else if (average < 93 & average >= 90) {
			Aminus++;
			GPA = GPA + 3.7;
		}
		else if (average < 90 & average >= 87) {
			Bplus++;
			GPA = GPA + 3.3;
		}
		else if (average < 87 & average >= 83) {
			B++;
			GPA = GPA + 3.0;
		}
		else if (average < 83 & average >= 80) {
			Bminus++;
			GPA = GPA + 2.7;
		}
		else if (average < 80 & average >= 77) {
			Cplus++;
			GPA = GPA + 2.3;
		}
		else if (average < 77 & average >= 73) {
			C++;
			GPA = GPA + 2.0;
		}
		else if (average < 73 & average >= 70) {
			Cminus++;
			GPA = GPA + 1.7;
		}
		else if (average < 70 & average >= 67) {
			Dplus++;
			GPA = GPA + 1.3;
		}
		else if (average < 67 & average >= 60) {
			D++;
			GPA = GPA + 1.0;
		}
		else {
			F++;
			GPA = GPA + 0;
		}
		
		System.out.println("Would you like to enter another grade? (If yes, please type yes, and if not, type anything else.");
		
		decision = input.next();
		
	}
		GPA = (double) GPA / cnt;
		total = (double) total / cnt;
		
		System.out.println("\nGrade Report:");
		
		if (cnt != 0) {
			
			System.out.println("Numbers of each grade:");
			System.out.println("A+: " + Aplus);
			System.out.println("A: " + A);
			System.out.println("A-: " + Aminus);
			System.out.println("B+: " + Bplus);
			System.out.println("B: " + B);
			System.out.println("B-:" + Bminus);
			System.out.println("C+: " + Cplus);
			System.out.println("C: " + C);
			System.out.println("C-: " + Cminus);
			System.out.println("D+: " + Dplus);
			System.out.println("D: " + D);
			System.out.println("F: " + F);
			System.out.printf("Average GPA: %.2f", GPA);
			System.out.printf("%nTotal numerical average: %.2f", total);
		}
		else {
			System.out.println("No grades were entered, sorry.");
		}
}
		else if (decision.equals("stats")) {
			System.out.println("\nType the option you would like that is located in the readme:");
			
			decision = input.next();
			
			if (decision.equals("data")) {
				
			while (decision.equals("data")) {
				
				double data = 0;
				int cnt = 0;
				double mean = 0;
				int ctt = 0;
				
				System.out.println("How many points on the data set do you have?: ");
				int pt = input.nextInt();
					
				while (cnt < pt) {
					
				System.out.println("What is a value in your set of data?: ");
					
				data = input.nextDouble();
					Data.add(data);
				mean = mean + data;
						
					cnt++;
					}
				if (Data.isEmpty() == true) {
					System.out.println("You didn't enter any data points");
				}	
				else {
				Collections.sort(Data);
					
				int median = 0;
				int med = 0;
				double median2 = 0;
				double med2 = 0;
				int quartile1 = 0;
				int q1 = 0;
				double quart1 = 0;
				double qu1 = 0;
				int quartile3 = 0;
				int q3 = 0;
				double quart3 = 0;
				double qu3 = 0;
				double iqr = 0;
				double fq1 = 0;
				double fq3 = 0;
				double fm = 0;
				double outlier1;
				double outlier2;
				double range = 0;
				double sd = 0;
				double avg = 0;
					
				if (pt % 2 == 1) {
				median = pt / 2;
				quartile1 = pt / 4;
				q1 = pt / 4;
				quartile3 = pt * 3 / 4;
				q3 = pt * 3 / 4;
				
				median2 = Data.get(median);
				quart1 = Data.get(quartile1);
				qu1 = Data.get(q1);
				quart3 = Data.get(quartile3);
				qu3 = Data.get(q3);
				
				fq1 = (quart1 + qu1) / 2;
				fq3 = (quart3 + qu3) / 2;
				
				iqr = fq3 - fq1;
					
				outlier1 = iqr * 1.5;
				
				outlier1 = fq3 + outlier1;
					
				outlier2 = iqr * 1.5;
					
				outlier2 = fq1 - outlier2;
						
				range = Data.get(cnt - 1) - Data.get(0);
				
				mean = mean / Data.size();
				
				final double outlier3 = outlier1;
				
				final double outlier4 = outlier2;
				
				final double fim = mean;
				
				Data.forEach( (n) -> { stdev.add(n);});
				
				stdev.replaceAll( (n) -> n = Math.abs(n - fim));
				
				stdev.replaceAll( (n) -> n = Math.pow(n, 2));
				
				
				while (ctt < pt) {
					sd =  sd + stdev.get(ctt);
					ctt++;
				}
				avg = sd / (pt - 1);
				
				sd = Math.sqrt(avg);
					
				System.out.printf("%nThe maximum of the data set is %.2f.%n", Data.get(cnt - 1));
				
				System.out.printf("%nThe minimum of the data set is %.2f.%n", Data.get(0));
					
				System.out.printf("%nThe range of the data set is %.2f.%n", range);
					
				System.out.printf("%nThe value for quartile 1 is %.2f.%n", fq1);
					
				System.out.printf("%nThe median of your data set is %.2f.%n", median2);
				
				System.out.printf("%nThe mean of your data set is %.2f.%n", mean);
					
				System.out.printf("%nThe value for quartile 3 is %.2f.%n", fq3);
					
				System.out.printf("%nThe interquartile range is %.2f.%n", iqr);
				
				System.out.printf("%nThe standard deviation of the data is %.2f.%n", sd);
					
				System.out.printf("%nNumbers in the data set above %.2f should be considered as outliers.%n", outlier1);
					
				System.out.printf("%nNumbers in the data set below %.2f should be considered as outliers.%n", outlier2);
				
				System.out.printf("%nThe size of your data set is %d.%n",Data.size());
				
				Data.forEach( (n) ->  {if (n > outlier3) {
					System.out.printf("%.2f is an upper outlier.%n", n);
				} else if (n < outlier4) {
					System.out.printf("%.2f is a lower outlier.%n", n); 
			}
				});
				
				if (mean > median2) {
					System.out.println("If you were to graph these data points, the graph would be positively (right) skewed");
					
					System.out.println("Since the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
				}
				else if (median2 > mean) {
					System.out.println("If you were to graph these data points, the graph would be negatively (left) skewed");
					
					System.out.println("Since the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
				}
				else {
					System.out.println("\nIf you were to graph these data points, the graph would be symmetrical.");
					
					System.out.println("Since the data is symmetrical, it is recommended to use the mean and Standard Deviation (St. Dev).");
				} 
				if (mean == median2) {
			
				System.out.println("Would you like to calculate z-score? If so, please input 'zscore' and if not then type anything else:");
				decision = input.next();
				
				if (decision.equals("zscore")) {
					
					while (decision.equals("zscore")) {
					
				System.out.println("Please input the number you'd like to calculate the z score for:");
				double number = input.nextDouble();
				
				double zscore = (number - mean) / sd;
				
				if (zscore == 1) {
					System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the right) of the mean.%n", number, Math.abs(zscore));
				}
				else if (zscore == -1) {
					System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the left) of the mean.%n", number, Math.abs(zscore));
				}
				else if (zscore > 0) {
					System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the right) from the mean.%n", number, Math.abs(zscore));
				}
				else if (zscore < 0 ){
					System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the left) of the mean.%n", number, Math.abs(zscore));
				}
				else {
					System.out.printf("%nThe inputted number (%.2f) is the same as the mean (%.2f).%n", number, mean);
					}
				if (zscore > 2) {
					System.out.printf("The inputted number %.2f is a positive outlier.%n", number);
				}
				else if (zscore < -2) {
					System.out.printf("The inputted number %.2f is a negative outlier.%n", number);
				}
				if (zscore >= -1 & zscore <= 1) {
					System.out.printf("The inputted number %.2f lies within 68 percent of the data.%n", number);
				}
				else if (zscore >= -2 & zscore <= 2) {
					System.out.printf("The inputted number %.2f lies within 95 percent of the data.%n", number);
				}
				else if (zscore >= -3 & zscore <= 3) {
					System.out.printf("The inputted number %.2f lies within 99.7 percent of the data.%n", number);
				}
				double sixtyeightp = mean + (1 * sd);
				
				double sixeightp = mean - (1 * sd);
				
				double ninetyfivep = mean + (2 * sd);
				
				double ninefivep = mean - (2 * sd);
				
				double ninetyninepointsevenp = mean + (3 * sd);
				
				double ninenineptsevenp = mean - (3 * sd);
				
				System.out.printf("68 percent of the data lies between %.2f and %.2f.%n", sixeightp, sixtyeightp);
				
				System.out.printf("95 percent of the data lies between %.2f and %.2f.%n", ninefivep, ninetyfivep);
				
				System.out.printf("99.7 percent of the data lies between %.2f and %.2f.%n", ninenineptsevenp, ninetyninepointsevenp);
				
				System.out.println("\nWould you like to calculate the zscore of another number for the same data set? "
						+ "Input 'zscore' if so, type anything else if not.");
				decision = input.next();
				}
			}
		}
	}
				else {
				median = pt / 2 - 1;
				med = pt / 2;
					
				q1 = pt / 4;
					
				q3 = pt * 3 / 4;
					
				median2 = Data.get(median);
				med2 = Data.get(med);
				
				qu1 = Data.get(q1);
				
				qu3 = Data.get(q3);
				
				iqr = qu3 - qu1;
				
				fm = (median2 + med2) / 2;
				
				outlier1 = iqr * 1.5;
				
				outlier1 = qu3 + outlier1;
				
				outlier2 = iqr * 1.5;
					
				outlier2 = qu1 - outlier2;
					
				range = Data.get(cnt - 1) - Data.get(0);
			
				mean = mean / Data.size();
				
				final double outlier3 = outlier1;
				
				final double outlier4 = outlier2;
				
				final double fim = mean;
				
				Data.forEach( (n) -> { stdev.add(n);});
				
				stdev.replaceAll( (n) -> n = Math.abs(n - fim));
				
				stdev.replaceAll( (n) -> n = Math.pow(n, 2));
				
				while (ctt < pt) {
					sd =  sd + stdev.get(ctt);
					ctt++;
				}
				avg = sd / (pt - 1);
				
				sd = Math.sqrt(avg);
					
				System.out.printf("%nThe maximum of the data set is %.2f.%n", Data.get(cnt - 1));
					
				System.out.printf("%nThe minimum of the data set is %.2f.%n", Data.get(0));
					
				System.out.printf("%nThe range of the data set is %.2f.%n", range);
					
				System.out.printf("%nThe value for quartile 1 is %.2f.%n", qu1);
					
				System.out.printf("%nThe median of your data set is %.2f.%n", fm);
				
				System.out.printf("%nThe mean of your data set is %.2f.%n", mean);
					
				System.out.printf("%nThe value for quartile 3 is %.2f.%n", qu3);
					
				System.out.printf("%nThe interquartile range is %.2f.%n", iqr);
				
				System.out.printf("%nThe standard deviation of the data is %.3f.%n", sd);
					
				System.out.printf("%nNumbers in the data set above %.2f should be considered as outliers.%n", outlier1);
					
				System.out.printf("%nNumbers in the data set below %.2f should be considered as outliers.%n", outlier2);
					
				System.out.printf("%nThe size of your data set is %d.%n%n",Data.size());
				
				Data.forEach( (n) ->  {if (n > outlier3) {
					System.out.printf("%.2f is an upper outlier.%n", n);
				} else if (n < outlier4) {
					System.out.printf("%.2f is a lower outlier.%n", n); 
			}
				});
				
				if (mean > fm) {
					System.out.println("\nIf you were to graph these data points, the graph would be positively (right) skewed.");
					
					System.out.println("\nSince the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
				}
				else if (fm > mean) {
					System.out.println("\nIf you were to graph these data points, the graph would be negatively (left) skewed.");
					
					System.out.println("\nSince the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
				}
				else {
					System.out.println("\nIf you were to graph these data points, the graph would be symmetrical.");
					
					System.out.println("\nSince the data is symmetrical, it is recommended to use the mean and Standard Deviation (St. Dev).");
					
					if (mean == fm) {
					System.out.println("Would you like to calculate z-score? If so, please input 'zscore' and if not then type anything else:");
					decision = input.next();
					
					if (decision.equals("zscore")) {
						
						while (decision.equals("zscore")) {
						
					System.out.println("Please input the number you'd like to calculate the z score for:");
					double number = input.nextDouble();
					
					double zscore = (number - mean) / sd;
					
					if (zscore == 1) {
						System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the right) of the mean.%n", number, Math.abs(zscore));
					}
					else if (zscore == -1) {
						System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the left) of the mean.%n", number, Math.abs(zscore));
					}
					else if (zscore > 0) {
						System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the right) from the mean.%n", number, Math.abs(zscore));
					}
					else if (zscore < 0 ){
						System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the left) of the mean.%n", number, Math.abs(zscore));
					}
					else {
						System.out.printf("%nThe inputted number  (%.2f) is the same as the mean (%.2f).%n ", number, mean);
									}
					if (zscore > 2) {
						System.out.printf("The inputted number %.2f is a positive outlier.%n", number);
					}
					else if (zscore < -2) {
						System.out.printf("The inputted number %.2f is a negative outlier.%n", number);
					}
					if (zscore >= -1 & zscore <= 1) {
						System.out.printf("The inputted number %.2f lies within 68 percent of the data.%n", number);
					}
					else if (zscore >= -2 & zscore <= 2) {
						System.out.printf("The inputted number %.2f lies within 95 percent of the data.%n", number);
					}
					else if (zscore >= -3 & zscore <= 3) {
						System.out.printf("The inputted number %.2f lies within 99.7 percent of the data.%n", number);
					}
					double sixtyeightp = mean + (1 * sd);
					
					double sixeightp = mean - (1 * sd);
					
					double ninetyfivep = mean + (2 * sd);
					
					double ninefivep = mean - (2 * sd);
					
					double ninetyninepointsevenp = mean + (3 * sd);
					
					double ninenineptsevenp = mean - (3 * sd);
					
					System.out.printf("68 percent of the data lies between %.2f and %.2f.%n", sixeightp, sixtyeightp);
					
					System.out.printf("95 percent of the data lies between %.2f and %.2f.%n", ninefivep, ninetyfivep);
					
					System.out.printf("99.7 percent of the data lies between %.2f and %.2f.%n", ninenineptsevenp, ninetyninepointsevenp);
					
					System.out.println("\nWould you like to calculate the zscore of another number for the same data set?"
							+ " Input 'zscore' if so, type anything else if not.");
					decision = input.next();
								}
							}
						}
					}	
				}
			}
			Data.clear();
			stdev.clear();
			
			System.out.println("\nWould you like to input another set of data? If so, please input 'data', if not then type anything else:");
			
			decision = input.next();
			
	}
}
			else if (decision.equals("prob")) {
				
				System.out.println("Type your option according to what is stated in the readme under 14b:");
				
				decision = input.next();
			
				if (decision.equals("d4")) {
					
					while (decision.equals("d4")) {
						int range = 4;
				        double mean = 0;
				        int ctt = 0; 
				        int freq;
				        int numbers;
				        int mostFrequentNumber = -1;
				        int leastFrequentNumber = -1;
				        int maxFrequency = -1;
				        int minFrequency = Integer.MAX_VALUE;
				        System.out.println("Enter the number of random numbers to generate: ");
				        int amt = input.nextInt();

				        for (int i = 0; i < amt; i++) {
				            int rng = random.nextInt(range) + 1;
				            FrequencyMap.put(rng, FrequencyMap.getOrDefault(rng, 0) + 1);
				            double rng2 = rng;
				            Data.add(rng2);
				            mean = mean + rng;
				        }

				        System.out.println("\n\n\nFrequencies of each randomly generated number:");
				        for (Map.Entry<Integer, Integer> entry : FrequencyMap.entrySet()) {
				            System.out.println("Number " + entry.getKey() + ": " + entry.getValue() + " times");
				            numbers = entry.getKey();
				            freq = entry.getValue();
					        double percentage = (double) freq / amt * 100;
					        System.out.printf("Approx. percentage for number %d is %.2f%%.%n%n", entry.getKey(), percentage);
					        
					        if (freq > maxFrequency) {
				                maxFrequency = freq;
				                mostFrequentNumber = numbers;
				            }
				            if (freq < minFrequency) {
				                minFrequency = freq;
				                leastFrequentNumber = numbers;
				            }
				        }
				        
				        if (Data.isEmpty() == true) {
							System.out.println("You didn't enter any data points");
						}	
						else {
						Collections.sort(Data);
							
						int median = 0;
						int med = 0;
						double median2 = 0;
						double med2 = 0;
						int quartile1 = 0;
						int q1 = 0;
						double quart1 = 0;
						double qu1 = 0;
						int quartile3 = 0;
						int q3 = 0;
						double quart3 = 0;
						double qu3 = 0;
						double iqr = 0;
						double fq1 = 0;
						double fq3 = 0;
						double fm = 0;
						double outlier1;
						double outlier2;
						double Rnge = 0;
						double sd = 0;
						double avg = 0;
							
						if (amt % 2 == 1) {
						median = amt / 2;
						quartile1 = amt / 4;
						q1 = amt / 4;
						quartile3 = amt * 3 / 4;
						q3 = amt * 3 / 4;
						
						median2 = Data.get(median);
						quart1 = Data.get(quartile1);
						qu1 = Data.get(q1);
						quart3 = Data.get(quartile3);
						qu3 = Data.get(q3);
						
						fq1 = (quart1 + qu1) / 2;
						fq3 = (quart3 + qu3) / 2;
						
						iqr = fq3 - fq1;
							
						outlier1 = iqr * 1.5;
						
						outlier1 = fq3 + outlier1;
							
						outlier2 = iqr * 1.5;
							
						outlier2 = fq1 - outlier2;
								
						Rnge = Data.get(amt - 1) - Data.get(0);
						
						mean = mean / Data.size();
						
						final double outlier3 = outlier1;
						
						final double outlier4 = outlier2;
						
						final double fim = mean;
						
						Data.forEach( (n) -> { stdev.add(n);});
						
						stdev.replaceAll( (n) -> n = Math.abs(n - fim));
						
						stdev.replaceAll( (n) -> n = Math.pow(n, 2));
						
						
						while (ctt < amt) {
							sd =  sd + stdev.get(ctt);
							ctt++;
						}
						avg = sd / (amt - 1);
						
						sd = Math.sqrt(avg);
							
						System.out.printf("%nThe maximum of the data set is %.2f.%n", Data.get(amt - 1));
						
						System.out.printf("%nThe minimum of the data set is %.2f.%n", Data.get(0));
							
						System.out.printf("%nThe range of the data set is %.2f.%n", Rnge);
							
						System.out.printf("%nThe value for quartile 1 is %.2f.%n", fq1);
							
						System.out.printf("%nThe median of your data set is %.2f.%n", median2);
						
						System.out.printf("%nThe mean of your data set is %.2f.%n%n", mean);
						
						System.out.printf("Most Frequent Number: %d (Frequency: %d)%n%n", mostFrequentNumber, maxFrequency);
				        
						System.out.printf("Least Frequent Number: %d (Frequency: %d)%n", leastFrequentNumber, minFrequency);
							
						System.out.printf("%nThe value for quartile 3 is %.2f.%n", fq3);
							
						System.out.printf("%nThe interquartile range is %.2f.%n", iqr);
						
						System.out.printf("%nThe standard deviation of the data is %.2f.%n", sd);
							
						System.out.printf("%nNumbers in the data set above %.2f should be considered as outliers.%n", outlier1);
							
						System.out.printf("%nNumbers in the data set below %.2f should be considered as outliers.%n", outlier2);		
						
						System.out.printf("%nThe size of your data set is %d.%n",Data.size());
						
						Data.forEach( (n) ->  {if (n > outlier3) {
							System.out.printf("%.2f is an upper outlier.%n", n);
						} else if (n < outlier4) {
							System.out.printf("%.2f is a lower outlier.%n", n); 
					}
						});
						
						if (mean > median2) {
							System.out.println("If you were to graph these data points, the graph would be positively (right) skewed");
							
							System.out.println("Since the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else if (median2 > mean) {
							System.out.println("If you were to graph these data points, the graph would be negatively (left) skewed");
							
							System.out.println("Since the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else {
							System.out.println("\nIf you were to graph these data points, the graph would be symmetrical.");
							
							System.out.println("Since the data is symmetrical, it is recommended to use the mean and Standard Deviation (St. Dev).");
						} 
						if (mean == median2) {
					
						System.out.println("Would you like to calculate z-score? If so, please input 'zscore' and if not then type anything else:");
						decision = input.next();
						
						if (decision.equals("zscore")) {
							
							while (decision.equals("zscore")) {
							
						System.out.println("Please input the number you'd like to calculate the z score for:");
						double number = input.nextDouble();
						
						double zscore = (number - mean) / sd;
						
						if (zscore == 1) {
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the right) of the mean.%n", number, Math.abs(zscore));
						}
						else if (zscore == -1) {
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the left) of the mean.%n", number, Math.abs(zscore));
						}
						else if (zscore > 0) {
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the right) from the mean.%n", number, Math.abs(zscore));
						}
						else if (zscore < 0 ){
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the left) of the mean.%n", number, Math.abs(zscore));
						}
						else {
							System.out.printf("%nThe inputted number (%.2f) is the same as the mean (%.2f).%n", number, mean);
							}
						if (zscore > 2) {
							System.out.printf("The inputted number %.2f is a positive outlier.%n", number);
						}
						else if (zscore < -2) {
							System.out.printf("The inputted number %.2f is a negative outlier.%n", number);
						}
						if (zscore >= -1 & zscore <= 1) {
							System.out.printf("The inputted number %.2f lies within 68 percent of the data.%n", number);
						}
						else if (zscore >= -2 & zscore <= 2) {
							System.out.printf("The inputted number %.2f lies within 95 percent of the data.%n", number);
						}
						else if (zscore >= -3 & zscore <= 3) {
							System.out.printf("The inputted number %.2f lies within 99.7 percent of the data.%n", number);
						}
						double sixtyeightp = mean + (1 * sd);
						
						double sixeightp = mean - (1 * sd);
						
						double ninetyfivep = mean + (2 * sd);
						
						double ninefivep = mean - (2 * sd);
						
						double ninetyninepointsevenp = mean + (3 * sd);
						
						double ninenineptsevenp = mean - (3 * sd);
						
						System.out.printf("68 percent of the data lies between %.2f and %.2f.%n", sixeightp, sixtyeightp);
						
						System.out.printf("95 percent of the data lies between %.2f and %.2f.%n", ninefivep, ninetyfivep);
						
						System.out.printf("99.7 percent of the data lies between %.2f and %.2f.%n", ninenineptsevenp, ninetyninepointsevenp);
						
						System.out.println("\nWould you like to calculate the zscore of another number for the same data set? "
								+ "Input 'zscore' if so, type anything else if not.");
						decision = input.next();
						}
					}
				}
			}
						else {
						median = amt / 2 - 1;
						med = amt / 2;
							
						q1 = amt / 4;
							
						q3 = amt * 3 / 4;
							
						median2 = Data.get(median);
						med2 = Data.get(med);
						
						qu1 = Data.get(q1);
						
						qu3 = Data.get(q3);
						
						iqr = qu3 - qu1;
						
						fm = (median2 + med2) / 2;
						
						outlier1 = iqr * 1.5;
						
						outlier1 = qu3 + outlier1;
						
						outlier2 = iqr * 1.5;
							
						outlier2 = qu1 - outlier2;
							
						Rnge = Data.get(amt - 1) - Data.get(0);
					
						mean = mean / Data.size();
						
						final double outlier3 = outlier1;
						
						final double outlier4 = outlier2;
						
						final double fim = mean;
						
						Data.forEach( (n) -> { stdev.add(n);});
						
						stdev.replaceAll( (n) -> n = Math.abs(n - fim));
						
						stdev.replaceAll( (n) -> n = Math.pow(n, 2));
						
						while (ctt < amt) {
							sd =  sd + stdev.get(ctt);
							ctt++;
						}
						avg = sd / (amt - 1);
						
						sd = Math.sqrt(avg);
							
						System.out.printf("%nThe maximum of the data set is %.2f.%n", Data.get(amt - 1));
							
						System.out.printf("%nThe minimum of the data set is %.2f.%n", Data.get(0));
							
						System.out.printf("%nThe range of the data set is %.2f.%n", Rnge);
							
						System.out.printf("%nThe value for quartile 1 is %.2f.%n", qu1);
							
						System.out.printf("%nThe median of your data set is %.2f.%n", fm);
						
						System.out.printf("%nThe mean of your data set is %.2f.%n%n", mean);
						
						System.out.printf("Most Frequent Number: %d (Frequency: %d)%n%n", mostFrequentNumber, maxFrequency);
				        
						System.out.printf("Least Frequent Number: %d (Frequency: %d)%n", leastFrequentNumber, minFrequency);
							
						System.out.printf("%nThe value for quartile 3 is %.2f.%n", qu3);
							
						System.out.printf("%nThe interquartile range is %.2f.%n", iqr);
						
						System.out.printf("%nThe standard deviation of the data is %.3f.%n", sd);
							
						System.out.printf("%nNumbers in the data set above %.2f should be considered as outliers.%n", outlier1);
							
						System.out.printf("%nNumbers in the data set below %.2f should be considered as outliers.%n", outlier2);
							
						System.out.printf("%nThe size of your data set is %d.%n%n",Data.size());
						
						Data.forEach( (n) ->  {if (n > outlier3) {
							System.out.printf("%.2f is an upper outlier.%n", n);
						} else if (n < outlier4) {
							System.out.printf("%.2f is a lower outlier.%n", n); 
					}
						});
						
						if (mean > fm) {
							System.out.println("\nIf you were to graph these data points, the graph would be positively (right) skewed.");
							
							System.out.println("\nSince the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else if (fm > mean) {
							System.out.println("\nIf you were to graph these data points, the graph would be negatively (left) skewed.");
							
							System.out.println("\nSince the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else {
							System.out.println("\nIf you were to graph these data points, the graph would be symmetrical.");
							
							System.out.println("\nSince the data is symmetrical, it is recommended to use the mean and Standard Deviation (St. Dev).");
							
							if (mean == fm) {
							System.out.println("Would you like to calculate z-score? If so, please input 'zscore' and if not then type anything else:");
							decision = input.next();
							
							if (decision.equals("zscore")) {
								
								while (decision.equals("zscore")) {
								
							System.out.println("Please input the number you'd like to calculate the z score for:");
							double number = input.nextDouble();
							
							double zscore = (number - mean) / sd;
							
							if (zscore == 1) {
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the right) of the mean.%n", number, Math.abs(zscore));
							}
							else if (zscore == -1) {
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the left) of the mean.%n", number, Math.abs(zscore));
							}
							else if (zscore > 0) {
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the right) from the mean.%n", number, Math.abs(zscore));
							}
							else if (zscore < 0 ){
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the left) of the mean.%n", number, Math.abs(zscore));
							}
							else {
								System.out.printf("%nThe inputted number  (%.2f) is the same as the mean (%.2f).%n ", number, mean);
											}
							if (zscore > 2) {
								System.out.printf("The inputted number %.2f is a positive outlier.%n", number);
							}
							else if (zscore < -2) {
								System.out.printf("The inputted number %.2f is a negative outlier.%n", number);
							}
							if (zscore >= -1 & zscore <= 1) {
								System.out.printf("The inputted number %.2f lies within 68 percent of the data.%n", number);
							}
							else if (zscore >= -2 & zscore <= 2) {
								System.out.printf("The inputted number %.2f lies within 95 percent of the data.%n", number);
							}
							else if (zscore >= -3 & zscore <= 3) {
								System.out.printf("The inputted number %.2f lies within 99.7 percent of the data.%n", number);
							}
							double sixtyeightp = mean + (1 * sd);
							
							double sixeightp = mean - (1 * sd);
							
							double ninetyfivep = mean + (2 * sd);
							
							double ninefivep = mean - (2 * sd);
							
							double ninetyninepointsevenp = mean + (3 * sd);
							
							double ninenineptsevenp = mean - (3 * sd);
							
							System.out.printf("68 percent of the data lies between %.2f and %.2f.%n", sixeightp, sixtyeightp);
							
							System.out.printf("95 percent of the data lies between %.2f and %.2f.%n", ninefivep, ninetyfivep);
							
							System.out.printf("99.7 percent of the data lies between %.2f and %.2f.%n", ninenineptsevenp, ninetyninepointsevenp);
							
							System.out.println("\nWould you like to calculate the zscore of another number for the same data set?"
									+ " Input 'zscore' if so, type anything else if not.");
							decision = input.next();
										}
									}
								}
							}	
						}
					}
				    	Data.clear();
						stdev.clear();
						FrequencyMap.clear();
						
				        System.out.println("Would you like to do another simulation of d4 dice? Type 'd4' if so.");
				        decision = input.next();
				}
			}
				else if (decision.equals("d6")) {
					
					while (decision.equals("d6")) {
						int range = 6;
				        double mean = 0;
				        int ctt = 0;
				        int freq;
				        int numbers;
				        int mostFrequentNumber = -1;
				        int leastFrequentNumber = -1;
				        int maxFrequency = -1;
				        int minFrequency = Integer.MAX_VALUE;
				        System.out.println("Enter the number of random numbers to generate: ");
				        int amt = input.nextInt();

				        for (int i = 0; i < amt; i++) {
				            int rng = random.nextInt(range) + 1;
				            FrequencyMap.put(rng, FrequencyMap.getOrDefault(rng, 0) + 1);
				            double rng2 = rng;
				            Data.add(rng2);
				            mean = mean + rng;
				        }

				        System.out.println("\n\n\nFrequencies of each randomly generated number:");
				        for (Map.Entry<Integer, Integer> entry : FrequencyMap.entrySet()) {
				            System.out.println("Number " + entry.getKey() + ": " + entry.getValue() + " times");
				            numbers = entry.getKey();
				            freq = entry.getValue();
					        double percentage = (double) freq / amt * 100;
					        System.out.printf("Approx. percentage for number %d is %.2f%%.%n%n", entry.getKey(), percentage);
					        
					        if (freq > maxFrequency) {
				                maxFrequency = freq;
				                mostFrequentNumber = numbers;
				            }
				            if (freq < minFrequency) {
				                minFrequency = freq;
				                leastFrequentNumber = numbers;
				            }
				        }
				        
				        if (Data.isEmpty() == true) {
							System.out.println("You didn't enter any data points");
						}	
						else {
						Collections.sort(Data);
							
						int median = 0;
						int med = 0;
						double median2 = 0;
						double med2 = 0;
						int quartile1 = 0;
						int q1 = 0;
						double quart1 = 0;
						double qu1 = 0;
						int quartile3 = 0;
						int q3 = 0;
						double quart3 = 0;
						double qu3 = 0;
						double iqr = 0;
						double fq1 = 0;
						double fq3 = 0;
						double fm = 0;
						double outlier1;
						double outlier2;
						double Rnge = 0;
						double sd = 0;
						double avg = 0;
							
						if (amt % 2 == 1) {
						median = amt / 2;
						quartile1 = amt / 4;
						q1 = amt / 4;
						quartile3 = amt * 3 / 4;
						q3 = amt * 3 / 4;
						
						median2 = Data.get(median);
						quart1 = Data.get(quartile1);
						qu1 = Data.get(q1);
						quart3 = Data.get(quartile3);
						qu3 = Data.get(q3);
						
						fq1 = (quart1 + qu1) / 2;
						fq3 = (quart3 + qu3) / 2;
						
						iqr = fq3 - fq1;
							
						outlier1 = iqr * 1.5;
						
						outlier1 = fq3 + outlier1;
							
						outlier2 = iqr * 1.5;
							
						outlier2 = fq1 - outlier2;
								
						Rnge = Data.get(amt - 1) - Data.get(0);
						
						mean = mean / Data.size();
						
						final double outlier3 = outlier1;
						
						final double outlier4 = outlier2;
						
						final double fim = mean;
						
						Data.forEach( (n) -> { stdev.add(n);});
						
						stdev.replaceAll( (n) -> n = Math.abs(n - fim));
						
						stdev.replaceAll( (n) -> n = Math.pow(n, 2));
						
						
						while (ctt < amt) {
							sd =  sd + stdev.get(ctt);
							ctt++;
						}
						avg = sd / (amt - 1);
						
						sd = Math.sqrt(avg);
							
						System.out.printf("%nThe maximum of the data set is %.2f.%n", Data.get(amt - 1));
						
						System.out.printf("%nThe minimum of the data set is %.2f.%n", Data.get(0));
							
						System.out.printf("%nThe range of the data set is %.2f.%n", Rnge);
							
						System.out.printf("%nThe value for quartile 1 is %.2f.%n", fq1);
							
						System.out.printf("%nThe median of your data set is %.2f.%n", median2);
						
						System.out.printf("%nThe mean of your data set is %.2f.%n%n", mean);
						
						System.out.printf("Most Frequent Number: %d (Frequency: %d)%n%n", mostFrequentNumber, maxFrequency);
				        
						System.out.printf("Least Frequent Number: %d (Frequency: %d)%n", leastFrequentNumber, minFrequency);
							
						System.out.printf("%nThe value for quartile 3 is %.2f.%n", fq3);
							
						System.out.printf("%nThe interquartile range is %.2f.%n", iqr);
						
						System.out.printf("%nThe standard deviation of the data is %.2f.%n", sd);
							
						System.out.printf("%nNumbers in the data set above %.2f should be considered as outliers.%n", outlier1);
							
						System.out.printf("%nNumbers in the data set below %.2f should be considered as outliers.%n", outlier2);
						
						System.out.printf("%nThe size of your data set is %d.%n",Data.size());
						
						Data.forEach( (n) ->  {if (n > outlier3) {
							System.out.printf("%.2f is an upper outlier.%n", n);
						} else if (n < outlier4) {
							System.out.printf("%.2f is a lower outlier.%n", n); 
					}
						});
						
						if (mean > median2) {
							System.out.println("If you were to graph these data points, the graph would be positively (right) skewed");
							
							System.out.println("Since the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else if (median2 > mean) {
							System.out.println("If you were to graph these data points, the graph would be negatively (left) skewed");
							
							System.out.println("Since the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else {
							System.out.println("\nIf you were to graph these data points, the graph would be symmetrical.");
							
							System.out.println("Since the data is symmetrical, it is recommended to use the mean and Standard Deviation (St. Dev).");
						} 
						if (mean == median2) {
					
						System.out.println("Would you like to calculate z-score? If so, please input 'zscore' and if not then type anything else:");
						decision = input.next();
						
						if (decision.equals("zscore")) {
							
							while (decision.equals("zscore")) {
							
						System.out.println("Please input the number you'd like to calculate the z score for:");
						double number = input.nextDouble();
						
						double zscore = (number - mean) / sd;
						
						if (zscore == 1) {
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the right) of the mean.%n", number, Math.abs(zscore));
						}
						else if (zscore == -1) {
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the left) of the mean.%n", number, Math.abs(zscore));
						}
						else if (zscore > 0) {
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the right) from the mean.%n", number, Math.abs(zscore));
						}
						else if (zscore < 0 ){
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the left) of the mean.%n", number, Math.abs(zscore));
						}
						else {
							System.out.printf("%nThe inputted number (%.2f) is the same as the mean (%.2f).%n", number, mean);
							}
						if (zscore > 2) {
							System.out.printf("The inputted number %.2f is a positive outlier.%n", number);
						}
						else if (zscore < -2) {
							System.out.printf("The inputted number %.2f is a negative outlier.%n", number);
						}
						if (zscore >= -1 & zscore <= 1) {
							System.out.printf("The inputted number %.2f lies within 68 percent of the data.%n", number);
						}
						else if (zscore >= -2 & zscore <= 2) {
							System.out.printf("The inputted number %.2f lies within 95 percent of the data.%n", number);
						}
						else if (zscore >= -3 & zscore <= 3) {
							System.out.printf("The inputted number %.2f lies within 99.7 percent of the data.%n", number);
						}
						double sixtyeightp = mean + (1 * sd);
						
						double sixeightp = mean - (1 * sd);
						
						double ninetyfivep = mean + (2 * sd);
						
						double ninefivep = mean - (2 * sd);
						
						double ninetyninepointsevenp = mean + (3 * sd);
						
						double ninenineptsevenp = mean - (3 * sd);
						
						System.out.printf("68 percent of the data lies between %.2f and %.2f.%n", sixeightp, sixtyeightp);
						
						System.out.printf("95 percent of the data lies between %.2f and %.2f.%n", ninefivep, ninetyfivep);
						
						System.out.printf("99.7 percent of the data lies between %.2f and %.2f.%n", ninenineptsevenp, ninetyninepointsevenp);
						
						System.out.println("\nWould you like to calculate the zscore of another number for the same data set? "
								+ "Input 'zscore' if so, type anything else if not.");
						decision = input.next();
						}
					}
				}
			}
						else {
						median = amt / 2 - 1;
						med = amt / 2;
							
						q1 = amt / 4;
							
						q3 = amt * 3 / 4;
							
						median2 = Data.get(median);
						med2 = Data.get(med);
						
						qu1 = Data.get(q1);
						
						qu3 = Data.get(q3);
						
						iqr = qu3 - qu1;
						
						fm = (median2 + med2) / 2;
						
						outlier1 = iqr * 1.5;
						
						outlier1 = qu3 + outlier1;
						
						outlier2 = iqr * 1.5;
							
						outlier2 = qu1 - outlier2;
							
						Rnge = Data.get(amt - 1) - Data.get(0);
					
						mean = mean / Data.size();
						
						final double outlier3 = outlier1;
						
						final double outlier4 = outlier2;
						
						final double fim = mean;
						
						Data.forEach( (n) -> { stdev.add(n);});
						
						stdev.replaceAll( (n) -> n = Math.abs(n - fim));
						
						stdev.replaceAll( (n) -> n = Math.pow(n, 2));
						
						while (ctt < amt) {
							sd =  sd + stdev.get(ctt);
							ctt++;
						}
						avg = sd / (amt - 1);
						
						sd = Math.sqrt(avg);
							
						System.out.printf("%nThe maximum of the data set is %.2f.%n", Data.get(amt - 1));
							
						System.out.printf("%nThe minimum of the data set is %.2f.%n", Data.get(0));
							
						System.out.printf("%nThe range of the data set is %.2f.%n", Rnge);
							
						System.out.printf("%nThe value for quartile 1 is %.2f.%n", qu1);
							
						System.out.printf("%nThe median of your data set is %.2f.%n", fm);
						
						System.out.printf("%nThe mean of your data set is %.2f.%n%n", mean);
						
						System.out.printf("Most Frequent Number: %d (Frequency: %d)%n%n", mostFrequentNumber, maxFrequency);
				        
						System.out.printf("Least Frequent Number: %d (Frequency: %d)%n", leastFrequentNumber, minFrequency);
							
						System.out.printf("%nThe value for quartile 3 is %.2f.%n", qu3);
							
						System.out.printf("%nThe interquartile range is %.2f.%n", iqr);
						
						System.out.printf("%nThe standard deviation of the data is %.3f.%n", sd);
							
						System.out.printf("%nNumbers in the data set above %.2f should be considered as outliers.%n", outlier1);
							
						System.out.printf("%nNumbers in the data set below %.2f should be considered as outliers.%n", outlier2);
							
						System.out.printf("%nThe size of your data set is %d.%n%n",Data.size());
						
						Data.forEach( (n) ->  {if (n > outlier3) {
							System.out.printf("%.2f is an upper outlier.%n", n);
						} else if (n < outlier4) {
							System.out.printf("%.2f is a lower outlier.%n", n); 
					}
						});
						
						if (mean > fm) {
							System.out.println("\nIf you were to graph these data points, the graph would be positively (right) skewed.");
							
							System.out.println("\nSince the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else if (fm > mean) {
							System.out.println("\nIf you were to graph these data points, the graph would be negatively (left) skewed.");
							
							System.out.println("\nSince the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else {
							System.out.println("\nIf you were to graph these data points, the graph would be symmetrical.");
							
							System.out.println("\nSince the data is symmetrical, it is recommended to use the mean and Standard Deviation (St. Dev).");
							
							if (mean == fm) {
							System.out.println("Would you like to calculate z-score? If so, please input 'zscore' and if not then type anything else:");
							decision = input.next();
							
							if (decision.equals("zscore")) {
								
								while (decision.equals("zscore")) {
								
							System.out.println("Please input the number you'd like to calculate the z score for:");
							double number = input.nextDouble();
							
							double zscore = (number - mean) / sd;
							
							if (zscore == 1) {
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the right) of the mean.%n", number, Math.abs(zscore));
							}
							else if (zscore == -1) {
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the left) of the mean.%n", number, Math.abs(zscore));
							}
							else if (zscore > 0) {
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the right) from the mean.%n", number, Math.abs(zscore));
							}
							else if (zscore < 0 ){
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the left) of the mean.%n", number, Math.abs(zscore));
							}
							else {
								System.out.printf("%nThe inputted number  (%.2f) is the same as the mean (%.2f).%n ", number, mean);
											}
							if (zscore > 2) {
								System.out.printf("The inputted number %.2f is a positive outlier.%n", number);
							}
							else if (zscore < -2) {
								System.out.printf("The inputted number %.2f is a negative outlier.%n", number);
							}
							if (zscore >= -1 & zscore <= 1) {
								System.out.printf("The inputted number %.2f lies within 68 percent of the data.%n", number);
							}
							else if (zscore >= -2 & zscore <= 2) {
								System.out.printf("The inputted number %.2f lies within 95 percent of the data.%n", number);
							}
							else if (zscore >= -3 & zscore <= 3) {
								System.out.printf("The inputted number %.2f lies within 99.7 percent of the data.%n", number);
							}
							double sixtyeightp = mean + (1 * sd);
							
							double sixeightp = mean - (1 * sd);
							
							double ninetyfivep = mean + (2 * sd);
							
							double ninefivep = mean - (2 * sd);
							
							double ninetyninepointsevenp = mean + (3 * sd);
							
							double ninenineptsevenp = mean - (3 * sd);
							
							System.out.printf("68 percent of the data lies between %.2f and %.2f.%n", sixeightp, sixtyeightp);
							
							System.out.printf("95 percent of the data lies between %.2f and %.2f.%n", ninefivep, ninetyfivep);
							
							System.out.printf("99.7 percent of the data lies between %.2f and %.2f.%n", ninenineptsevenp, ninetyninepointsevenp);
							
							System.out.println("\nWould you like to calculate the zscore of another number for the same data set?"
									+ " Input 'zscore' if so, type anything else if not.");
							decision = input.next();
										}
									}
								}
							}	
						}
					}
				    	Data.clear();
						stdev.clear();
						FrequencyMap.clear();
						
				        System.out.println("Would you like to do another simulation of d6 dice? Type 'd6' if so.");
				        decision = input.next();
					}
				}
				else if (decision.equals("d8")) {
					while (decision.equals("d8")) {
						int range = 8;
				        double mean = 0;
				        int ctt = 0;
				        int freq;
				        int numbers;
				        int mostFrequentNumber = -1;
				        int leastFrequentNumber = -1;
				        int maxFrequency = -1;
				        int minFrequency = Integer.MAX_VALUE;
				        System.out.println("Enter the number of random numbers to generate: ");
				        int amt = input.nextInt();

				        for (int i = 0; i < amt; i++) {
				            int rng = random.nextInt(range) + 1;
				            FrequencyMap.put(rng, FrequencyMap.getOrDefault(rng, 0) + 1);
				            double rng2 = rng;
				            Data.add(rng2);
				            mean = mean + rng;
				        }

				        System.out.println("\n\n\nFrequencies of each randomly generated number:");
				        for (Map.Entry<Integer, Integer> entry : FrequencyMap.entrySet()) {
				            System.out.println("Number " + entry.getKey() + ": " + entry.getValue() + " times");
				            numbers = entry.getKey();
				            freq = entry.getValue();
					        double percentage = (double) freq / amt * 100;
					        System.out.printf("Approx. percentage for number %d is %.2f%%.%n%n", entry.getKey(), percentage);
					        
					        if (freq > maxFrequency) {
				                maxFrequency = freq;
				                mostFrequentNumber = numbers;
				            }
				            if (freq < minFrequency) {
				                minFrequency = freq;
				                leastFrequentNumber = numbers;
				            }
				        }
				        
				        if (Data.isEmpty() == true) {
							System.out.println("You didn't enter any data points");
						}	
						else {
						Collections.sort(Data);
							
						int median = 0;
						int med = 0;
						double median2 = 0;
						double med2 = 0;
						int quartile1 = 0;
						int q1 = 0;
						double quart1 = 0;
						double qu1 = 0;
						int quartile3 = 0;
						int q3 = 0;
						double quart3 = 0;
						double qu3 = 0;
						double iqr = 0;
						double fq1 = 0;
						double fq3 = 0;
						double fm = 0;
						double outlier1;
						double outlier2;
						double Rnge = 0;
						double sd = 0;
						double avg = 0;
							
						if (amt % 2 == 1) {
						median = amt / 2;
						quartile1 = amt / 4;
						q1 = amt / 4;
						quartile3 = amt * 3 / 4;
						q3 = amt * 3 / 4;
						
						median2 = Data.get(median);
						quart1 = Data.get(quartile1);
						qu1 = Data.get(q1);
						quart3 = Data.get(quartile3);
						qu3 = Data.get(q3);
						
						fq1 = (quart1 + qu1) / 2;
						fq3 = (quart3 + qu3) / 2;
						
						iqr = fq3 - fq1;
							
						outlier1 = iqr * 1.5;
						
						outlier1 = fq3 + outlier1;
							
						outlier2 = iqr * 1.5;
							
						outlier2 = fq1 - outlier2;
								
						Rnge = Data.get(amt - 1) - Data.get(0);
						
						mean = mean / Data.size();
						
						final double outlier3 = outlier1;
						
						final double outlier4 = outlier2;
						
						final double fim = mean;
						
						Data.forEach( (n) -> { stdev.add(n);});
						
						stdev.replaceAll( (n) -> n = Math.abs(n - fim));
						
						stdev.replaceAll( (n) -> n = Math.pow(n, 2));
						
						
						while (ctt < amt) {
							sd =  sd + stdev.get(ctt);
							ctt++;
						}
						avg = sd / (amt - 1);
						
						sd = Math.sqrt(avg);
							
						System.out.printf("%nThe maximum of the data set is %.2f.%n", Data.get(amt - 1));
						
						System.out.printf("%nThe minimum of the data set is %.2f.%n", Data.get(0));
							
						System.out.printf("%nThe range of the data set is %.2f.%n", Rnge);
							
						System.out.printf("%nThe value for quartile 1 is %.2f.%n", fq1);
							
						System.out.printf("%nThe median of your data set is %.2f.%n", median2);
						
						System.out.printf("%nThe mean of your data set is %.2f.%n%n", mean);
						
						System.out.printf("Most Frequent Number: %d (Frequency: %d)%n%n", mostFrequentNumber, maxFrequency);
				       
						System.out.printf("Least Frequent Number: %d (Frequency: %d)%n", leastFrequentNumber, minFrequency);
							
						System.out.printf("%nThe value for quartile 3 is %.2f.%n", fq3);
							
						System.out.printf("%nThe interquartile range is %.2f.%n", iqr);
						
						System.out.printf("%nThe standard deviation of the data is %.2f.%n", sd);
							
						System.out.printf("%nNumbers in the data set above %.2f should be considered as outliers.%n", outlier1);
							
						System.out.printf("%nNumbers in the data set below %.2f should be considered as outliers.%n", outlier2);
						
						System.out.printf("%nThe size of your data set is %d.%n",Data.size());
						
						Data.forEach( (n) ->  {if (n > outlier3) {
							System.out.printf("%.2f is an upper outlier.%n", n);
						} else if (n < outlier4) {
							System.out.printf("%.2f is a lower outlier.%n", n); 
					}
						});
						
						if (mean > median2) {
							System.out.println("If you were to graph these data points, the graph would be positively (right) skewed");
							
							System.out.println("Since the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else if (median2 > mean) {
							System.out.println("If you were to graph these data points, the graph would be negatively (left) skewed");
							
							System.out.println("Since the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else {
							System.out.println("\nIf you were to graph these data points, the graph would be symmetrical.");
							
							System.out.println("Since the data is symmetrical, it is recommended to use the mean and Standard Deviation (St. Dev).");
						} 
						if (mean == median2) {
					
						System.out.println("Would you like to calculate z-score? If so, please input 'zscore' and if not then type anything else:");
						decision = input.next();
						
						if (decision.equals("zscore")) {
							
							while (decision.equals("zscore")) {
							
						System.out.println("Please input the number you'd like to calculate the z score for:");
						double number = input.nextDouble();
						
						double zscore = (number - mean) / sd;
						
						if (zscore == 1) {
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the right) of the mean.%n", number, Math.abs(zscore));
						}
						else if (zscore == -1) {
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the left) of the mean.%n", number, Math.abs(zscore));
						}
						else if (zscore > 0) {
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the right) from the mean.%n", number, Math.abs(zscore));
						}
						else if (zscore < 0 ){
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the left) of the mean.%n", number, Math.abs(zscore));
						}
						else {
							System.out.printf("%nThe inputted number (%.2f) is the same as the mean (%.2f).%n", number, mean);
							}
						if (zscore > 2) {
							System.out.printf("The inputted number %.2f is a positive outlier.%n", number);
						}
						else if (zscore < -2) {
							System.out.printf("The inputted number %.2f is a negative outlier.%n", number);
						}
						if (zscore >= -1 & zscore <= 1) {
							System.out.printf("The inputted number %.2f lies within 68 percent of the data.%n", number);
						}
						else if (zscore >= -2 & zscore <= 2) {
							System.out.printf("The inputted number %.2f lies within 95 percent of the data.%n", number);
						}
						else if (zscore >= -3 & zscore <= 3) {
							System.out.printf("The inputted number %.2f lies within 99.7 percent of the data.%n", number);
						}
						double sixtyeightp = mean + (1 * sd);
						
						double sixeightp = mean - (1 * sd);
						
						double ninetyfivep = mean + (2 * sd);
						
						double ninefivep = mean - (2 * sd);
						
						double ninetyninepointsevenp = mean + (3 * sd);
						
						double ninenineptsevenp = mean - (3 * sd);
						
						System.out.printf("68 percent of the data lies between %.2f and %.2f.%n", sixeightp, sixtyeightp);
						
						System.out.printf("95 percent of the data lies between %.2f and %.2f.%n", ninefivep, ninetyfivep);
						
						System.out.printf("99.7 percent of the data lies between %.2f and %.2f.%n", ninenineptsevenp, ninetyninepointsevenp);
						
						System.out.println("\nWould you like to calculate the zscore of another number for the same data set? "
								+ "Input 'zscore' if so, type anything else if not.");
						decision = input.next();
						}
					}
				}
			}
						else {
						median = amt / 2 - 1;
						med = amt / 2;
							
						q1 = amt / 4;
							
						q3 = amt * 3 / 4;
							
						median2 = Data.get(median);
						med2 = Data.get(med);
						
						qu1 = Data.get(q1);
						
						qu3 = Data.get(q3);
						
						iqr = qu3 - qu1;
						
						fm = (median2 + med2) / 2;
						
						outlier1 = iqr * 1.5;
						
						outlier1 = qu3 + outlier1;
						
						outlier2 = iqr * 1.5;
							
						outlier2 = qu1 - outlier2;
							
						Rnge = Data.get(amt - 1) - Data.get(0);
					
						mean = mean / Data.size();
						
						final double outlier3 = outlier1;
						
						final double outlier4 = outlier2;
						
						final double fim = mean;
						
						Data.forEach( (n) -> { stdev.add(n);});
						
						stdev.replaceAll( (n) -> n = Math.abs(n - fim));
						
						stdev.replaceAll( (n) -> n = Math.pow(n, 2));
						
						while (ctt < amt) {
							sd =  sd + stdev.get(ctt);
							ctt++;
						}
						avg = sd / (amt - 1);
						
						sd = Math.sqrt(avg);
							
						System.out.printf("%nThe maximum of the data set is %.2f.%n", Data.get(amt - 1));
							
						System.out.printf("%nThe minimum of the data set is %.2f.%n", Data.get(0));
							
						System.out.printf("%nThe range of the data set is %.2f.%n", Rnge);
							
						System.out.printf("%nThe value for quartile 1 is %.2f.%n", qu1);
							
						System.out.printf("%nThe median of your data set is %.2f.%n", fm);
						
						System.out.printf("%nThe mean of your data set is %.2f.%n%n", mean);
						
						System.out.printf("Most Frequent Number: %d (Frequency: %d)%n%n", mostFrequentNumber, maxFrequency);
				       
						System.out.printf("Least Frequent Number: %d (Frequency: %d)%n", leastFrequentNumber, minFrequency);
							
						System.out.printf("%nThe value for quartile 3 is %.2f.%n", qu3);
							
						System.out.printf("%nThe interquartile range is %.2f.%n", iqr);
						
						System.out.printf("%nThe standard deviation of the data is %.3f.%n", sd);
							
						System.out.printf("%nNumbers in the data set above %.2f should be considered as outliers.%n", outlier1);
							
						System.out.printf("%nNumbers in the data set below %.2f should be considered as outliers.%n", outlier2);
							
						System.out.printf("%nThe size of your data set is %d.%n%n",Data.size());
						
						Data.forEach( (n) ->  {if (n > outlier3) {
							System.out.printf("%.2f is an upper outlier.%n", n);
						} else if (n < outlier4) {
							System.out.printf("%.2f is a lower outlier.%n", n); 
					}
						});
						
						if (mean > fm) {
							System.out.println("\nIf you were to graph these data points, the graph would be positively (right) skewed.");
							
							System.out.println("\nSince the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else if (fm > mean) {
							System.out.println("\nIf you were to graph these data points, the graph would be negatively (left) skewed.");
							
							System.out.println("\nSince the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else {
							System.out.println("\nIf you were to graph these data points, the graph would be symmetrical.");
							
							System.out.println("\nSince the data is symmetrical, it is recommended to use the mean and Standard Deviation (St. Dev).");
							
							if (mean == fm) {
							System.out.println("Would you like to calculate z-score? If so, please input 'zscore' and if not then type anything else:");
							decision = input.next();
							
							if (decision.equals("zscore")) {
								
								while (decision.equals("zscore")) {
								
							System.out.println("Please input the number you'd like to calculate the z score for:");
							double number = input.nextDouble();
							
							double zscore = (number - mean) / sd;
							
							if (zscore == 1) {
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the right) of the mean.%n", number, Math.abs(zscore));
							}
							else if (zscore == -1) {
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the left) of the mean.%n", number, Math.abs(zscore));
							}
							else if (zscore > 0) {
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the right) from the mean.%n", number, Math.abs(zscore));
							}
							else if (zscore < 0 ){
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the left) of the mean.%n", number, Math.abs(zscore));
							}
							else {
								System.out.printf("%nThe inputted number  (%.2f) is the same as the mean (%.2f).%n ", number, mean);
											}
							if (zscore > 2) {
								System.out.printf("The inputted number %.2f is a positive outlier.%n", number);
							}
							else if (zscore < -2) {
								System.out.printf("The inputted number %.2f is a negative outlier.%n", number);
							}
							if (zscore >= -1 & zscore <= 1) {
								System.out.printf("The inputted number %.2f lies within 68 percent of the data.%n", number);
							}
							else if (zscore >= -2 & zscore <= 2) {
								System.out.printf("The inputted number %.2f lies within 95 percent of the data.%n", number);
							}
							else if (zscore >= -3 & zscore <= 3) {
								System.out.printf("The inputted number %.2f lies within 99.7 percent of the data.%n", number);
							}
							double sixtyeightp = mean + (1 * sd);
							
							double sixeightp = mean - (1 * sd);
							
							double ninetyfivep = mean + (2 * sd);
							
							double ninefivep = mean - (2 * sd);
							
							double ninetyninepointsevenp = mean + (3 * sd);
							
							double ninenineptsevenp = mean - (3 * sd);
							
							System.out.printf("68 percent of the data lies between %.2f and %.2f.%n", sixeightp, sixtyeightp);
							
							System.out.printf("95 percent of the data lies between %.2f and %.2f.%n", ninefivep, ninetyfivep);
							
							System.out.printf("99.7 percent of the data lies between %.2f and %.2f.%n", ninenineptsevenp, ninetyninepointsevenp);
							
							System.out.println("\nWould you like to calculate the zscore of another number for the same data set?"
									+ " Input 'zscore' if so, type anything else if not.");
							decision = input.next();
										}
									}
								}
							}	
						}
					}
				    	Data.clear();
						stdev.clear();
						FrequencyMap.clear();
						
				        System.out.println("Would you like to do another simulation of d8 dice? Type 'd8' if so.");
				        decision = input.next();
					}
				}
				else if (decision.equals("d10")) {
					while (decision.equals("d10")) {
						int range = 10;
				        double mean = 0;
				        int ctt = 0;
				        int freq;
				        int numbers;
				        int mostFrequentNumber = -1;
				        int leastFrequentNumber = -1;
				        int maxFrequency = -1;
				        int minFrequency = Integer.MAX_VALUE;
				        System.out.println("Enter the number of random numbers to generate: ");
				        int amt = input.nextInt();

				        for (int i = 0; i < amt; i++) {
				            int rng = random.nextInt(range) + 1;
				            FrequencyMap.put(rng, FrequencyMap.getOrDefault(rng, 0) + 1);
				            double rng2 = rng;
				            Data.add(rng2);
				            mean = mean + rng;
				        }

				        System.out.println("\n\n\nFrequencies of each randomly generated number:");
				        for (Map.Entry<Integer, Integer> entry : FrequencyMap.entrySet()) {
				            System.out.println("Number " + entry.getKey() + ": " + entry.getValue() + " times");
				            numbers = entry.getKey();
				            freq = entry.getValue();
					        double percentage = (double) freq / amt * 100;
					        System.out.printf("Approx. percentage for number %d is %.2f%%.%n%n", entry.getKey(), percentage);
					        
					        if (freq > maxFrequency) {
				                maxFrequency = freq;
				                mostFrequentNumber = numbers;
				            }
				            if (freq < minFrequency) {
				                minFrequency = freq;
				                leastFrequentNumber = numbers;
				            }
				        }
				        
				        if (Data.isEmpty() == true) {
							System.out.println("You didn't enter any data points");
						}	
						else {
						Collections.sort(Data);
							
						int median = 0;
						int med = 0;
						double median2 = 0;
						double med2 = 0;
						int quartile1 = 0;
						int q1 = 0;
						double quart1 = 0;
						double qu1 = 0;
						int quartile3 = 0;
						int q3 = 0;
						double quart3 = 0;
						double qu3 = 0;
						double iqr = 0;
						double fq1 = 0;
						double fq3 = 0;
						double fm = 0;
						double outlier1;
						double outlier2;
						double Rnge = 0;
						double sd = 0;
						double avg = 0;
							
						if (amt % 2 == 1) {
						median = amt / 2;
						quartile1 = amt / 4;
						q1 = amt / 4;
						quartile3 = amt * 3 / 4;
						q3 = amt * 3 / 4;
						
						median2 = Data.get(median);
						quart1 = Data.get(quartile1);
						qu1 = Data.get(q1);
						quart3 = Data.get(quartile3);
						qu3 = Data.get(q3);
						
						fq1 = (quart1 + qu1) / 2;
						fq3 = (quart3 + qu3) / 2;
						
						iqr = fq3 - fq1;
							
						outlier1 = iqr * 1.5;
						
						outlier1 = fq3 + outlier1;
							
						outlier2 = iqr * 1.5;
							
						outlier2 = fq1 - outlier2;
								
						Rnge = Data.get(amt - 1) - Data.get(0);
						
						mean = mean / Data.size();
						
						final double outlier3 = outlier1;
						
						final double outlier4 = outlier2;
						
						final double fim = mean;
						
						Data.forEach( (n) -> { stdev.add(n);});
						
						stdev.replaceAll( (n) -> n = Math.abs(n - fim));
						
						stdev.replaceAll( (n) -> n = Math.pow(n, 2));
						
						
						while (ctt < amt) {
							sd =  sd + stdev.get(ctt);
							ctt++;
						}
						avg = sd / (amt - 1);
						
						sd = Math.sqrt(avg);
							
						System.out.printf("%nThe maximum of the data set is %.2f.%n", Data.get(amt - 1));
						
						System.out.printf("%nThe minimum of the data set is %.2f.%n", Data.get(0));
							
						System.out.printf("%nThe range of the data set is %.2f.%n", Rnge);
							
						System.out.printf("%nThe value for quartile 1 is %.2f.%n", fq1);
							
						System.out.printf("%nThe median of your data set is %.2f.%n", median2);
						
						System.out.printf("%nThe mean of your data set is %.2f.%n%n", mean);
						
						System.out.printf("Most Frequent Number: %d (Frequency: %d)%n%n", mostFrequentNumber, maxFrequency);
				        
						System.out.printf("Least Frequent Number: %d (Frequency: %d)%n", leastFrequentNumber, minFrequency);
							
						System.out.printf("%nThe value for quartile 3 is %.2f.%n", fq3);
							
						System.out.printf("%nThe interquartile range is %.2f.%n", iqr);
						
						System.out.printf("%nThe standard deviation of the data is %.2f.%n", sd);
							
						System.out.printf("%nNumbers in the data set above %.2f should be considered as outliers.%n", outlier1);
							
						System.out.printf("%nNumbers in the data set below %.2f should be considered as outliers.%n", outlier2);
						
						System.out.printf("%nThe size of your data set is %d.%n",Data.size());
						
						Data.forEach( (n) ->  {if (n > outlier3) {
							System.out.printf("%.2f is an upper outlier.%n", n);
						} else if (n < outlier4) {
							System.out.printf("%.2f is a lower outlier.%n", n); 
					}
						});
						
						if (mean > median2) {
							System.out.println("If you were to graph these data points, the graph would be positively (right) skewed");
							
							System.out.println("Since the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else if (median2 > mean) {
							System.out.println("If you were to graph these data points, the graph would be negatively (left) skewed");
							
							System.out.println("Since the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else {
							System.out.println("\nIf you were to graph these data points, the graph would be symmetrical.");
							
							System.out.println("Since the data is symmetrical, it is recommended to use the mean and Standard Deviation (St. Dev).");
						} 
						if (mean == median2) {
					
						System.out.println("Would you like to calculate z-score? If so, please input 'zscore' and if not then type anything else:");
						decision = input.next();
						
						if (decision.equals("zscore")) {
							
							while (decision.equals("zscore")) {
							
						System.out.println("Please input the number you'd like to calculate the z score for:");
						double number = input.nextDouble();
						
						double zscore = (number - mean) / sd;
						
						if (zscore == 1) {
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the right) of the mean.%n", number, Math.abs(zscore));
						}
						else if (zscore == -1) {
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the left) of the mean.%n", number, Math.abs(zscore));
						}
						else if (zscore > 0) {
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the right) from the mean.%n", number, Math.abs(zscore));
						}
						else if (zscore < 0 ){
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the left) of the mean.%n", number, Math.abs(zscore));
						}
						else {
							System.out.printf("%nThe inputted number (%.2f) is the same as the mean (%.2f).%n", number, mean);
							}
						if (zscore > 2) {
							System.out.printf("The inputted number %.2f is a positive outlier.%n", number);
						}
						else if (zscore < -2) {
							System.out.printf("The inputted number %.2f is a negative outlier.%n", number);
						}
						if (zscore >= -1 & zscore <= 1) {
							System.out.printf("The inputted number %.2f lies within 68 percent of the data.%n", number);
						}
						else if (zscore >= -2 & zscore <= 2) {
							System.out.printf("The inputted number %.2f lies within 95 percent of the data.%n", number);
						}
						else if (zscore >= -3 & zscore <= 3) {
							System.out.printf("The inputted number %.2f lies within 99.7 percent of the data.%n", number);
						}
						double sixtyeightp = mean + (1 * sd);
						
						double sixeightp = mean - (1 * sd);
						
						double ninetyfivep = mean + (2 * sd);
						
						double ninefivep = mean - (2 * sd);
						
						double ninetyninepointsevenp = mean + (3 * sd);
						
						double ninenineptsevenp = mean - (3 * sd);
						
						System.out.printf("68 percent of the data lies between %.2f and %.2f.%n", sixeightp, sixtyeightp);
						
						System.out.printf("95 percent of the data lies between %.2f and %.2f.%n", ninefivep, ninetyfivep);
						
						System.out.printf("99.7 percent of the data lies between %.2f and %.2f.%n", ninenineptsevenp, ninetyninepointsevenp);
						
						System.out.println("\nWould you like to calculate the zscore of another number for the same data set? "
								+ "Input 'zscore' if so, type anything else if not.");
						decision = input.next();
						}
					}
				}
			}
						else {
						median = amt / 2 - 1;
						med = amt / 2;
							
						q1 = amt / 4;
							
						q3 = amt * 3 / 4;
							
						median2 = Data.get(median);
						med2 = Data.get(med);
						
						qu1 = Data.get(q1);
						
						qu3 = Data.get(q3);
						
						iqr = qu3 - qu1;
						
						fm = (median2 + med2) / 2;
						
						outlier1 = iqr * 1.5;
						
						outlier1 = qu3 + outlier1;
						
						outlier2 = iqr * 1.5;
							
						outlier2 = qu1 - outlier2;
							
						Rnge = Data.get(amt - 1) - Data.get(0);
					
						mean = mean / Data.size();
						
						final double outlier3 = outlier1;
						
						final double outlier4 = outlier2;
						
						final double fim = mean;
						
						Data.forEach( (n) -> { stdev.add(n);});
						
						stdev.replaceAll( (n) -> n = Math.abs(n - fim));
						
						stdev.replaceAll( (n) -> n = Math.pow(n, 2));
						
						while (ctt < amt) {
							sd =  sd + stdev.get(ctt);
							ctt++;
						}
						avg = sd / (amt - 1);
						
						sd = Math.sqrt(avg);
							
						System.out.printf("%nThe maximum of the data set is %.2f.%n", Data.get(amt - 1));
							
						System.out.printf("%nThe minimum of the data set is %.2f.%n", Data.get(0));
							
						System.out.printf("%nThe range of the data set is %.2f.%n", Rnge);
							
						System.out.printf("%nThe value for quartile 1 is %.2f.%n", qu1);
							
						System.out.printf("%nThe median of your data set is %.2f.%n", fm);
						
						System.out.printf("%nThe mean of your data set is %.2f.%n%n", mean);
						
						System.out.printf("Most Frequent Number: %d (Frequency: %d)%n%n", mostFrequentNumber, maxFrequency);
				        
						System.out.printf("Least Frequent Number: %d (Frequency: %d)%n", leastFrequentNumber, minFrequency);
							
						System.out.printf("%nThe value for quartile 3 is %.2f.%n", qu3);
							
						System.out.printf("%nThe interquartile range is %.2f.%n", iqr);
						
						System.out.printf("%nThe standard deviation of the data is %.3f.%n", sd);
							
						System.out.printf("%nNumbers in the data set above %.2f should be considered as outliers.%n", outlier1);
							
						System.out.printf("%nNumbers in the data set below %.2f should be considered as outliers.%n", outlier2);
							
						System.out.printf("%nThe size of your data set is %d.%n%n",Data.size());
						
						Data.forEach( (n) ->  {if (n > outlier3) {
							System.out.printf("%.2f is an upper outlier.%n", n);
						} else if (n < outlier4) {
							System.out.printf("%.2f is a lower outlier.%n", n); 
					}
						});
						
						if (mean > fm) {
							System.out.println("\nIf you were to graph these data points, the graph would be positively (right) skewed.");
							
							System.out.println("\nSince the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else if (fm > mean) {
							System.out.println("\nIf you were to graph these data points, the graph would be negatively (left) skewed.");
							
							System.out.println("\nSince the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else {
							System.out.println("\nIf you were to graph these data points, the graph would be symmetrical.");
							
							System.out.println("\nSince the data is symmetrical, it is recommended to use the mean and Standard Deviation (St. Dev).");
							
							if (mean == fm) {
							System.out.println("Would you like to calculate z-score? If so, please input 'zscore' and if not then type anything else:");
							decision = input.next();
							
							if (decision.equals("zscore")) {
								
								while (decision.equals("zscore")) {
								
							System.out.println("Please input the number you'd like to calculate the z score for:");
							double number = input.nextDouble();
							
							double zscore = (number - mean) / sd;
							
							if (zscore == 1) {
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the right) of the mean.%n", number, Math.abs(zscore));
							}
							else if (zscore == -1) {
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the left) of the mean.%n", number, Math.abs(zscore));
							}
							else if (zscore > 0) {
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the right) from the mean.%n", number, Math.abs(zscore));
							}
							else if (zscore < 0 ){
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the left) of the mean.%n", number, Math.abs(zscore));
							}
							else {
								System.out.printf("%nThe inputted number  (%.2f) is the same as the mean (%.2f).%n ", number, mean);
											}
							if (zscore > 2) {
								System.out.printf("The inputted number %.2f is a positive outlier.%n", number);
							}
							else if (zscore < -2) {
								System.out.printf("The inputted number %.2f is a negative outlier.%n", number);
							}
							if (zscore >= -1 & zscore <= 1) {
								System.out.printf("The inputted number %.2f lies within 68 percent of the data.%n", number);
							}
							else if (zscore >= -2 & zscore <= 2) {
								System.out.printf("The inputted number %.2f lies within 95 percent of the data.%n", number);
							}
							else if (zscore >= -3 & zscore <= 3) {
								System.out.printf("The inputted number %.2f lies within 99.7 percent of the data.%n", number);
							}
							double sixtyeightp = mean + (1 * sd);
							
							double sixeightp = mean - (1 * sd);
							
							double ninetyfivep = mean + (2 * sd);
							
							double ninefivep = mean - (2 * sd);
							
							double ninetyninepointsevenp = mean + (3 * sd);
							
							double ninenineptsevenp = mean - (3 * sd);
							
							System.out.printf("68 percent of the data lies between %.2f and %.2f.%n", sixeightp, sixtyeightp);
							
							System.out.printf("95 percent of the data lies between %.2f and %.2f.%n", ninefivep, ninetyfivep);
							
							System.out.printf("99.7 percent of the data lies between %.2f and %.2f.%n", ninenineptsevenp, ninetyninepointsevenp);
							
							System.out.println("\nWould you like to calculate the zscore of another number for the same data set?"
									+ " Input 'zscore' if so, type anything else if not.");
							decision = input.next();
										}
									}
								}
							}	
						}
					}
				    	Data.clear();
						stdev.clear();
						FrequencyMap.clear();
						
				        System.out.println("Would you like to do another simulation of d10 dice? Type 'd10' if so.");
				        decision = input.next();
					}
				}
				else if (decision.equals("d12")) {
					
					while (decision.equals("d12")) {
						int range = 12;
				        double mean = 0;
				        int ctt = 0;
				        int freq;
				        int numbers;
				        int mostFrequentNumber = -1;
				        int leastFrequentNumber = -1;
				        int maxFrequency = -1;
				        int minFrequency = Integer.MAX_VALUE;
				        System.out.println("Enter the number of random numbers to generate: ");
				        int amt = input.nextInt();

				        for (int i = 0; i < amt; i++) {
				            int rng = random.nextInt(range) + 1;
				            FrequencyMap.put(rng, FrequencyMap.getOrDefault(rng, 0) + 1);
				            double rng2 = rng;
				            Data.add(rng2);
				            mean = mean + rng;
				        }

				        System.out.println("\n\n\nFrequencies of each randomly generated number:");
				        for (Map.Entry<Integer, Integer> entry : FrequencyMap.entrySet()) {
				            System.out.println("Number " + entry.getKey() + ": " + entry.getValue() + " times");
				            numbers = entry.getKey();
				            freq = entry.getValue();
					        double percentage = (double) freq / amt * 100;
					        System.out.printf("Approx. percentage for number %d is %.2f%%.%n%n", entry.getKey(), percentage);
					        
					        if (freq > maxFrequency) {
				                maxFrequency = freq;
				                mostFrequentNumber = numbers;
				            }
				            if (freq < minFrequency) {
				                minFrequency = freq;
				                leastFrequentNumber = numbers;
				            }
				        }
				        
				        if (Data.isEmpty() == true) {
							System.out.println("You didn't enter any data points");
						}	
						else {
						Collections.sort(Data);
							
						int median = 0;
						int med = 0;
						double median2 = 0;
						double med2 = 0;
						int quartile1 = 0;
						int q1 = 0;
						double quart1 = 0;
						double qu1 = 0;
						int quartile3 = 0;
						int q3 = 0;
						double quart3 = 0;
						double qu3 = 0;
						double iqr = 0;
						double fq1 = 0;
						double fq3 = 0;
						double fm = 0;
						double outlier1;
						double outlier2;
						double Rnge = 0;
						double sd = 0;
						double avg = 0;
							
						if (amt % 2 == 1) {
						median = amt / 2;
						quartile1 = amt / 4;
						q1 = amt / 4;
						quartile3 = amt * 3 / 4;
						q3 = amt * 3 / 4;
						
						median2 = Data.get(median);
						quart1 = Data.get(quartile1);
						qu1 = Data.get(q1);
						quart3 = Data.get(quartile3);
						qu3 = Data.get(q3);
						
						fq1 = (quart1 + qu1) / 2;
						fq3 = (quart3 + qu3) / 2;
						
						iqr = fq3 - fq1;
							
						outlier1 = iqr * 1.5;
						
						outlier1 = fq3 + outlier1;
							
						outlier2 = iqr * 1.5;
							
						outlier2 = fq1 - outlier2;
								
						Rnge = Data.get(amt - 1) - Data.get(0);
						
						mean = mean / Data.size();
						
						final double outlier3 = outlier1;
						
						final double outlier4 = outlier2;
						
						final double fim = mean;
						
						Data.forEach( (n) -> { stdev.add(n);});
						
						stdev.replaceAll( (n) -> n = Math.abs(n - fim));
						
						stdev.replaceAll( (n) -> n = Math.pow(n, 2));
						
						
						while (ctt < amt) {
							sd =  sd + stdev.get(ctt);
							ctt++;
						}
						avg = sd / (amt - 1);
						
						sd = Math.sqrt(avg);
							
						System.out.printf("%nThe maximum of the data set is %.2f.%n", Data.get(amt - 1));
						
						System.out.printf("%nThe minimum of the data set is %.2f.%n", Data.get(0));
							
						System.out.printf("%nThe range of the data set is %.2f.%n", Rnge);
							
						System.out.printf("%nThe value for quartile 1 is %.2f.%n", fq1);
							
						System.out.printf("%nThe median of your data set is %.2f.%n", median2);
						
						System.out.printf("%nThe mean of your data set is %.2f.%n%n", mean);
						
						System.out.printf("Most Frequent Number: %d (Frequency: %d)%n%n", mostFrequentNumber, maxFrequency);
				        
						System.out.printf("Least Frequent Number: %d (Frequency: %d)%n", leastFrequentNumber, minFrequency);
							
						System.out.printf("%nThe value for quartile 3 is %.2f.%n", fq3);
							
						System.out.printf("%nThe interquartile range is %.2f.%n", iqr);
						
						System.out.printf("%nThe standard deviation of the data is %.2f.%n", sd);
							
						System.out.printf("%nNumbers in the data set above %.2f should be considered as outliers.%n", outlier1);
							
						System.out.printf("%nNumbers in the data set below %.2f should be considered as outliers.%n", outlier2);
						
						System.out.printf("%nThe size of your data set is %d.%n",Data.size());
						
						Data.forEach( (n) ->  {if (n > outlier3) {
							System.out.printf("%.2f is an upper outlier.%n", n);
						} else if (n < outlier4) {
							System.out.printf("%.2f is a lower outlier.%n", n); 
					}
						});
						
						if (mean > median2) {
							System.out.println("If you were to graph these data points, the graph would be positively (right) skewed");
							
							System.out.println("Since the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else if (median2 > mean) {
							System.out.println("If you were to graph these data points, the graph would be negatively (left) skewed");
							
							System.out.println("Since the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else {
							System.out.println("\nIf you were to graph these data points, the graph would be symmetrical.");
							
							System.out.println("Since the data is symmetrical, it is recommended to use the mean and Standard Deviation (St. Dev).");
						} 
						if (mean == median2) {
					
						System.out.println("Would you like to calculate z-score? If so, please input 'zscore' and if not then type anything else:");
						decision = input.next();
						
						if (decision.equals("zscore")) {
							
							while (decision.equals("zscore")) {
							
						System.out.println("Please input the number you'd like to calculate the z score for:");
						double number = input.nextDouble();
						
						double zscore = (number - mean) / sd;
						
						if (zscore == 1) {
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the right) of the mean.%n", number, Math.abs(zscore));
						}
						else if (zscore == -1) {
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the left) of the mean.%n", number, Math.abs(zscore));
						}
						else if (zscore > 0) {
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the right) from the mean.%n", number, Math.abs(zscore));
						}
						else if (zscore < 0 ){
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the left) of the mean.%n", number, Math.abs(zscore));
						}
						else {
							System.out.printf("%nThe inputted number (%.2f) is the same as the mean (%.2f).%n", number, mean);
							}
						if (zscore > 2) {
							System.out.printf("The inputted number %.2f is a positive outlier.%n", number);
						}
						else if (zscore < -2) {
							System.out.printf("The inputted number %.2f is a negative outlier.%n", number);
						}
						if (zscore >= -1 & zscore <= 1) {
							System.out.printf("The inputted number %.2f lies within 68 percent of the data.%n", number);
						}
						else if (zscore >= -2 & zscore <= 2) {
							System.out.printf("The inputted number %.2f lies within 95 percent of the data.%n", number);
						}
						else if (zscore >= -3 & zscore <= 3) {
							System.out.printf("The inputted number %.2f lies within 99.7 percent of the data.%n", number);
						}
						double sixtyeightp = mean + (1 * sd);
						
						double sixeightp = mean - (1 * sd);
						
						double ninetyfivep = mean + (2 * sd);
						
						double ninefivep = mean - (2 * sd);
						
						double ninetyninepointsevenp = mean + (3 * sd);
						
						double ninenineptsevenp = mean - (3 * sd);
						
						System.out.printf("68 percent of the data lies between %.2f and %.2f.%n", sixeightp, sixtyeightp);
						
						System.out.printf("95 percent of the data lies between %.2f and %.2f.%n", ninefivep, ninetyfivep);
						
						System.out.printf("99.7 percent of the data lies between %.2f and %.2f.%n", ninenineptsevenp, ninetyninepointsevenp);
						
						System.out.println("\nWould you like to calculate the zscore of another number for the same data set? "
								+ "Input 'zscore' if so, type anything else if not.");
						decision = input.next();
						}
					}
				}
			}
						else {
						median = amt / 2 - 1;
						med = amt / 2;
							
						q1 = amt / 4;
							
						q3 = amt * 3 / 4;
							
						median2 = Data.get(median);
						med2 = Data.get(med);
						
						qu1 = Data.get(q1);
						
						qu3 = Data.get(q3);
						
						iqr = qu3 - qu1;
						
						fm = (median2 + med2) / 2;
						
						outlier1 = iqr * 1.5;
						
						outlier1 = qu3 + outlier1;
						
						outlier2 = iqr * 1.5;
							
						outlier2 = qu1 - outlier2;
							
						Rnge = Data.get(amt - 1) - Data.get(0);
					
						mean = mean / Data.size();
						
						final double outlier3 = outlier1;
						
						final double outlier4 = outlier2;
						
						final double fim = mean;
						
						Data.forEach( (n) -> { stdev.add(n);});
						
						stdev.replaceAll( (n) -> n = Math.abs(n - fim));
						
						stdev.replaceAll( (n) -> n = Math.pow(n, 2));
						
						while (ctt < amt) {
							sd =  sd + stdev.get(ctt);
							ctt++;
						}
						avg = sd / (amt - 1);
						
						sd = Math.sqrt(avg);
							
						System.out.printf("%nThe maximum of the data set is %.2f.%n", Data.get(amt - 1));
							
						System.out.printf("%nThe minimum of the data set is %.2f.%n", Data.get(0));
							
						System.out.printf("%nThe range of the data set is %.2f.%n", Rnge);
							
						System.out.printf("%nThe value for quartile 1 is %.2f.%n", qu1);
							
						System.out.printf("%nThe median of your data set is %.2f.%n", fm);
						
						System.out.printf("%nThe mean of your data set is %.2f.%n%n", mean);
						
						System.out.printf("Most Frequent Number: %d (Frequency: %d)%n%n", mostFrequentNumber, maxFrequency);
				       
						System.out.printf("Least Frequent Number: %d (Frequency: %d)%n", leastFrequentNumber, minFrequency);
							
						System.out.printf("%nThe value for quartile 3 is %.2f.%n", qu3);
							
						System.out.printf("%nThe interquartile range is %.2f.%n", iqr);
						
						System.out.printf("%nThe standard deviation of the data is %.3f.%n", sd);
							
						System.out.printf("%nNumbers in the data set above %.2f should be considered as outliers.%n", outlier1);
							
						System.out.printf("%nNumbers in the data set below %.2f should be considered as outliers.%n", outlier2);
							
						System.out.printf("%nThe size of your data set is %d.%n%n",Data.size());
						
						Data.forEach( (n) ->  {if (n > outlier3) {
							System.out.printf("%.2f is an upper outlier.%n", n);
						} else if (n < outlier4) {
							System.out.printf("%.2f is a lower outlier.%n", n); 
					}
						});
						
						if (mean > fm) {
							System.out.println("\nIf you were to graph these data points, the graph would be positively (right) skewed.");
							
							System.out.println("\nSince the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else if (fm > mean) {
							System.out.println("\nIf you were to graph these data points, the graph would be negatively (left) skewed.");
							
							System.out.println("\nSince the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else {
							System.out.println("\nIf you were to graph these data points, the graph would be symmetrical.");
							
							System.out.println("\nSince the data is symmetrical, it is recommended to use the mean and Standard Deviation (St. Dev).");
							
							if (mean == fm) {
							System.out.println("Would you like to calculate z-score? If so, please input 'zscore' and if not then type anything else:");
							decision = input.next();
							
							if (decision.equals("zscore")) {
								
								while (decision.equals("zscore")) {
								
							System.out.println("Please input the number you'd like to calculate the z score for:");
							double number = input.nextDouble();
							
							double zscore = (number - mean) / sd;
							
							if (zscore == 1) {
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the right) of the mean.%n", number, Math.abs(zscore));
							}
							else if (zscore == -1) {
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the left) of the mean.%n", number, Math.abs(zscore));
							}
							else if (zscore > 0) {
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the right) from the mean.%n", number, Math.abs(zscore));
							}
							else if (zscore < 0 ){
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the left) of the mean.%n", number, Math.abs(zscore));
							}
							else {
								System.out.printf("%nThe inputted number  (%.2f) is the same as the mean (%.2f).%n ", number, mean);
											}
							if (zscore > 2) {
								System.out.printf("The inputted number %.2f is a positive outlier.%n", number);
							}
							else if (zscore < -2) {
								System.out.printf("The inputted number %.2f is a negative outlier.%n", number);
							}
							if (zscore >= -1 & zscore <= 1) {
								System.out.printf("The inputted number %.2f lies within 68 percent of the data.%n", number);
							}
							else if (zscore >= -2 & zscore <= 2) {
								System.out.printf("The inputted number %.2f lies within 95 percent of the data.%n", number);
							}
							else if (zscore >= -3 & zscore <= 3) {
								System.out.printf("The inputted number %.2f lies within 99.7 percent of the data.%n", number);
							}
							double sixtyeightp = mean + (1 * sd);
							
							double sixeightp = mean - (1 * sd);
							
							double ninetyfivep = mean + (2 * sd);
							
							double ninefivep = mean - (2 * sd);
							
							double ninetyninepointsevenp = mean + (3 * sd);
							
							double ninenineptsevenp = mean - (3 * sd);
							
							System.out.printf("68 percent of the data lies between %.2f and %.2f.%n", sixeightp, sixtyeightp);
							
							System.out.printf("95 percent of the data lies between %.2f and %.2f.%n", ninefivep, ninetyfivep);
							
							System.out.printf("99.7 percent of the data lies between %.2f and %.2f.%n", ninenineptsevenp, ninetyninepointsevenp);
							
							System.out.println("\nWould you like to calculate the zscore of another number for the same data set?"
									+ " Input 'zscore' if so, type anything else if not.");
							decision = input.next();
										}
									}
								}
							}	
						}
					}
				    	Data.clear();
						stdev.clear();
						FrequencyMap.clear();
						
				        System.out.println("Would you like to do another simulation of d12 dice? Type 'd12' if so.");
				        decision = input.next();
					}
				}
				else if (decision.equals("d20")) {
					while (decision.equals("d20")) {
						int range = 20;
				        double mean = 0;
				        int ctt = 0;
				        int freq;
				        int numbers;
				        int mostFrequentNumber = -1;
				        int leastFrequentNumber = -1;
				        int maxFrequency = -1;
				        int minFrequency = Integer.MAX_VALUE;
				        System.out.println("Enter the number of random numbers to generate: ");
				        int amt = input.nextInt();

				        for (int i = 0; i < amt; i++) {
				            int rng = random.nextInt(range) + 1;
				            FrequencyMap.put(rng, FrequencyMap.getOrDefault(rng, 0) + 1);
				            double rng2 = rng;
				            Data.add(rng2);
				            mean = mean + rng;
				        }

				        System.out.println("\n\n\nFrequencies of each randomly generated number:");
				        for (Map.Entry<Integer, Integer> entry : FrequencyMap.entrySet()) {
				            System.out.println("Number " + entry.getKey() + ": " + entry.getValue() + " times");
				            numbers = entry.getKey();
				            freq = entry.getValue();
					        double percentage = (double) freq / amt * 100;
					        System.out.printf("Approx. percentage for number %d is %.2f%%.%n%n", entry.getKey(), percentage);
					        
					        if (freq > maxFrequency) {
				                maxFrequency = freq;
				                mostFrequentNumber = numbers;
				            }
				            if (freq < minFrequency) {
				                minFrequency = freq;
				                leastFrequentNumber = numbers;
				            }
				        }
				        
				        if (Data.isEmpty() == true) {
							System.out.println("You didn't enter any data points");
						}	
						else {
						Collections.sort(Data);
							
						int median = 0;
						int med = 0;
						double median2 = 0;
						double med2 = 0;
						int quartile1 = 0;
						int q1 = 0;
						double quart1 = 0;
						double qu1 = 0;
						int quartile3 = 0;
						int q3 = 0;
						double quart3 = 0;
						double qu3 = 0;
						double iqr = 0;
						double fq1 = 0;
						double fq3 = 0;
						double fm = 0;
						double outlier1;
						double outlier2;
						double Rnge = 0;
						double sd = 0;
						double avg = 0;
							
						if (amt % 2 == 1) {
						median = amt / 2;
						quartile1 = amt / 4;
						q1 = amt / 4;
						quartile3 = amt * 3 / 4;
						q3 = amt * 3 / 4;
						
						median2 = Data.get(median);
						quart1 = Data.get(quartile1);
						qu1 = Data.get(q1);
						quart3 = Data.get(quartile3);
						qu3 = Data.get(q3);
						
						fq1 = (quart1 + qu1) / 2;
						fq3 = (quart3 + qu3) / 2;
						
						iqr = fq3 - fq1;
							
						outlier1 = iqr * 1.5;
						
						outlier1 = fq3 + outlier1;
							
						outlier2 = iqr * 1.5;
							
						outlier2 = fq1 - outlier2;
								
						Rnge = Data.get(amt - 1) - Data.get(0);
						
						mean = mean / Data.size();
						
						final double outlier3 = outlier1;
						
						final double outlier4 = outlier2;
						
						final double fim = mean;
						
						Data.forEach( (n) -> { stdev.add(n);});
						
						stdev.replaceAll( (n) -> n = Math.abs(n - fim));
						
						stdev.replaceAll( (n) -> n = Math.pow(n, 2));
						
						
						while (ctt < amt) {
							sd =  sd + stdev.get(ctt);
							ctt++;
						}
						avg = sd / (amt - 1);
						
						sd = Math.sqrt(avg);
							
						System.out.printf("%nThe maximum of the data set is %.2f.%n", Data.get(amt - 1));
						
						System.out.printf("%nThe minimum of the data set is %.2f.%n", Data.get(0));
							
						System.out.printf("%nThe range of the data set is %.2f.%n", Rnge);
							
						System.out.printf("%nThe value for quartile 1 is %.2f.%n", fq1);
							
						System.out.printf("%nThe median of your data set is %.2f.%n", median2);
						
						System.out.printf("%nThe mean of your data set is %.2f.%n%n", mean);
						
						System.out.printf("Most Frequent Number: %d (Frequency: %d)%n%n", mostFrequentNumber, maxFrequency);
					       
						System.out.printf("Least Frequent Number: %d (Frequency: %d)%n", leastFrequentNumber, minFrequency);
							
						System.out.printf("%nThe value for quartile 3 is %.2f.%n", fq3);
							
						System.out.printf("%nThe interquartile range is %.2f.%n", iqr);
						
						System.out.printf("%nThe standard deviation of the data is %.2f.%n", sd);
							
						System.out.printf("%nNumbers in the data set above %.2f should be considered as outliers.%n", outlier1);
							
						System.out.printf("%nNumbers in the data set below %.2f should be considered as outliers.%n", outlier2);		
						
						System.out.printf("%nThe size of your data set is %d.%n",Data.size());
						
						Data.forEach( (n) ->  {if (n > outlier3) {
							System.out.printf("%.2f is an upper outlier.%n", n);
						} else if (n < outlier4) {
							System.out.printf("%.2f is a lower outlier.%n", n); 
					}
						});
						
						if (mean > median2) {
							System.out.println("If you were to graph these data points, the graph would be positively (right) skewed");
							
							System.out.println("Since the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else if (median2 > mean) {
							System.out.println("If you were to graph these data points, the graph would be negatively (left) skewed");
							
							System.out.println("Since the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else {
							System.out.println("\nIf you were to graph these data points, the graph would be symmetrical.");
							
							System.out.println("Since the data is symmetrical, it is recommended to use the mean and Standard Deviation (St. Dev).");
						} 
						if (mean == median2) {
					
						System.out.println("Would you like to calculate z-score? If so, please input 'zscore' and if not then type anything else:");
						decision = input.next();
						
						if (decision.equals("zscore")) {
							
							while (decision.equals("zscore")) {
							
						System.out.println("Please input the number you'd like to calculate the z score for:");
						double number = input.nextDouble();
						
						double zscore = (number - mean) / sd;
						
						if (zscore == 1) {
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the right) of the mean.%n", number, Math.abs(zscore));
						}
						else if (zscore == -1) {
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the left) of the mean.%n", number, Math.abs(zscore));
						}
						else if (zscore > 0) {
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the right) from the mean.%n", number, Math.abs(zscore));
						}
						else if (zscore < 0 ){
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the left) of the mean.%n", number, Math.abs(zscore));
						}
						else {
							System.out.printf("%nThe inputted number (%.2f) is the same as the mean (%.2f).%n", number, mean);
							}
						if (zscore > 2) {
							System.out.printf("The inputted number %.2f is a positive outlier.%n", number);
						}
						else if (zscore < -2) {
							System.out.printf("The inputted number %.2f is a negative outlier.%n", number);
						}
						if (zscore >= -1 & zscore <= 1) {
							System.out.printf("The inputted number %.2f lies within 68 percent of the data.%n", number);
						}
						else if (zscore >= -2 & zscore <= 2) {
							System.out.printf("The inputted number %.2f lies within 95 percent of the data.%n", number);
						}
						else if (zscore >= -3 & zscore <= 3) {
							System.out.printf("The inputted number %.2f lies within 99.7 percent of the data.%n", number);
						}
						double sixtyeightp = mean + (1 * sd);
						
						double sixeightp = mean - (1 * sd);
						
						double ninetyfivep = mean + (2 * sd);
						
						double ninefivep = mean - (2 * sd);
						
						double ninetyninepointsevenp = mean + (3 * sd);
						
						double ninenineptsevenp = mean - (3 * sd);
						
						System.out.printf("68 percent of the data lies between %.2f and %.2f.%n", sixeightp, sixtyeightp);
						
						System.out.printf("95 percent of the data lies between %.2f and %.2f.%n", ninefivep, ninetyfivep);
						
						System.out.printf("99.7 percent of the data lies between %.2f and %.2f.%n", ninenineptsevenp, ninetyninepointsevenp);
						
						System.out.println("\nWould you like to calculate the zscore of another number for the same data set? "
								+ "Input 'zscore' if so, type anything else if not.");
						decision = input.next();
						}
					}
				}
			}
						else {
						median = amt / 2 - 1;
						med = amt / 2;
							
						q1 = amt / 4;
							
						q3 = amt * 3 / 4;
							
						median2 = Data.get(median);
						med2 = Data.get(med);
						
						qu1 = Data.get(q1);
						
						qu3 = Data.get(q3);
						
						iqr = qu3 - qu1;
						
						fm = (median2 + med2) / 2;
						
						outlier1 = iqr * 1.5;
						
						outlier1 = qu3 + outlier1;
						
						outlier2 = iqr * 1.5;
							
						outlier2 = qu1 - outlier2;
							
						Rnge = Data.get(amt - 1) - Data.get(0);
					
						mean = mean / Data.size();
						
						final double outlier3 = outlier1;
						
						final double outlier4 = outlier2;
						
						final double fim = mean;
						
						Data.forEach( (n) -> { stdev.add(n);});
						
						stdev.replaceAll( (n) -> n = Math.abs(n - fim));
						
						stdev.replaceAll( (n) -> n = Math.pow(n, 2));
						
						while (ctt < amt) {
							sd =  sd + stdev.get(ctt);
							ctt++;
						}
						avg = sd / (amt - 1);
						
						sd = Math.sqrt(avg);
							
						System.out.printf("%nThe maximum of the data set is %.2f.%n", Data.get(amt - 1));
							
						System.out.printf("%nThe minimum of the data set is %.2f.%n", Data.get(0));
							
						System.out.printf("%nThe range of the data set is %.2f.%n", Rnge);
							
						System.out.printf("%nThe value for quartile 1 is %.2f.%n", qu1);
							
						System.out.printf("%nThe median of your data set is %.2f.%n", fm);
						
						System.out.printf("%nThe mean of your data set is %.2f.%n%n", mean);
						
						System.out.printf("Most Frequent Number: %d (Frequency: %d)%n%n", mostFrequentNumber, maxFrequency);
					    
						System.out.printf("Least Frequent Number: %d (Frequency: %d)%n", leastFrequentNumber, minFrequency);
							
						System.out.printf("%nThe value for quartile 3 is %.2f.%n", qu3);
							
						System.out.printf("%nThe interquartile range is %.2f.%n", iqr);
						
						System.out.printf("%nThe standard deviation of the data is %.3f.%n", sd);
							
						System.out.printf("%nNumbers in the data set above %.2f should be considered as outliers.%n", outlier1);
							
						System.out.printf("%nNumbers in the data set below %.2f should be considered as outliers.%n", outlier2);
							
						System.out.printf("%nThe size of your data set is %d.%n%n",Data.size());
						
						Data.forEach( (n) ->  {if (n > outlier3) {
							System.out.printf("%.2f is an upper outlier.%n", n);
						} else if (n < outlier4) {
							System.out.printf("%.2f is a lower outlier.%n", n); 
					}
						});
						
						if (mean > fm) {
							System.out.println("\nIf you were to graph these data points, the graph would be positively (right) skewed.");
							
							System.out.println("\nSince the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else if (fm > mean) {
							System.out.println("\nIf you were to graph these data points, the graph would be negatively (left) skewed.");
							
							System.out.println("\nSince the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else {
							System.out.println("\nIf you were to graph these data points, the graph would be symmetrical.");
							
							System.out.println("\nSince the data is symmetrical, it is recommended to use the mean and Standard Deviation (St. Dev).");
							
							if (mean == fm) {
							System.out.println("Would you like to calculate z-score? If so, please input 'zscore' and if not then type anything else:");
							decision = input.next();
							
							if (decision.equals("zscore")) {
								
								while (decision.equals("zscore")) {
								
							System.out.println("Please input the number you'd like to calculate the z score for:");
							double number = input.nextDouble();
							
							double zscore = (number - mean) / sd;
							
							if (zscore == 1) {
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the right) of the mean.%n", number, Math.abs(zscore));
							}
							else if (zscore == -1) {
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the left) of the mean.%n", number, Math.abs(zscore));
							}
							else if (zscore > 0) {
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the right) from the mean.%n", number, Math.abs(zscore));
							}
							else if (zscore < 0 ){
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the left) of the mean.%n", number, Math.abs(zscore));
							}
							else {
								System.out.printf("%nThe inputted number  (%.2f) is the same as the mean (%.2f).%n ", number, mean);
											}
							if (zscore > 2) {
								System.out.printf("The inputted number %.2f is a positive outlier.%n", number);
							}
							else if (zscore < -2) {
								System.out.printf("The inputted number %.2f is a negative outlier.%n", number);
							}
							if (zscore >= -1 & zscore <= 1) {
								System.out.printf("The inputted number %.2f lies within 68 percent of the data.%n", number);
							}
							else if (zscore >= -2 & zscore <= 2) {
								System.out.printf("The inputted number %.2f lies within 95 percent of the data.%n", number);
							}
							else if (zscore >= -3 & zscore <= 3) {
								System.out.printf("The inputted number %.2f lies within 99.7 percent of the data.%n", number);
							}
							double sixtyeightp = mean + (1 * sd);
							
							double sixeightp = mean - (1 * sd);
							
							double ninetyfivep = mean + (2 * sd);
							
							double ninefivep = mean - (2 * sd);
							
							double ninetyninepointsevenp = mean + (3 * sd);
							
							double ninenineptsevenp = mean - (3 * sd);
							
							System.out.printf("68 percent of the data lies between %.2f and %.2f.%n", sixeightp, sixtyeightp);
							
							System.out.printf("95 percent of the data lies between %.2f and %.2f.%n", ninefivep, ninetyfivep);
							
							System.out.printf("99.7 percent of the data lies between %.2f and %.2f.%n", ninenineptsevenp, ninetyninepointsevenp);
							
							System.out.println("\nWould you like to calculate the zscore of another number for the same data set?"
									+ " Input 'zscore' if so, type anything else if not.");
							decision = input.next();
										}
									}
								}
							}	
						}
					}
				    	Data.clear();
						stdev.clear();
						FrequencyMap.clear();
						
				        System.out.println("Would you like to do another simulation of d20 dice? Type 'd20' if so.");
				        decision = input.next();
					}
				}
				else if (decision.equals("d100")) {
				
					while (decision.equals("d100")) {
						int range = 100;
				        double mean = 0;
				        int ctt = 0;
				        int freq;
				        int numbers;
				        int mostFrequentNumber = -1;
				        int leastFrequentNumber = -1;
				        int maxFrequency = -1;
				        int minFrequency = Integer.MAX_VALUE;
				        System.out.println("Enter the number of random numbers to generate: ");
				        int amt = input.nextInt();

				        for (int i = 0; i < amt; i++) {
				            int rng = random.nextInt(range) + 1;
				            FrequencyMap.put(rng, FrequencyMap.getOrDefault(rng, 0) + 1);
				            double rng2 = rng;
				            Data.add(rng2);
				            mean = mean + rng;
				        }

				        System.out.println("\n\n\nFrequencies of each randomly generated number:");
				        for (Map.Entry<Integer, Integer> entry : FrequencyMap.entrySet()) {
				            System.out.println("Number " + entry.getKey() + ": " + entry.getValue() + " times");
				            numbers = entry.getKey();
				            freq = entry.getValue();
					        double percentage = (double) freq / amt * 100;
					        System.out.printf("Approx. percentage for number %d is %.2f%%.%n%n", entry.getKey(), percentage);
					        
					        if (freq > maxFrequency) {
				                maxFrequency = freq;
				                mostFrequentNumber = numbers;
				            }
				            if (freq < minFrequency) {
				                minFrequency = freq;
				                leastFrequentNumber = numbers;
				            }
				        }
				        
				        if (Data.isEmpty() == true) {
							System.out.println("You didn't enter any data points");
						}	
						else {
						Collections.sort(Data);
							
						int median = 0;
						int med = 0;
						double median2 = 0;
						double med2 = 0;
						int quartile1 = 0;
						int q1 = 0;
						double quart1 = 0;
						double qu1 = 0;
						int quartile3 = 0;
						int q3 = 0;
						double quart3 = 0;
						double qu3 = 0;
						double iqr = 0;
						double fq1 = 0;
						double fq3 = 0;
						double fm = 0;
						double outlier1;
						double outlier2;
						double Rnge = 0;
						double sd = 0;
						double avg = 0;
							
						if (amt % 2 == 1) {
						median = amt / 2;
						quartile1 = amt / 4;
						q1 = amt / 4;
						quartile3 = amt * 3 / 4;
						q3 = amt * 3 / 4;
						
						median2 = Data.get(median);
						quart1 = Data.get(quartile1);
						qu1 = Data.get(q1);
						quart3 = Data.get(quartile3);
						qu3 = Data.get(q3);
						
						fq1 = (quart1 + qu1) / 2;
						fq3 = (quart3 + qu3) / 2;
						
						iqr = fq3 - fq1;
							
						outlier1 = iqr * 1.5;
						
						outlier1 = fq3 + outlier1;
							
						outlier2 = iqr * 1.5;
							
						outlier2 = fq1 - outlier2;
								
						Rnge = Data.get(amt - 1) - Data.get(0);
						
						mean = mean / Data.size();
						
						final double outlier3 = outlier1;
						
						final double outlier4 = outlier2;
						
						final double fim = mean;
						
						Data.forEach( (n) -> { stdev.add(n);});
						
						stdev.replaceAll( (n) -> n = Math.abs(n - fim));
						
						stdev.replaceAll( (n) -> n = Math.pow(n, 2));
						
						
						while (ctt < amt) {
							sd =  sd + stdev.get(ctt);
							ctt++;
						}
						avg = sd / (amt - 1);
						
						sd = Math.sqrt(avg);
							
						System.out.printf("%nThe maximum of the data set is %.2f.%n", Data.get(amt - 1));
						
						System.out.printf("%nThe minimum of the data set is %.2f.%n", Data.get(0));
							
						System.out.printf("%nThe range of the data set is %.2f.%n", Rnge);
							
						System.out.printf("%nThe value for quartile 1 is %.2f.%n", fq1);
							
						System.out.printf("%nThe median of your data set is %.2f.%n", median2);
						
						System.out.printf("%nThe mean of your data set is %.2f.%n%n", mean);
						
						System.out.printf("Most Frequent Number: %d (Frequency: %d)%n%n", mostFrequentNumber, maxFrequency);
				        
						System.out.printf("Least Frequent Number: %d (Frequency: %d)%n", leastFrequentNumber, minFrequency);
							
						System.out.printf("%nThe value for quartile 3 is %.2f.%n", fq3);
							
						System.out.printf("%nThe interquartile range is %.2f.%n", iqr);
						
						System.out.printf("%nThe standard deviation of the data is %.2f.%n", sd);
							
						System.out.printf("%nNumbers in the data set above %.2f should be considered as outliers.%n", outlier1);
							
						System.out.printf("%nNumbers in the data set below %.2f should be considered as outliers.%n", outlier2);
						
						System.out.printf("%nThe size of your data set is %d.%n",Data.size());
						
						Data.forEach( (n) ->  {if (n > outlier3) {
							System.out.printf("%.2f is an upper outlier.%n", n);
						} else if (n < outlier4) {
							System.out.printf("%.2f is a lower outlier.%n", n); 
					}
						});
						
						if (mean > median2) {
							System.out.println("If you were to graph these data points, the graph would be positively (right) skewed");
							
							System.out.println("Since the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else if (median2 > mean) {
							System.out.println("If you were to graph these data points, the graph would be negatively (left) skewed");
							
							System.out.println("Since the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else {
							System.out.println("\nIf you were to graph these data points, the graph would be symmetrical.");
							
							System.out.println("Since the data is symmetrical, it is recommended to use the mean and Standard Deviation (St. Dev).");
						} 
						if (mean == median2) {
					
						System.out.println("Would you like to calculate z-score? If so, please input 'zscore' and if not then type anything else:");
						decision = input.next();
						
						if (decision.equals("zscore")) {
							
							while (decision.equals("zscore")) {
							
						System.out.println("Please input the number you'd like to calculate the z score for:");
						double number = input.nextDouble();
						
						double zscore = (number - mean) / sd;
						
						if (zscore == 1) {
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the right) of the mean.%n", number, Math.abs(zscore));
						}
						else if (zscore == -1) {
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the left) of the mean.%n", number, Math.abs(zscore));
						}
						else if (zscore > 0) {
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the right) from the mean.%n", number, Math.abs(zscore));
						}
						else if (zscore < 0 ){
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the left) of the mean.%n", number, Math.abs(zscore));
						}
						else {
							System.out.printf("%nThe inputted number (%.2f) is the same as the mean (%.2f).%n", number, mean);
							}
						if (zscore > 2) {
							System.out.printf("The inputted number %.2f is a positive outlier.%n", number);
						}
						else if (zscore < -2) {
							System.out.printf("The inputted number %.2f is a negative outlier.%n", number);
						}
						if (zscore >= -1 & zscore <= 1) {
							System.out.printf("The inputted number %.2f lies within 68 percent of the data.%n", number);
						}
						else if (zscore >= -2 & zscore <= 2) {
							System.out.printf("The inputted number %.2f lies within 95 percent of the data.%n", number);
						}
						else if (zscore >= -3 & zscore <= 3) {
							System.out.printf("The inputted number %.2f lies within 99.7 percent of the data.%n", number);
						}
						double sixtyeightp = mean + (1 * sd);
						
						double sixeightp = mean - (1 * sd);
						
						double ninetyfivep = mean + (2 * sd);
						
						double ninefivep = mean - (2 * sd);
						
						double ninetyninepointsevenp = mean + (3 * sd);
						
						double ninenineptsevenp = mean - (3 * sd);
						
						System.out.printf("68 percent of the data lies between %.2f and %.2f.%n", sixeightp, sixtyeightp);
						
						System.out.printf("95 percent of the data lies between %.2f and %.2f.%n", ninefivep, ninetyfivep);
						
						System.out.printf("99.7 percent of the data lies between %.2f and %.2f.%n", ninenineptsevenp, ninetyninepointsevenp);
						
						System.out.println("\nWould you like to calculate the zscore of another number for the same data set? "
								+ "Input 'zscore' if so, type anything else if not.");
						decision = input.next();
						}
					}
				}
			}
						else {
						median = amt / 2 - 1;
						med = amt / 2;
							
						q1 = amt / 4;
							
						q3 = amt * 3 / 4;
							
						median2 = Data.get(median);
						med2 = Data.get(med);
						
						qu1 = Data.get(q1);
						
						qu3 = Data.get(q3);
						
						iqr = qu3 - qu1;
						
						fm = (median2 + med2) / 2;
						
						outlier1 = iqr * 1.5;
						
						outlier1 = qu3 + outlier1;
						
						outlier2 = iqr * 1.5;
							
						outlier2 = qu1 - outlier2;
							
						Rnge = Data.get(amt - 1) - Data.get(0);
					
						mean = mean / Data.size();
						
						final double outlier3 = outlier1;
						
						final double outlier4 = outlier2;
						
						final double fim = mean;
						
						Data.forEach( (n) -> { stdev.add(n);});
						
						stdev.replaceAll( (n) -> n = Math.abs(n - fim));
						
						stdev.replaceAll( (n) -> n = Math.pow(n, 2));
						
						while (ctt < amt) {
							sd =  sd + stdev.get(ctt);
							ctt++;
						}
						avg = sd / (amt - 1);
						
						sd = Math.sqrt(avg);
							
						System.out.printf("%nThe maximum of the data set is %.2f.%n", Data.get(amt - 1));
							
						System.out.printf("%nThe minimum of the data set is %.2f.%n", Data.get(0));
							
						System.out.printf("%nThe range of the data set is %.2f.%n", Rnge);
							
						System.out.printf("%nThe value for quartile 1 is %.2f.%n", qu1);
							
						System.out.printf("%nThe median of your data set is %.2f.%n", fm);
						
						System.out.printf("%nThe mean of your data set is %.2f.%n%n", mean);
						
						System.out.printf("Most Frequent Number: %d (Frequency: %d)%n%n", mostFrequentNumber, maxFrequency);
				        
						System.out.printf("Least Frequent Number: %d (Frequency: %d)%n", leastFrequentNumber, minFrequency);
							
						System.out.printf("%nThe value for quartile 3 is %.2f.%n", qu3);
							
						System.out.printf("%nThe interquartile range is %.2f.%n", iqr);
						
						System.out.printf("%nThe standard deviation of the data is %.3f.%n", sd);
							
						System.out.printf("%nNumbers in the data set above %.2f should be considered as outliers.%n", outlier1);
							
						System.out.printf("%nNumbers in the data set below %.2f should be considered as outliers.%n", outlier2);
							
						System.out.printf("%nThe size of your data set is %d.%n%n",Data.size());
						
						Data.forEach( (n) ->  {if (n > outlier3) {
							System.out.printf("%.2f is an upper outlier.%n", n);
						} else if (n < outlier4) {
							System.out.printf("%.2f is a lower outlier.%n", n); 
					}
						});
						
						if (mean > fm) {
							System.out.println("\nIf you were to graph these data points, the graph would be positively (right) skewed.");
							
							System.out.println("\nSince the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else if (fm > mean) {
							System.out.println("\nIf you were to graph these data points, the graph would be negatively (left) skewed.");
							
							System.out.println("\nSince the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else {
							System.out.println("\nIf you were to graph these data points, the graph would be symmetrical.");
							
							System.out.println("\nSince the data is symmetrical, it is recommended to use the mean and Standard Deviation (St. Dev).");
							
							if (mean == fm) {
							System.out.println("Would you like to calculate z-score? If so, please input 'zscore' and if not then type anything else:");
							decision = input.next();
							
							if (decision.equals("zscore")) {
								
								while (decision.equals("zscore")) {
								
							System.out.println("Please input the number you'd like to calculate the z score for:");
							double number = input.nextDouble();
							
							double zscore = (number - mean) / sd;
							
							if (zscore == 1) {
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the right) of the mean.%n", number, Math.abs(zscore));
							}
							else if (zscore == -1) {
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the left) of the mean.%n", number, Math.abs(zscore));
							}
							else if (zscore > 0) {
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the right) from the mean.%n", number, Math.abs(zscore));
							}
							else if (zscore < 0 ){
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the left) of the mean.%n", number, Math.abs(zscore));
							}
							else {
								System.out.printf("%nThe inputted number  (%.2f) is the same as the mean (%.2f).%n ", number, mean);
											}
							if (zscore > 2) {
								System.out.printf("The inputted number %.2f is a positive outlier.%n", number);
							}
							else if (zscore < -2) {
								System.out.printf("The inputted number %.2f is a negative outlier.%n", number);
							}
							if (zscore >= -1 & zscore <= 1) {
								System.out.printf("The inputted number %.2f lies within 68 percent of the data.%n", number);
							}
							else if (zscore >= -2 & zscore <= 2) {
								System.out.printf("The inputted number %.2f lies within 95 percent of the data.%n", number);
							}
							else if (zscore >= -3 & zscore <= 3) {
								System.out.printf("The inputted number %.2f lies within 99.7 percent of the data.%n", number);
							}
							double sixtyeightp = mean + (1 * sd);
							
							double sixeightp = mean - (1 * sd);
							
							double ninetyfivep = mean + (2 * sd);
							
							double ninefivep = mean - (2 * sd);
							
							double ninetyninepointsevenp = mean + (3 * sd);
							
							double ninenineptsevenp = mean - (3 * sd);
							
							System.out.printf("68 percent of the data lies between %.2f and %.2f.%n", sixeightp, sixtyeightp);
							
							System.out.printf("95 percent of the data lies between %.2f and %.2f.%n", ninefivep, ninetyfivep);
							
							System.out.printf("99.7 percent of the data lies between %.2f and %.2f.%n", ninenineptsevenp, ninetyninepointsevenp);
							
							System.out.println("\nWould you like to calculate the zscore of another number for the same data set?"
									+ " Input 'zscore' if so, type anything else if not.");
							decision = input.next();
										}
									}
								}
							}	
						}
					}
				    	Data.clear();
						stdev.clear();
						FrequencyMap.clear();
						
				        System.out.println("Would you like to do another simulation of d100 dice? Type 'd100' if so.");
				        decision = input.next();
					}
				}
				else if (decision.equals("coin")) {
					
					while (decision.equals("coin")) {
						int range = 2;
				        double mean = 0;
				        int ctt = 0;
				        int freq;
				        int numbers;
				        int mostFrequentNumber = -1;
				        int leastFrequentNumber = -1;
				        int maxFrequency = -1;
				        int minFrequency = Integer.MAX_VALUE;
				        System.out.println("Enter the number of random numbers to generate: ");
				        int amt = input.nextInt();

				        for (int i = 0; i < amt; i++) {
				            int rng = random.nextInt(range) + 1;
				            FrequencyMap.put(rng, FrequencyMap.getOrDefault(rng, 0) + 1);
				            double rng2 = rng;
				            Data.add(rng2);
				            mean = mean + rng;
				        }

				        System.out.println("\n\n\nFrequencies of each randomly generated number:");
				        for (Map.Entry<Integer, Integer> entry : FrequencyMap.entrySet()) {
				            System.out.println("Number " + entry.getKey() + ": " + entry.getValue() + " times");
				            numbers = entry.getKey();
				            freq = entry.getValue();
					        double percentage = (double) freq / amt * 100;
					        System.out.printf("Approx. percentage for number %d is %.2f%%.%n%n", entry.getKey(), percentage);
					        
					        if (freq > maxFrequency) {
				                maxFrequency = freq;
				                mostFrequentNumber = numbers;
				            }
				            if (freq < minFrequency) {
				                minFrequency = freq;
				                leastFrequentNumber = numbers;
				            }
				        }
				        
				        if (Data.isEmpty() == true) {
							System.out.println("You didn't enter any data points");
						}	
						else {
						Collections.sort(Data);
							
						int median = 0;
						int med = 0;
						double median2 = 0;
						double med2 = 0;
						int quartile1 = 0;
						int q1 = 0;
						double quart1 = 0;
						double qu1 = 0;
						int quartile3 = 0;
						int q3 = 0;
						double quart3 = 0;
						double qu3 = 0;
						double iqr = 0;
						double fq1 = 0;
						double fq3 = 0;
						double fm = 0;
						double outlier1;
						double outlier2;
						double Rnge = 0;
						double sd = 0;
						double avg = 0;
							
						if (amt % 2 == 1) {
						median = amt / 2;
						quartile1 = amt / 4;
						q1 = amt / 4;
						quartile3 = amt * 3 / 4;
						q3 = amt * 3 / 4;
						
						median2 = Data.get(median);
						quart1 = Data.get(quartile1);
						qu1 = Data.get(q1);
						quart3 = Data.get(quartile3);
						qu3 = Data.get(q3);
						
						fq1 = (quart1 + qu1) / 2;
						fq3 = (quart3 + qu3) / 2;
						
						iqr = fq3 - fq1;
							
						outlier1 = iqr * 1.5;
						
						outlier1 = fq3 + outlier1;
							
						outlier2 = iqr * 1.5;
							
						outlier2 = fq1 - outlier2;
								
						Rnge = Data.get(amt - 1) - Data.get(0);
						
						mean = mean / Data.size();
						
						final double outlier3 = outlier1;
						
						final double outlier4 = outlier2;
						
						final double fim = mean;
						
						Data.forEach( (n) -> { stdev.add(n);});
						
						stdev.replaceAll( (n) -> n = Math.abs(n - fim));
						
						stdev.replaceAll( (n) -> n = Math.pow(n, 2));
						
						
						while (ctt < amt) {
							sd =  sd + stdev.get(ctt);
							ctt++;
						}
						avg = sd / (amt - 1);
						
						sd = Math.sqrt(avg);
							
						System.out.printf("%nThe maximum of the data set is %.2f.%n", Data.get(amt - 1));
						
						System.out.printf("%nThe minimum of the data set is %.2f.%n", Data.get(0));
							
						System.out.printf("%nThe range of the data set is %.2f.%n", Rnge);
							
						System.out.printf("%nThe value for quartile 1 is %.2f.%n", fq1);
							
						System.out.printf("%nThe median of your data set is %.2f.%n", median2);
						
						System.out.printf("%nThe mean of your data set is %.2f.%n%n", mean);
						
						System.out.printf("Most Frequent Number: %d (Frequency: %d)%n%n", mostFrequentNumber, maxFrequency);
				        
						System.out.printf("Least Frequent Number: %d (Frequency: %d)%n", leastFrequentNumber, minFrequency);
							
						System.out.printf("%nThe value for quartile 3 is %.2f.%n", fq3);
							
						System.out.printf("%nThe interquartile range is %.2f.%n", iqr);
						
						System.out.printf("%nThe standard deviation of the data is %.2f.%n", sd);
							
						System.out.printf("%nNumbers in the data set above %.2f should be considered as outliers.%n", outlier1);
							
						System.out.printf("%nNumbers in the data set below %.2f should be considered as outliers.%n", outlier2);
						
						System.out.printf("%nThe size of your data set is %d.%n",Data.size());
						
						Data.forEach( (n) ->  {if (n > outlier3) {
							System.out.printf("%.2f is an upper outlier.%n", n);
						} else if (n < outlier4) {
							System.out.printf("%.2f is a lower outlier.%n", n); 
					}
						});
						
						if (mean > median2) {
							System.out.println("If you were to graph these data points, the graph would be positively (right) skewed");
							
							System.out.println("Since the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else if (median2 > mean) {
							System.out.println("If you were to graph these data points, the graph would be negatively (left) skewed");
							
							System.out.println("Since the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else {
							System.out.println("\nIf you were to graph these data points, the graph would be symmetrical.");
							
							System.out.println("Since the data is symmetrical, it is recommended to use the mean and Standard Deviation (St. Dev).");
						} 
						if (mean == median2) {
					
						System.out.println("Would you like to calculate z-score? If so, please input 'zscore' and if not then type anything else:");
						decision = input.next();
						
						if (decision.equals("zscore")) {
							
							while (decision.equals("zscore")) {
							
						System.out.println("Please input the number you'd like to calculate the z score for:");
						double number = input.nextDouble();
						
						double zscore = (number - mean) / sd;
						
						if (zscore == 1) {
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the right) of the mean.%n", number, Math.abs(zscore));
						}
						else if (zscore == -1) {
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the left) of the mean.%n", number, Math.abs(zscore));
						}
						else if (zscore > 0) {
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the right) from the mean.%n", number, Math.abs(zscore));
						}
						else if (zscore < 0 ){
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the left) of the mean.%n", number, Math.abs(zscore));
						}
						else {
							System.out.printf("%nThe inputted number (%.2f) is the same as the mean (%.2f).%n", number, mean);
							}
						if (zscore > 2) {
							System.out.printf("The inputted number %.2f is a positive outlier.%n", number);
						}
						else if (zscore < -2) {
							System.out.printf("The inputted number %.2f is a negative outlier.%n", number);
						}
						if (zscore >= -1 & zscore <= 1) {
							System.out.printf("The inputted number %.2f lies within 68 percent of the data.%n", number);
						}
						else if (zscore >= -2 & zscore <= 2) {
							System.out.printf("The inputted number %.2f lies within 95 percent of the data.%n", number);
						}
						else if (zscore >= -3 & zscore <= 3) {
							System.out.printf("The inputted number %.2f lies within 99.7 percent of the data.%n", number);
						}
						double sixtyeightp = mean + (1 * sd);
						
						double sixeightp = mean - (1 * sd);
						
						double ninetyfivep = mean + (2 * sd);
						
						double ninefivep = mean - (2 * sd);
						
						double ninetyninepointsevenp = mean + (3 * sd);
						
						double ninenineptsevenp = mean - (3 * sd);
						
						System.out.printf("68 percent of the data lies between %.2f and %.2f.%n", sixeightp, sixtyeightp);
						
						System.out.printf("95 percent of the data lies between %.2f and %.2f.%n", ninefivep, ninetyfivep);
						
						System.out.printf("99.7 percent of the data lies between %.2f and %.2f.%n", ninenineptsevenp, ninetyninepointsevenp);
						
						System.out.println("\nWould you like to calculate the zscore of another number for the same data set? "
								+ "Input 'zscore' if so, type anything else if not.");
						decision = input.next();
						}
					}
				}
			}
						else {
						median = amt / 2 - 1;
						med = amt / 2;
							
						q1 = amt / 4;
							
						q3 = amt * 3 / 4;
							
						median2 = Data.get(median);
						med2 = Data.get(med);
						
						qu1 = Data.get(q1);
						
						qu3 = Data.get(q3);
						
						iqr = qu3 - qu1;
						
						fm = (median2 + med2) / 2;
						
						outlier1 = iqr * 1.5;
						
						outlier1 = qu3 + outlier1;
						
						outlier2 = iqr * 1.5;
							
						outlier2 = qu1 - outlier2;
							
						Rnge = Data.get(amt - 1) - Data.get(0);
					
						mean = mean / Data.size();
						
						final double outlier3 = outlier1;
						
						final double outlier4 = outlier2;
						
						final double fim = mean;
						
						Data.forEach( (n) -> { stdev.add(n);});
						
						stdev.replaceAll( (n) -> n = Math.abs(n - fim));
						
						stdev.replaceAll( (n) -> n = Math.pow(n, 2));
						
						while (ctt < amt) {
							sd =  sd + stdev.get(ctt);
							ctt++;
						}
						avg = sd / (amt - 1);
						
						sd = Math.sqrt(avg);
							
						System.out.printf("%nThe maximum of the data set is %.2f.%n", Data.get(amt - 1));
							
						System.out.printf("%nThe minimum of the data set is %.2f.%n", Data.get(0));
							
						System.out.printf("%nThe range of the data set is %.2f.%n", Rnge);
							
						System.out.printf("%nThe value for quartile 1 is %.2f.%n", qu1);
							
						System.out.printf("%nThe median of your data set is %.2f.%n", fm);
						
						System.out.printf("%nThe mean of your data set is %.2f.%n%n", mean);
						
						System.out.printf("Most Frequent Number: %d (Frequency: %d)%n%n", mostFrequentNumber, maxFrequency);
				        
						System.out.printf("Least Frequent Number: %d (Frequency: %d)%n", leastFrequentNumber, minFrequency);
							
						System.out.printf("%nThe value for quartile 3 is %.2f.%n", qu3);
							
						System.out.printf("%nThe interquartile range is %.2f.%n", iqr);
						
						System.out.printf("%nThe standard deviation of the data is %.3f.%n", sd);
							
						System.out.printf("%nNumbers in the data set above %.2f should be considered as outliers.%n", outlier1);
							
						System.out.printf("%nNumbers in the data set below %.2f should be considered as outliers.%n", outlier2);
							
						System.out.printf("%nThe size of your data set is %d.%n%n",Data.size());
						
						Data.forEach( (n) ->  {if (n > outlier3) {
							System.out.printf("%.2f is an upper outlier.%n", n);
						} else if (n < outlier4) {
							System.out.printf("%.2f is a lower outlier.%n", n); 
					}
						});
						
						if (mean > fm) {
							System.out.println("\nIf you were to graph these data points, the graph would be positively (right) skewed.");
							
							System.out.println("\nSince the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else if (fm > mean) {
							System.out.println("\nIf you were to graph these data points, the graph would be negatively (left) skewed.");
							
							System.out.println("\nSince the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else {
							System.out.println("\nIf you were to graph these data points, the graph would be symmetrical.");
							
							System.out.println("\nSince the data is symmetrical, it is recommended to use the mean and Standard Deviation (St. Dev).");
							
							if (mean == fm) {
							System.out.println("Would you like to calculate z-score? If so, please input 'zscore' and if not then type anything else:");
							decision = input.next();
							
							if (decision.equals("zscore")) {
								
								while (decision.equals("zscore")) {
								
							System.out.println("Please input the number you'd like to calculate the z score for:");
							double number = input.nextDouble();
							
							double zscore = (number - mean) / sd;
							
							if (zscore == 1) {
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the right) of the mean.%n", number, Math.abs(zscore));
							}
							else if (zscore == -1) {
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the left) of the mean.%n", number, Math.abs(zscore));
							}
							else if (zscore > 0) {
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the right) from the mean.%n", number, Math.abs(zscore));
							}
							else if (zscore < 0 ){
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the left) of the mean.%n", number, Math.abs(zscore));
							}
							else {
								System.out.printf("%nThe inputted number  (%.2f) is the same as the mean (%.2f).%n ", number, mean);
											}
							if (zscore > 2) {
								System.out.printf("The inputted number %.2f is a positive outlier.%n", number);
							}
							else if (zscore < -2) {
								System.out.printf("The inputted number %.2f is a negative outlier.%n", number);
							}
							if (zscore >= -1 & zscore <= 1) {
								System.out.printf("The inputted number %.2f lies within 68 percent of the data.%n", number);
							}
							else if (zscore >= -2 & zscore <= 2) {
								System.out.printf("The inputted number %.2f lies within 95 percent of the data.%n", number);
							}
							else if (zscore >= -3 & zscore <= 3) {
								System.out.printf("The inputted number %.2f lies within 99.7 percent of the data.%n", number);
							}
							double sixtyeightp = mean + (1 * sd);
							
							double sixeightp = mean - (1 * sd);
							
							double ninetyfivep = mean + (2 * sd);
							
							double ninefivep = mean - (2 * sd);
							
							double ninetyninepointsevenp = mean + (3 * sd);
							
							double ninenineptsevenp = mean - (3 * sd);
							
							System.out.printf("68 percent of the data lies between %.2f and %.2f.%n", sixeightp, sixtyeightp);
							
							System.out.printf("95 percent of the data lies between %.2f and %.2f.%n", ninefivep, ninetyfivep);
							
							System.out.printf("99.7 percent of the data lies between %.2f and %.2f.%n", ninenineptsevenp, ninetyninepointsevenp);
							
							System.out.println("\nWould you like to calculate the zscore of another number for the same data set?"
									+ " Input 'zscore' if so, type anything else if not.");
							decision = input.next();
										}
									}
								}
							}	
						}
					}
				    	Data.clear();
						stdev.clear();
						FrequencyMap.clear();
						
				        System.out.println("Would you like to do another simulation of a coin? Type 'coin' if so.");
				        decision = input.next();
					}
				}
				else if (decision.equals("cards")) {
				
					while (decision.equals("cards")) {
						int range = 52;
				        double mean = 0;
				        int ctt = 0;
				        int freq;
				        int numbers;
				        int mostFrequentNumber = -1;
				        int leastFrequentNumber = -1;
				        int maxFrequency = -1;
				        int minFrequency = Integer.MAX_VALUE;
				        System.out.println("Enter the number of random numbers to generate: ");
				        int amt = input.nextInt();

				        for (int i = 0; i < amt; i++) {
				            int rng = random.nextInt(range) + 1;
				            FrequencyMap.put(rng, FrequencyMap.getOrDefault(rng, 0) + 1);
				            double rng2 = rng;
				            Data.add(rng2);
				            mean = mean + rng;
				        }

				        System.out.println("\n\n\nFrequencies of each randomly generated number:");
				        for (Map.Entry<Integer, Integer> entry : FrequencyMap.entrySet()) {
				            System.out.println("Number " + entry.getKey() + ": " + entry.getValue() + " times");
				            numbers = entry.getKey();
				            freq = entry.getValue();
					        double percentage = (double) freq / amt * 100;
					        System.out.printf("Approx. percentage for number %d is %.2f%%.%n%n", entry.getKey(), percentage);
					        
					        if (freq > maxFrequency) {
				                maxFrequency = freq;
				                mostFrequentNumber = numbers;
				            }
				            if (freq < minFrequency) {
				                minFrequency = freq;
				                leastFrequentNumber = numbers;
				            }
				        }
				        
				        if (Data.isEmpty() == true) {
							System.out.println("You didn't enter any data points");
						}	
						else {
						Collections.sort(Data);
							
						int median = 0;
						int med = 0;
						double median2 = 0;
						double med2 = 0;
						int quartile1 = 0;
						int q1 = 0;
						double quart1 = 0;
						double qu1 = 0;
						int quartile3 = 0;
						int q3 = 0;
						double quart3 = 0;
						double qu3 = 0;
						double iqr = 0;
						double fq1 = 0;
						double fq3 = 0;
						double fm = 0;
						double outlier1;
						double outlier2;
						double Rnge = 0;
						double sd = 0;
						double avg = 0;
							
						if (amt % 2 == 1) {
						median = amt / 2;
						quartile1 = amt / 4;
						q1 = amt / 4;
						quartile3 = amt * 3 / 4;
						q3 = amt * 3 / 4;
						
						median2 = Data.get(median);
						quart1 = Data.get(quartile1);
						qu1 = Data.get(q1);
						quart3 = Data.get(quartile3);
						qu3 = Data.get(q3);
						
						fq1 = (quart1 + qu1) / 2;
						fq3 = (quart3 + qu3) / 2;
						
						iqr = fq3 - fq1;
							
						outlier1 = iqr * 1.5;
						
						outlier1 = fq3 + outlier1;
							
						outlier2 = iqr * 1.5;
							
						outlier2 = fq1 - outlier2;
								
						Rnge = Data.get(amt - 1) - Data.get(0);
						
						mean = mean / Data.size();
						
						final double outlier3 = outlier1;
						
						final double outlier4 = outlier2;
						
						final double fim = mean;
						
						Data.forEach( (n) -> { stdev.add(n);});
						
						stdev.replaceAll( (n) -> n = Math.abs(n - fim));
						
						stdev.replaceAll( (n) -> n = Math.pow(n, 2));
						
						
						while (ctt < amt) {
							sd =  sd + stdev.get(ctt);
							ctt++;
						}
						avg = sd / (amt - 1);
						
						sd = Math.sqrt(avg);
							
						System.out.printf("%nThe maximum of the data set is %.2f.%n", Data.get(amt - 1));
						
						System.out.printf("%nThe minimum of the data set is %.2f.%n", Data.get(0));
							
						System.out.printf("%nThe range of the data set is %.2f.%n", Rnge);
							
						System.out.printf("%nThe value for quartile 1 is %.2f.%n", fq1);
							
						System.out.printf("%nThe median of your data set is %.2f.%n", median2);
						
						System.out.printf("%nThe mean of your data set is %.2f.%n%n", mean);
						
						System.out.printf("Most Frequent Number: %d (Frequency: %d)%n%n", mostFrequentNumber, maxFrequency);
				        
						System.out.printf("Least Frequent Number: %d (Frequency: %d)%n", leastFrequentNumber, minFrequency);
							
						System.out.printf("%nThe value for quartile 3 is %.2f.%n", fq3);
							
						System.out.printf("%nThe interquartile range is %.2f.%n", iqr);
						
						System.out.printf("%nThe standard deviation of the data is %.2f.%n", sd);
							
						System.out.printf("%nNumbers in the data set above %.2f should be considered as outliers.%n", outlier1);
							
						System.out.printf("%nNumbers in the data set below %.2f should be considered as outliers.%n", outlier2);
						
						System.out.printf("%nThe size of your data set is %d.%n",Data.size());
						
						Data.forEach( (n) ->  {if (n > outlier3) {
							System.out.printf("%.2f is an upper outlier.%n", n);
						} else if (n < outlier4) {
							System.out.printf("%.2f is a lower outlier.%n", n); 
					}
						});
						
						if (mean > median2) {
							System.out.println("If you were to graph these data points, the graph would be positively (right) skewed");
							
							System.out.println("Since the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else if (median2 > mean) {
							System.out.println("If you were to graph these data points, the graph would be negatively (left) skewed");
							
							System.out.println("Since the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else {
							System.out.println("\nIf you were to graph these data points, the graph would be symmetrical.");
							
							System.out.println("Since the data is symmetrical, it is recommended to use the mean and Standard Deviation (St. Dev).");
						} 
						if (mean == median2) {
					
						System.out.println("Would you like to calculate z-score? If so, please input 'zscore' and if not then type anything else:");
						decision = input.next();
						
						if (decision.equals("zscore")) {
							
							while (decision.equals("zscore")) {
							
						System.out.println("Please input the number you'd like to calculate the z score for:");
						double number = input.nextDouble();
						
						double zscore = (number - mean) / sd;
						
						if (zscore == 1) {
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the right) of the mean.%n", number, Math.abs(zscore));
						}
						else if (zscore == -1) {
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the left) of the mean.%n", number, Math.abs(zscore));
						}
						else if (zscore > 0) {
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the right) from the mean.%n", number, Math.abs(zscore));
						}
						else if (zscore < 0 ){
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the left) of the mean.%n", number, Math.abs(zscore));
						}
						else {
							System.out.printf("%nThe inputted number (%.2f) is the same as the mean (%.2f).%n", number, mean);
							}
						if (zscore > 2) {
							System.out.printf("The inputted number %.2f is a positive outlier.%n", number);
						}
						else if (zscore < -2) {
							System.out.printf("The inputted number %.2f is a negative outlier.%n", number);
						}
						if (zscore >= -1 & zscore <= 1) {
							System.out.printf("The inputted number %.2f lies within 68 percent of the data.%n", number);
						}
						else if (zscore >= -2 & zscore <= 2) {
							System.out.printf("The inputted number %.2f lies within 95 percent of the data.%n", number);
						}
						else if (zscore >= -3 & zscore <= 3) {
							System.out.printf("The inputted number %.2f lies within 99.7 percent of the data.%n", number);
						}
						double sixtyeightp = mean + (1 * sd);
						
						double sixeightp = mean - (1 * sd);
						
						double ninetyfivep = mean + (2 * sd);
						
						double ninefivep = mean - (2 * sd);
						
						double ninetyninepointsevenp = mean + (3 * sd);
						
						double ninenineptsevenp = mean - (3 * sd);
						
						System.out.printf("68 percent of the data lies between %.2f and %.2f.%n", sixeightp, sixtyeightp);
						
						System.out.printf("95 percent of the data lies between %.2f and %.2f.%n", ninefivep, ninetyfivep);
						
						System.out.printf("99.7 percent of the data lies between %.2f and %.2f.%n", ninenineptsevenp, ninetyninepointsevenp);
						
						System.out.println("\nWould you like to calculate the zscore of another number for the same data set? "
								+ "Input 'zscore' if so, type anything else if not.");
						decision = input.next();
						}
					}
				}
			}
						else {
						median = amt / 2 - 1;
						med = amt / 2;
							
						q1 = amt / 4;
							
						q3 = amt * 3 / 4;
							
						median2 = Data.get(median);
						med2 = Data.get(med);
						
						qu1 = Data.get(q1);
						
						qu3 = Data.get(q3);
						
						iqr = qu3 - qu1;
						
						fm = (median2 + med2) / 2;
						
						outlier1 = iqr * 1.5;
						
						outlier1 = qu3 + outlier1;
						
						outlier2 = iqr * 1.5;
							
						outlier2 = qu1 - outlier2;
							
						Rnge = Data.get(amt - 1) - Data.get(0);
					
						mean = mean / Data.size();
						
						final double outlier3 = outlier1;
						
						final double outlier4 = outlier2;
						
						final double fim = mean;
						
						Data.forEach( (n) -> { stdev.add(n);});
						
						stdev.replaceAll( (n) -> n = Math.abs(n - fim));
						
						stdev.replaceAll( (n) -> n = Math.pow(n, 2));
						
						while (ctt < amt) {
							sd =  sd + stdev.get(ctt);
							ctt++;
						}
						avg = sd / (amt - 1);
						
						sd = Math.sqrt(avg);
							
						System.out.printf("%nThe maximum of the data set is %.2f.%n", Data.get(amt - 1));
							
						System.out.printf("%nThe minimum of the data set is %.2f.%n", Data.get(0));
							
						System.out.printf("%nThe range of the data set is %.2f.%n", Rnge);
							
						System.out.printf("%nThe value for quartile 1 is %.2f.%n", qu1);
							
						System.out.printf("%nThe median of your data set is %.2f.%n", fm);
						
						System.out.printf("%nThe mean of your data set is %.2f.%n%n", mean);
						
						System.out.printf("Most Frequent Number: %d (Frequency: %d)%n%n", mostFrequentNumber, maxFrequency);
				        
						System.out.printf("Least Frequent Number: %d (Frequency: %d)%n", leastFrequentNumber, minFrequency);
							
						System.out.printf("%nThe value for quartile 3 is %.2f.%n", qu3);
							
						System.out.printf("%nThe interquartile range is %.2f.%n", iqr);
						
						System.out.printf("%nThe standard deviation of the data is %.3f.%n", sd);
							
						System.out.printf("%nNumbers in the data set above %.2f should be considered as outliers.%n", outlier1);
							
						System.out.printf("%nNumbers in the data set below %.2f should be considered as outliers.%n", outlier2);
							
						System.out.printf("%nThe size of your data set is %d.%n%n",Data.size());
						
						Data.forEach( (n) ->  {if (n > outlier3) {
							System.out.printf("%.2f is an upper outlier.%n", n);
						} else if (n < outlier4) {
							System.out.printf("%.2f is a lower outlier.%n", n); 
					}
						});
						
						if (mean > fm) {
							System.out.println("\nIf you were to graph these data points, the graph would be positively (right) skewed.");
							
							System.out.println("\nSince the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else if (fm > mean) {
							System.out.println("\nIf you were to graph these data points, the graph would be negatively (left) skewed.");
							
							System.out.println("\nSince the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else {
							System.out.println("\nIf you were to graph these data points, the graph would be symmetrical.");
							
							System.out.println("\nSince the data is symmetrical, it is recommended to use the mean and Standard Deviation (St. Dev).");
							
							if (mean == fm) {
							System.out.println("Would you like to calculate z-score? If so, please input 'zscore' and if not then type anything else:");
							decision = input.next();
							
							if (decision.equals("zscore")) {
								
								while (decision.equals("zscore")) {
								
							System.out.println("Please input the number you'd like to calculate the z score for:");
							double number = input.nextDouble();
							
							double zscore = (number - mean) / sd;
							
							if (zscore == 1) {
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the right) of the mean.%n", number, Math.abs(zscore));
							}
							else if (zscore == -1) {
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the left) of the mean.%n", number, Math.abs(zscore));
							}
							else if (zscore > 0) {
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the right) from the mean.%n", number, Math.abs(zscore));
							}
							else if (zscore < 0 ){
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the left) of the mean.%n", number, Math.abs(zscore));
							}
							else {
								System.out.printf("%nThe inputted number  (%.2f) is the same as the mean (%.2f).%n ", number, mean);
											}
							if (zscore > 2) {
								System.out.printf("The inputted number %.2f is a positive outlier.%n", number);
							}
							else if (zscore < -2) {
								System.out.printf("The inputted number %.2f is a negative outlier.%n", number);
							}
							if (zscore >= -1 & zscore <= 1) {
								System.out.printf("The inputted number %.2f lies within 68 percent of the data.%n", number);
							}
							else if (zscore >= -2 & zscore <= 2) {
								System.out.printf("The inputted number %.2f lies within 95 percent of the data.%n", number);
							}
							else if (zscore >= -3 & zscore <= 3) {
								System.out.printf("The inputted number %.2f lies within 99.7 percent of the data.%n", number);
							}
							double sixtyeightp = mean + (1 * sd);
							
							double sixeightp = mean - (1 * sd);
							
							double ninetyfivep = mean + (2 * sd);
							
							double ninefivep = mean - (2 * sd);
							
							double ninetyninepointsevenp = mean + (3 * sd);
							
							double ninenineptsevenp = mean - (3 * sd);
							
							System.out.printf("68 percent of the data lies between %.2f and %.2f.%n", sixeightp, sixtyeightp);
							
							System.out.printf("95 percent of the data lies between %.2f and %.2f.%n", ninefivep, ninetyfivep);
							
							System.out.printf("99.7 percent of the data lies between %.2f and %.2f.%n", ninenineptsevenp, ninetyninepointsevenp);
							
							System.out.println("\nWould you like to calculate the zscore of another number for the same data set?"
									+ " Input 'zscore' if so, type anything else if not.");
							decision = input.next();
										}
									}
								}
							}	
						}
					}
				    	Data.clear();
						stdev.clear();
						FrequencyMap.clear();
						
				        System.out.println("Would you like to do another simulation of a deck of cards? Type 'cards' if so.");
				        decision = input.next();
					}
				}
				else if (decision.equals("custom")) {
					
					while (decision.equals("custom")) {
						
						System.out.println("What is the range of the simulation? (From 1 - n)");
						int range = input.nextInt();
						
				        double mean = 0;
				        int ctt = 0;
				        int freq;
				        int numbers;
				        int mostFrequentNumber = -1;
				        int leastFrequentNumber = -1;
				        int maxFrequency = -1;
				        int minFrequency = Integer.MAX_VALUE;
				        System.out.println("Enter the number of random numbers to generate: ");
				        int amt = input.nextInt();

				        for (int i = 0; i < amt; i++) {
				            int rng = random.nextInt(range) + 1;
				            FrequencyMap.put(rng, FrequencyMap.getOrDefault(rng, 0) + 1);
				            double rng2 = rng;
				            Data.add(rng2);
				            mean = mean + rng;
				        }

				        System.out.println("\n\n\nFrequencies of each randomly generated number:");
				        for (Map.Entry<Integer, Integer> entry : FrequencyMap.entrySet()) {
				            System.out.println("Number " + entry.getKey() + ": " + entry.getValue() + " times");
				            numbers = entry.getKey();
				            freq = entry.getValue();
					        double percentage = (double) freq / amt * 100;
					        System.out.printf("Approx. percentage for number %d is %.2f%%.%n%n", entry.getKey(), percentage);
					        if (freq > maxFrequency) {
				                maxFrequency = freq;
				                mostFrequentNumber = numbers;
				            }
				            if (freq < minFrequency) {
				                minFrequency = freq;
				                leastFrequentNumber = numbers;
				            }
				        }
				        
				        if (Data.isEmpty() == true) {
							System.out.println("You didn't enter any data points");
						}	
						else {
						Collections.sort(Data);
							
						int median = 0;
						int med = 0;
						double median2 = 0;
						double med2 = 0;
						int quartile1 = 0;
						int q1 = 0;
						double quart1 = 0;
						double qu1 = 0;
						int quartile3 = 0;
						int q3 = 0;
						double quart3 = 0;
						double qu3 = 0;
						double iqr = 0;
						double fq1 = 0;
						double fq3 = 0;
						double fm = 0;
						double outlier1;
						double outlier2;
						double Rnge = 0;
						double sd = 0;
						double avg = 0;
							
						if (amt % 2 == 1) {
						median = amt / 2;
						quartile1 = amt / 4;
						q1 = amt / 4;
						quartile3 = amt * 3 / 4;
						q3 = amt * 3 / 4;
						
						median2 = Data.get(median);
						quart1 = Data.get(quartile1);
						qu1 = Data.get(q1);
						quart3 = Data.get(quartile3);
						qu3 = Data.get(q3);
						
						fq1 = (quart1 + qu1) / 2;
						fq3 = (quart3 + qu3) / 2;
						
						iqr = fq3 - fq1;
							
						outlier1 = iqr * 1.5;
						
						outlier1 = fq3 + outlier1;
							
						outlier2 = iqr * 1.5;
							
						outlier2 = fq1 - outlier2;
								
						Rnge = Data.get(amt - 1) - Data.get(0);
						
						mean = mean / Data.size();
						
						final double outlier3 = outlier1;
						
						final double outlier4 = outlier2;
						
						final double fim = mean;
						
						Data.forEach( (n) -> { stdev.add(n);});
						
						stdev.replaceAll( (n) -> n = Math.abs(n - fim));
						
						stdev.replaceAll( (n) -> n = Math.pow(n, 2));
						
						
						while (ctt < amt) {
							sd =  sd + stdev.get(ctt);
							ctt++;
						}
						avg = sd / (amt - 1);
						
						sd = Math.sqrt(avg);
							
						System.out.printf("%nThe maximum of the data set is %.2f.%n", Data.get(amt - 1));
						
						System.out.printf("%nThe minimum of the data set is %.2f.%n", Data.get(0));
							
						System.out.printf("%nThe range of the data set is %.2f.%n", Rnge);
							
						System.out.printf("%nThe value for quartile 1 is %.2f.%n", fq1);
							
						System.out.printf("%nThe median of your data set is %.2f.%n", median2);
						
						System.out.printf("%nThe mean of your data set is %.2f.%n%n", mean);
						
						System.out.printf("Most Frequent Number: %d (Frequency: %d)%n%n", mostFrequentNumber, maxFrequency);
					    
						System.out.printf("Least Frequent Number: %d (Frequency: %d)%n", leastFrequentNumber, minFrequency);
							
						System.out.printf("%nThe value for quartile 3 is %.2f.%n", fq3);
							
						System.out.printf("%nThe interquartile range is %.2f.%n", iqr);
						
						System.out.printf("%nThe standard deviation of the data is %.2f.%n", sd);
							
						System.out.printf("%nNumbers in the data set above %.2f should be considered as outliers.%n", outlier1);
							
						System.out.printf("%nNumbers in the data set below %.2f should be considered as outliers.%n", outlier2);
						
						System.out.printf("%nThe size of your data set is %d.%n",Data.size());
						
						Data.forEach( (n) ->  {if (n > outlier3) {
							System.out.printf("%.2f is an upper outlier.%n", n);
						} else if (n < outlier4) {
							System.out.printf("%.2f is a lower outlier.%n", n); 
					}
						});
						
						if (mean > median2) {
							System.out.println("If you were to graph these data points, the graph would be positively (right) skewed");
							
							System.out.println("Since the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else if (median2 > mean) {
							System.out.println("If you were to graph these data points, the graph would be negatively (left) skewed");
							
							System.out.println("Since the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else {
							System.out.println("\nIf you were to graph these data points, the graph would be symmetrical.");
							
							System.out.println("Since the data is symmetrical, it is recommended to use the mean and Standard Deviation (St. Dev).");
						} 
						if (mean == median2) {
					
						System.out.println("Would you like to calculate z-score? If so, please input 'zscore' and if not then type anything else:");
						decision = input.next();
						
						if (decision.equals("zscore")) {
							
							while (decision.equals("zscore")) {
							
						System.out.println("Please input the number you'd like to calculate the z score for:");
						double number = input.nextDouble();
						
						double zscore = (number - mean) / sd;
						
						if (zscore == 1) {
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the right) of the mean.%n", number, Math.abs(zscore));
						}
						else if (zscore == -1) {
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the left) of the mean.%n", number, Math.abs(zscore));
						}
						else if (zscore > 0) {
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the right) from the mean.%n", number, Math.abs(zscore));
						}
						else if (zscore < 0 ){
							System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the left) of the mean.%n", number, Math.abs(zscore));
						}
						else {
							System.out.printf("%nThe inputted number (%.2f) is the same as the mean (%.2f).%n", number, mean);
							}
						if (zscore > 2) {
							System.out.printf("The inputted number %.2f is a positive outlier.%n", number);
						}
						else if (zscore < -2) {
							System.out.printf("The inputted number %.2f is a negative outlier.%n", number);
						}
						if (zscore >= -1 & zscore <= 1) {
							System.out.printf("The inputted number %.2f lies within 68 percent of the data.%n", number);
						}
						else if (zscore >= -2 & zscore <= 2) {
							System.out.printf("The inputted number %.2f lies within 95 percent of the data.%n", number);
						}
						else if (zscore >= -3 & zscore <= 3) {
							System.out.printf("The inputted number %.2f lies within 99.7 percent of the data.%n", number);
						}
						double sixtyeightp = mean + (1 * sd);
						
						double sixeightp = mean - (1 * sd);
						
						double ninetyfivep = mean + (2 * sd);
						
						double ninefivep = mean - (2 * sd);
						
						double ninetyninepointsevenp = mean + (3 * sd);
						
						double ninenineptsevenp = mean - (3 * sd);
						
						System.out.printf("68 percent of the data lies between %.2f and %.2f.%n", sixeightp, sixtyeightp);
						
						System.out.printf("95 percent of the data lies between %.2f and %.2f.%n", ninefivep, ninetyfivep);
						
						System.out.printf("99.7 percent of the data lies between %.2f and %.2f.%n", ninenineptsevenp, ninetyninepointsevenp);
						
						System.out.println("\nWould you like to calculate the zscore of another number for the same data set? "
								+ "Input 'zscore' if so, type anything else if not.");
						decision = input.next();
						}
					}
				}
			}
						else {
						median = amt / 2 - 1;
						med = amt / 2;
							
						q1 = amt / 4;
							
						q3 = amt * 3 / 4;
							
						median2 = Data.get(median);
						med2 = Data.get(med);
						
						qu1 = Data.get(q1);
						
						qu3 = Data.get(q3);
						
						iqr = qu3 - qu1;
						
						fm = (median2 + med2) / 2;
						
						outlier1 = iqr * 1.5;
						
						outlier1 = qu3 + outlier1;
						
						outlier2 = iqr * 1.5;
							
						outlier2 = qu1 - outlier2;
							
						Rnge = Data.get(amt - 1) - Data.get(0);
					
						mean = mean / Data.size();
						
						final double outlier3 = outlier1;
						
						final double outlier4 = outlier2;
						
						final double fim = mean;
						
						Data.forEach( (n) -> { stdev.add(n);});
						
						stdev.replaceAll( (n) -> n = Math.abs(n - fim));
						
						stdev.replaceAll( (n) -> n = Math.pow(n, 2));
						
						while (ctt < amt) {
							sd =  sd + stdev.get(ctt);
							ctt++;
						}
						avg = sd / (amt - 1);
						
						sd = Math.sqrt(avg);
							
						System.out.printf("%nThe maximum of the data set is %.2f.%n", Data.get(amt - 1));
							
						System.out.printf("%nThe minimum of the data set is %.2f.%n", Data.get(0));
							
						System.out.printf("%nThe range of the data set is %.2f.%n", Rnge);
							
						System.out.printf("%nThe value for quartile 1 is %.2f.%n", qu1);
							
						System.out.printf("%nThe median of your data set is %.2f.%n", fm);
						
						System.out.printf("%nThe mean of your data set is %.2f.%n%n", mean);
						
						System.out.printf("Most Frequent Number: %d (Frequency: %d)%n%n", mostFrequentNumber, maxFrequency);
					    
						System.out.printf("Least Frequent Number: %d (Frequency: %d)%n", leastFrequentNumber, minFrequency);
							
						System.out.printf("%nThe value for quartile 3 is %.2f.%n", qu3);
							
						System.out.printf("%nThe interquartile range is %.2f.%n", iqr);
						
						System.out.printf("%nThe standard deviation of the data is %.3f.%n", sd);
							
						System.out.printf("%nNumbers in the data set above %.2f should be considered as outliers.%n", outlier1);
							
						System.out.printf("%nNumbers in the data set below %.2f should be considered as outliers.%n", outlier2);
							
						System.out.printf("%nThe size of your data set is %d.%n%n",Data.size());
						
						Data.forEach( (n) ->  {if (n > outlier3) {
							System.out.printf("%.2f is an upper outlier.%n", n);
						} else if (n < outlier4) {
							System.out.printf("%.2f is a lower outlier.%n", n); 
					}
						});
						
						if (mean > fm) {
							System.out.println("\nIf you were to graph these data points, the graph would be positively (right) skewed.");
							
							System.out.println("\nSince the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else if (fm > mean) {
							System.out.println("\nIf you were to graph these data points, the graph would be negatively (left) skewed.");
							
							System.out.println("\nSince the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
						}
						else {
							System.out.println("\nIf you were to graph these data points, the graph would be symmetrical.");
							
							System.out.println("\nSince the data is symmetrical, it is recommended to use the mean and Standard Deviation (St. Dev).");
							
							if (mean == fm) {
							System.out.println("Would you like to calculate z-score? If so, please input 'zscore' and if not then type anything else:");
							decision = input.next();
							
							if (decision.equals("zscore")) {
								
								while (decision.equals("zscore")) {
								
							System.out.println("Please input the number you'd like to calculate the z score for:");
							double number = input.nextDouble();
							
							double zscore = (number - mean) / sd;
							
							if (zscore == 1) {
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the right) of the mean.%n", number, Math.abs(zscore));
							}
							else if (zscore == -1) {
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviation away (to the left) of the mean.%n", number, Math.abs(zscore));
							}
							else if (zscore > 0) {
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the right) from the mean.%n", number, Math.abs(zscore));
							}
							else if (zscore < 0 ){
								System.out.printf("%nThe inputted number (%.2f) is %.2f standard deviations away (to the left) of the mean.%n", number, Math.abs(zscore));
							}
							else {
								System.out.printf("%nThe inputted number  (%.2f) is the same as the mean (%.2f).%n ", number, mean);
											}
							if (zscore > 2) {
								System.out.printf("The inputted number %.2f is a positive outlier.%n", number);
							}
							else if (zscore < -2) {
								System.out.printf("The inputted number %.2f is a negative outlier.%n", number);
							}
							if (zscore >= -1 & zscore <= 1) {
								System.out.printf("The inputted number %.2f lies within 68 percent of the data.%n", number);
							}
							else if (zscore >= -2 & zscore <= 2) {
								System.out.printf("The inputted number %.2f lies within 95 percent of the data.%n", number);
							}
							else if (zscore >= -3 & zscore <= 3) {
								System.out.printf("The inputted number %.2f lies within 99.7 percent of the data.%n", number);
							}
							double sixtyeightp = mean + (1 * sd);
							
							double sixeightp = mean - (1 * sd);
							
							double ninetyfivep = mean + (2 * sd);
							
							double ninefivep = mean - (2 * sd);
							
							double ninetyninepointsevenp = mean + (3 * sd);
							
							double ninenineptsevenp = mean - (3 * sd);
							
							System.out.printf("68 percent of the data lies between %.2f and %.2f.%n", sixeightp, sixtyeightp);
							
							System.out.printf("95 percent of the data lies between %.2f and %.2f.%n", ninefivep, ninetyfivep);
							
							System.out.printf("99.7 percent of the data lies between %.2f and %.2f.%n", ninenineptsevenp, ninetyninepointsevenp);
							
							System.out.println("\nWould you like to calculate the zscore of another number for the same data set?"
									+ " Input 'zscore' if so, type anything else if not.");
							decision = input.next();
										}
									}
								}
							}	
						}
					}
				    	Data.clear();
						stdev.clear();
						FrequencyMap.clear();
						
				        System.out.println("Would you like to do another custom simulation? Type 'custom' if so.");
				        decision = input.next();
					}
				}
			}
			else if (decision.equals("zscore")) {
				
				while (decision.equals("zscore")) {
					
					System.out.println("Please input the number you'd like to calculate the z score for:");
					double number = input.nextDouble();
					
					System.out.println("Please input the mean:");
					double mean = input.nextDouble();
					
					System.out.println("Please input the standard deviation");
					double sd = input.nextDouble();
					
					double zscore = (number - mean) / sd;
					
					if (zscore == 1) {
						System.out.printf("The inputted number (%.2f) is %.2f standard deviation away (to the right) of the mean.%n", number, Math.abs(zscore));
					}
					else if (zscore == -1) {
						System.out.printf("The inputted number (%.2f) is %.2f standard deviation away (to the left) of the mean.%n", number, Math.abs(zscore));
					}
					else if (zscore > 0) {
						System.out.printf("The inputted number (%.2f) is %.2f standard deviations away (to the right) from the mean.%n", number, Math.abs(zscore));
					}
					else if (zscore < 0 ){
						System.out.printf("The inputted number (%.2f) is %.2f standard deviations away (to the left) of the mean.%n", number, Math.abs(zscore));
					}
					else {
						System.out.printf("The inputted number (%.2f) is the same as the mean (%.2f).%n", number, mean);
					}
					if (zscore > 2) {
						System.out.printf("The inputted number %.2f is a positive outlier.%n", number);
					}
					else if (zscore < -2) {
						System.out.printf("The inputted number %.2f is a negative outlier.%n", number);
					}
					if (zscore >= -1 & zscore <= 1) {
						System.out.printf("The inputted number %.2f lies within 68 percent of the data.%n", number);
					}
					else if (zscore >= -2 & zscore <= 2) {
						System.out.printf("The inputted number %.2f lies within 95 percent of the data.%n", number);
					}
					else if (zscore >= -3 & zscore <= 3) {
						System.out.printf("The inputted number %.2f lies within 99.7 percent of the data.%n", number);
					}
					double sixtyeightp = mean + (1 * sd);
					
					double sixeightp = mean - (1 * sd);
					
					double ninetyfivep = mean + (2 * sd);
					
					double ninefivep = mean - (2 * sd);
					
					double ninetyninepointsevenp = mean + (3 * sd);
					
					double ninenineptsevenp = mean - (3 * sd);
					
					// first two variables are for 68% of the data, 3rd and 4th variables are for 95% of the data
					// and the last two variables are for 99.7% of the data.
					
					System.out.printf("68 percent of the data lies between %.2f and %.2f.%n", sixeightp, sixtyeightp);
					
					System.out.printf("95 percent of the data lies between %.2f and %.2f.%n", ninefivep, ninetyfivep);
					
					System.out.printf("99.7 percent of the data lies between %.2f and %.2f.%n", ninenineptsevenp, ninetyninepointsevenp);
					
					System.out.println("\nWould you like to calculate the zscore of another number? Input 'zscore' if so, type anything else if not.");
					decision = input.next();
				}
			}
			else if (decision.equals("iqr")) {
				
				while (decision.equals("iqr")) {
					
					System.out.println("Input the value for quartile 1:");
					double q1 = input.nextDouble();
					
					System.out.println("Input the value for quartile 3:");
					double q3 = input.nextDouble();
					
					double iqr = q3 - q1;
					
					double lwrotlr = q1 - (iqr * 1.5);
					
					double hghrotlr = q3 + (iqr * 1.5);
					
					// lower and higher outliers.
					
					System.out.printf("The Inter-Quartile Range is %.3f.%n", iqr);
					
					System.out.printf("The limit for lower outliers is %.3f.%n", lwrotlr);
					
					System.out.printf("The limit for upper oultiers is %.3f.%n", hghrotlr);
					
					System.out.println("Would you like to calculate iqr? Type 'iqr' if so, type anything else if not.");
					
					decision = input.next();
				}
			}
		}
		else if (decision.equals("rng")) {
			
			decision = "range";
			
			while (decision.equals("range")) {
			System.out.println("What is the range for your random number generation?");
			
			int range = input.nextInt();
			
			int amt;
			
			decision = "rng";
			
			while (decision.equals("rng")) {
				
				System.out.println("How many numbers would you like randomly generated?:");
				
				amt = input.nextInt();
				
			for (int cnt = 1;cnt <= amt; cnt++) {
			
			int rand = random.nextInt(range) + 1;
			
			if (cnt % 10 == 1) {
				System.out.printf("Your %dst randomly generated number is %d.%n", cnt, rand);
			}
			else if (cnt % 10 == 2) {
				System.out.printf("Your %dnd randomly generated number is %d.%n", cnt, rand);
			}
			else if (cnt % 10 == 3) {
				System.out.printf("Your %drd randomly generated number is %d.%n", cnt, rand);
			}
			else  {
				System.out.printf("Your %dth randomly generated number is %d.%n", cnt, rand);
			}
		}
			System.out.println("Type range to change the range of the rng, or "
					+ "type rng to randomly generate another number with the same range ");
			
			decision = input.next();
			
		}
	}
}
		System.out.println("\n\n\nType reset to restart the program,"
				+ "\nType anything else to stop the program.");
		reset = input.next();
		}
		input.close();
	}
}