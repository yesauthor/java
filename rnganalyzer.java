import java.util.*;
public class rnganalyzer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        Random random = new Random();
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        ArrayList<Double> Data = new ArrayList<Double>();
        ArrayList<Double> stdev = new ArrayList<Double>();
        
        System.out.println("What is the range for your random number generation? (1 - n)");
        
        int range = input.nextInt();
        double mean = 0;
        int ctt = 0;
        int freq;
        int numbers;
        int mostFrequentNumber = -1;
        int leastFrequentNumber = -1;
        int maxFrequency = -1;
        int minFrequency = Integer.MAX_VALUE;
        String decision = "anything";
        System.out.println("Enter the number of random numbers to generate: ");
        int amt = input.nextInt();

        for (int i = 0; i < amt; i++) {
            int rng = random.nextInt(range) + 1;
            frequencyMap.put(rng, frequencyMap.getOrDefault(rng, 0) + 1);
            double rng2 = rng;
            Data.add(rng2);
            mean = mean + rng;
        }

        System.out.println("Frequencies of each randomly generated number:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
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
        System.out.printf("Most Frequent Number: %d (Frequency: %d)%n", mostFrequentNumber, maxFrequency);
        System.out.printf("Least Frequent Number: %d (Frequency: %d)%n", leastFrequentNumber, minFrequency);
        
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
		
		System.out.printf("%nThe mean of your data set is %.2f.%n", mean);
		
		System.out.printf("Most Frequent Number: %d (Frequency: %d)%n", mostFrequentNumber, maxFrequency);
        
		System.out.printf("Least Frequent Number: %d (Frequency: %d)%n", leastFrequentNumber, minFrequency);
			
		System.out.printf("%nThe value for quartile 3 is %.2f.%n", fq3);
			
		System.out.printf("%nThe interquartile range is %.2f.%n", iqr);
		
		System.out.printf("%nThe standard deviation of the data is %.2f.%n", sd);
			
		System.out.printf("%nNumbers in the data set above %.2f should be considered as outliers.%n", outlier1);
			
		System.out.printf("%nNumbers in the data set below %.2f should be considered as outliers.%n%n", outlier2);
		
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
		
		System.out.printf("%nThe mean of your data set is %.2f.%n", mean);
		
		System.out.printf("Most Frequent Number: %d (Frequency: %d)%n", mostFrequentNumber, maxFrequency);
        
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
        frequencyMap.clear();
        input.close();

	}

}
