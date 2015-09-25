
	/*************************************
	 *                                   *
	 * @author Brendan Shine             *
	 * Mr. Kiedes Period 2               *
	 * 9-24-15             
	 * Mortgage Payment                  *
	 *                                   *
	 ************************************/
import java.text.DecimalFormat;
public class Mortgage {
	public static void main(String[] args)
	{
		System.out.println("Lab04a, Student Version\n");
		DecimalFormat decimal = new DecimalFormat("0.00");
		double principal  = 250000.0; //the principal
		double annualRate = 4.85; //the annual rate
		double percentage = annualRate/1200; //the monthly rate
		double numYears   = 30; //the number years
		double numMonths = numYears*12; //number of months
		double topRow = percentage * Math.pow((1 + percentage),(numMonths)); //top row of equation
		double bottomRow = Math.pow((1 + percentage),(numMonths))-1; //bottom row of equation
		double monthPay = (topRow/bottomRow) * principal;
		double totalPayments = monthPay * numMonths;
		double totalInterest = totalPayments - principal;
		
		System.out.println("Principal:          "+ principal); //output of the principal 
		System.out.println("Annual Rate:        "+ annualRate + "%"); //output of the annual rate
		System.out.println("Number of Years:    "+ numYears); //output of the years
		System.out.println("Monthly Payment:    $"+ decimal.format(monthPay)); //output of the monthly payment
		System.out.println("Total Payments:     $"+ decimal.format(totalPayments)); //output of the total payments
		System.out.println("Total Interest:     $" + decimal.format(totalInterest));
		System.out.println();


	
	}
}
