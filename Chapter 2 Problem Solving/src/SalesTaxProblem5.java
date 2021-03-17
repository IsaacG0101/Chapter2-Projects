import java.util.Scanner;
public class SalesTaxProblem5 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner old = new Scanner(System.in);
		double amount;
		final double SALES_TAX = 0.04;
		final double COUNTRY_TAX = 0.02;
		
		do {
			System.out.println("How much was your purchase");
		while(!old.hasNextDouble()) {
			System.out.println("please try again");
			old.next();
		}
		amount = old.nextDouble();
		}
		while (amount <= 0); {
			System.out.println("The purchase was: " + amount);
		}
		double amountAfterSalesTax = amount * SALES_TAX;
		double amountAterCountryTax = amount * COUNTRY_TAX;
		double finalAmount = amount + amountAfterSalesTax + amountAterCountryTax;
		System.out.println("YOu're sales tax is: " + amountAfterSalesTax + "\n"
				+ "You're Country Tax: " + amountAterCountryTax + "\n" + 
				"You're total is: " + finalAmount);
	}

}
