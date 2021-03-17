import java.util.Scanner;

public class MilesPerGallonProblem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner car = new Scanner(System.in);
		double mpg;
		double milesDriven;
		double gasUsed;

		do {
			System.out.println("How many miles did you drive");

			while (!car.hasNextDouble())
				
			{
				System.out.println("Please try again");
				car.next();
			}

			milesDriven = car.nextDouble();
		} while (milesDriven < 0);
		{
			System.out.println("Miles Driven: " + milesDriven);
		}

		do {
			System.out.println("how many gallons of gas did you use?");

			while (!car.hasNextDouble())
				
			{
				System.out.println("Please try again");
				car.next();
			}

			gasUsed = car.nextDouble();
		} while (gasUsed < 0);
		{
			System.out.println("gas used: " + gasUsed);
		}

		mpg = milesDriven / gasUsed;

		System.out.println("Miles per Gallon: " + mpg);

	}

}
