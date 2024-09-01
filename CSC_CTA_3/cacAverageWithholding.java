
import java.util.Scanner; //imports Java scanner class


public class cacAverageWithholding {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in); //Creates a scanner for user input
				
		int weeklyIncome;               // declaring a int variable for weekly income
		double averageWithHolding;      // declaring a double variable for the average tax withholding
				
				
		double lowestTaxRate = 0.10;
		double secoundLowestTaxRate = 0.15;
		double secoundHighestTaxRate = 0.20;    //declaring all double variables for tax rates
		double highestTaxRate = 0.30;
				
		System.out.println("Enter your weekly income here: ");
		weeklyIncome = scnr.nextInt();                                /* I created text which prints to the console
				                                                               asking the user for input*/
				
		Boolean lowestWeeklyIncome = weeklyIncome < 500;
		boolean secoundLowestWeeklyIncome = weeklyIncome >= 500 && weeklyIncome < 1500; 
		Boolean secoundHighestWeeklyIncome = weeklyIncome >= 1500 && weeklyIncome < 2500;      // I created Boolean variables for the different ranges of weekly income
		Boolean highestWeeklyIncome = weeklyIncome >= 2500;         
				
		if (lowestWeeklyIncome) {
			averageWithHolding = weeklyIncome * lowestTaxRate;
			System.out.printf("Your weekly average tax withholding is " +"% .2f",averageWithHolding); //This is a if statement. When true, prints out average withholding
		}
				
		if (secoundLowestWeeklyIncome) {
			averageWithHolding = weeklyIncome * secoundLowestTaxRate;
			System.out.printf("Your weekly average tax withholding is " +"% .2f", averageWithHolding); //This is a if statement. When true, prints out average withholding
		}
					
		if (secoundHighestWeeklyIncome) {
			averageWithHolding = weeklyIncome * secoundHighestTaxRate;
			System.out.printf("Your weekly average tax withholding is " +"% .2f", averageWithHolding); //This is a if statement. When true, prints out average withholding
		}

		if (highestWeeklyIncome) {
			averageWithHolding = weeklyIncome * highestTaxRate;
			System.out.printf("Your weekly average tax withholding is " +"% .2f", averageWithHolding); //This is a if statement. When true, prints out average withholding
		}
			}

		


	}

