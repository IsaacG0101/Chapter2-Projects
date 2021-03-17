import java.util.Scanner;
public class CookieCaloriesProblem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner count = new Scanner(System.in);
		int bag;
		double cookiesEaten;
		final double CALORIES_PER_SERVING = 300;
		final double CALORIES_PER_COOKIE = 30;
		
		
		do {
			System.out.println("there are 40 cookies in the bag, how many did you eat?");
			
			 while (!count.hasNextDouble()) {
					System.out.println("please try again");
					count.next();
				}
			cookiesEaten = count.nextDouble();
		}
			while (cookiesEaten < 0); {
				System.out.println("You ate " + cookiesEaten + " cookies");
			}
			
			System.out.println("total calories consumed: " + cookiesEaten * CALORIES_PER_COOKIE );
			
			
		}
		
	}


