import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rng = new Random();
		ArrayList<Double> Data = new ArrayList<Double>();
		String reset = "reset";
		
		while (reset.equals("reset")) {
		reset = "no reset";
			
		System.out.println("Enter the type of math you would like to do (refer to the readme to understand what to type to get the code to work): ");
		
		// to do list: add more stuff for quadratics; different formulas such as root formulas and vertex formulas
		// also how to find vertex and roots from those specific formulas
		// STATISTICS TOP PRIORITY --> then quadratics
		
		String decision = input.next();
		
		if (decision.equals("circle")) {
			
			System.out.println("\nType simple to do simple circle formulas,"
					+ "\nType rad to do radians/degrees circle formulas");
			
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
			
			System.out.println("\nType rads to find radians,"
					+ "\nType deg to find degrees:");
			
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
		
		System.out.println("Type add to do addition,"
				+ "\nType subtract to do subtraction,"
				+ "\nType multiply to do multiplication,"
				+ "\nType divide to do division,"
				+ "\nType compare to do comparisons between numbers:");
		decision = input.next();
		
		if (decision.equals("add")) {
			
			double sum = 0;
			
			double num = -1;
			//number
			
			while (num != 0) {
				
				System.out.println("What is the number you would like to add? (Input 0 to end the addition):");
				
				num = input.nextInt();
			
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
				
				num = input.nextInt();
			
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
				
				num = input.nextInt();
			
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
				
				num = input.nextInt();
			
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
		System.out.println("Type continue if you would like to input more numbers:");
		
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
		
		System.out.println("Type exp to calculate exponents,"
					+ "\nType log to calculate logarithms,"
					+ "\nType ycoord to calculate the y value of an exponential function,"
					+ "\nType xcoord to calculate the x value of an exponential function:");
		decision = input.next();
			
		if (decision.equals("exp")) {
				
		System.out.println("What is the base number?:");
			
		double basenumber = input.nextDouble();
		
		System.out.println("What is the exponent?:");
			
		double exponent = input.nextDouble();
			
		double answer = Math.pow(basenumber, exponent);

		System.out.printf("%.2f to the power of %.2f is %.2f.", basenumber, exponent, answer);	
		}
		else if (decision.equals("log")) {
		
			System.out.println("What is the base of the logarithm?:");
			double base = input.nextDouble();
			
			System.out.println("What is the final answer?:");
			double answer = input.nextDouble();
			
			double la = Math.log(answer) / Math.log(base);
			
			// la is short for logarithm answer
			
			System.out.printf("The logarithm of %.2f with base %.2f is %.2f.", answer, base, la);
		}
		else if (decision.equals("ycoord")) {
			System.out.println("What is the value of the variable a?:");
			
			double a = input.nextDouble();
			
			System.out.println("What is the value of the variable b?:");
			
			double b = input.nextDouble();
			
			System.out.println("What is the power of the variable?:");
			
			double exponent = input.nextDouble();
			
			// variables are named after the equation; a * b^n
			
			double equation = a * Math.pow(b, exponent);
			
			System.out.printf("%nThe answer (correlating to the y value) to %.2f * %.2f ^ %.2f is %.2f.", a, b, exponent, equation);
		}
		else if (decision.equals("xcoord")) {
			System.out.println("What is the value of the variable a?:");
			
			double a = input.nextDouble();
			
			System.out.println("What is the value of the y?:");
			
			double y = input.nextDouble();
			
			System.out.println("What is the power of the variable b?:");
			
			double exponent = input.nextDouble();
			
			// variables are named after the equation; a * b^n
			
			double answer = a * Math.pow(y, exponent);
			
			System.out.printf("%nThe answer (correlating to the x value) to %.2f * %.2f ^ %.2f is %.2f.", a, y, exponent, answer);
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
			
			System.out.println("/nType rootstan to find the roots in standard form,"
					+ "\nType rootsvert to find the roots in vertex form,"
					+ "\nType vertstan to find the vertex in standard form,"
					+ "\nType vertroots to find the vertex in roots form:");
			
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
			
			System.out.println("Type fixed to do a fixed compounded interest formula,"
					+ "\nType dynam to do a dynamic compounded interest formula");
			
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
			System.out.println("Type freq to organize data and calculate stats related to it,"
					+ "\nType prob to calculate probability:");
			
			decision = input.next();
			
			if (decision.equals("freq")) {
				
			double data = 0;
			int cnt = 0;
			
			System.out.println("How many points on the data set do you have?: ");
			int pt = input.nextInt();
				
			while (cnt < pt) {
				
			System.out.println("What is a value in your set of data?: ");
				
			data = input.nextDouble();
				Data.add(data);
					
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
				
			System.out.printf("%nThe maximum of the data set is %.2f.%n", Data.get(cnt - 1));
			
			System.out.printf("%nThe minimum of the data set is %.2f.%n", Data.get(0));
				
			System.out.printf("%nThe range of the data set is %.2f.%n", range);
				
			System.out.printf("%nThe value for quartile 1 is %.2f.%n", fq1);
				
			System.out.printf("%nThe median of your data set is %.2f.%n", median2);
				
			System.out.printf("%nThe value for quartile 3 is %.2f.%n", fq3);
				
			System.out.printf("%nThe interquartile range is %.2f.%n", iqr);
				
			System.out.printf("%nNumbers in the data set above %.2f should be considered as outliers.%n", outlier1);
				
			System.out.printf("%nNumbers in the data set below %.2f should be considered as outliers.%n", outlier2);
			
			System.out.printf("%nThe size of your data set is %d.%n",Data.size());
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
				
			System.out.printf("%nThe maximum of the data set is %.2f.%n", Data.get(cnt - 1));
				
			System.out.printf("%nThe minimum of the data set is %.2f.%n", Data.get(0));
				
			System.out.printf("%nThe range of the data set is %.2f.%n", range);
				
			System.out.printf("%nThe value for quartile 1 is %.2f.%n", qu1);
				
			System.out.printf("%nThe median of your data set is %.2f.%n", fm);
				
			System.out.printf("%nThe value for quartile 3 is %.2f.%n", qu3);
				
			System.out.printf("%nThe interquartile range is %.2f.%n", iqr);
				
			System.out.printf("%nNumbers in the data set above %.2f should be considered as outliers.%n", outlier1);
				
			System.out.printf("%nNumbers in the data set below %.2f should be considered as outliers.%n", outlier2);
				
			System.out.println(Data);
				
			System.out.printf("%nThe size of your data set is %d.%n",Data.size());
		}
	}
}
			else if (decision.equals("prob")) {
				
			}
			
		}
		else if (decision.equals("rng")) {
			
			while (decision.equals("rng")) {
			System.out.println("What is the range for your random number generation?");
			
			int range = input.nextInt();
			
			decision = "range";
			
			while (decision.equals("range")) {
			
			int rand = rng.nextInt(range);
			
			System.out.printf("Your randomly generated number is %d.%n", rand);
			
			System.out.println("Type rng to change the range of the rng, or "
					+ "type range to randomly generate another number with the same range ");
			
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