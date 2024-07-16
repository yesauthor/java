import java.util.*;
public class Statistics {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        ArrayList<Double> data = new ArrayList<>();
		
		 System.out.println("Enter numbers separated by spaces to add to the ArrayList:");
	        String inp = input.nextLine();  

	        String[] values = inp.split(" ");
	        
	        for (String value : values) {
	            try {
	                double number = Double.parseDouble(value);
	                data.add(number);
	            } catch (NumberFormatException e) {
	                System.out.println("Invalid number: " + value);
	            }
	        }

	        Collections.sort(data);

	        if (data.isEmpty()) {
	            System.out.println("No valid data was entered.");
	            return;
	        }

	        double median, quartile1, quartile3, iqr, range, mean = 0, sd, outlier1, outlier2;
	        double sum = 0;

	        for (double num : data) {
	            sum += num;
	        }

	        mean = sum / data.size();
	        int middle = data.size() / 2;
	        if (data.size() % 2 == 1) {
	            median = data.get(middle);
	        } else {
	            median = (data.get(middle - 1) + data.get(middle)) / 2;
	        }

	        int q1Index = data.size() / 4;
	        int q3Index = (data.size() * 3) / 4;

	        quartile1 = data.get(q1Index);
	        quartile3 = data.get(q3Index);

	        iqr = quartile3 - quartile1;
	        outlier1 = quartile3 + 1.5 * iqr;
	        outlier2 = quartile1 - 1.5 * iqr;

	        range = data.get(data.size() - 1) - data.get(0);

	        double varianceSum = 0;
	        for (double num : data) {
	            varianceSum += Math.pow(num - mean, 2);
	        }

	        sd = Math.sqrt(varianceSum / data.size());

	        System.out.printf("The range of the data set is %.2f.%n", range);
	        System.out.printf("The value for quartile 1 is %.2f.%n", quartile1);
	        System.out.printf("The median of your data set is %.2f.%n", median);
	        System.out.printf("The mean of your data set is %.2f.%n", mean);
	        System.out.printf("The value for quartile 3 is %.2f.%n", quartile3);
	        System.out.printf("The interquartile range is %.2f.%n", iqr);
	        System.out.printf("The standard deviation of the data is %.3f.%n", sd);
	        System.out.printf("Numbers in the data set above %.2f should be considered as outliers.%n", outlier1);
	        System.out.printf("Numbers in the data set below %.2f should be considered as outliers.%n", outlier2);
	        System.out.println("Data: " + data);
	        System.out.printf("The size of your data set is %d.%n", data.size());

	        for (double num : data) {
	            if (num > outlier1) {
	                System.out.printf("%.2f is an upper outlier.%n", num);
	            } else if (num < outlier2) {
	                System.out.printf("%.2f is a lower outlier.%n", num);
	            }
	        }

	        if (mean > median) {
	            System.out.println("If you were to graph these data points, the graph would be positively (right) skewed.");
	            System.out.println("Since the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
	        } else if (median > mean) {
	            System.out.println("If you were to graph these data points, the graph would be negatively (left) skewed.");
	            System.out.println("Since the data is skewed, it is recommended to use the median and Inter-Quartile Range (IQR).");
	        } else {
	            System.out.println("If you were to graph these data points, the graph would be symmetrical.");
	            System.out.println("Since the data is symmetrical, it is recommended to use the mean and Standard Deviation (St. Dev).");
	        }
	        data.clear();
	        input.close();
	}

}
