import java.util.Scanner;
public class SalesPredictionsProblem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sales = new Scanner(System.in);
		final double  SALESTAX  = .62;
		double check = 0;
		
		do {
		System.out.println("How much money did you make this year?");
			while(!sales.hasNextDouble()) {
			System.out.println("Please try again");
			sales.next();
		}
		check = sales.nextDouble();
		}
		while (check <= 0); {
			System.out.println("Youre income is: " + check);
		}
		
		
		double netPay = check * SALESTAX;
		 System.out.println("You're total earnings after taxes is: $" + netPay);
	}

}
