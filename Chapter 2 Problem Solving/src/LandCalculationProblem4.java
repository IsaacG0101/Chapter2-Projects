import java.util.Scanner;
public class LandCalculationProblem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner land = new Scanner(System.in);
		final int ACRE = 43560;
		int tract = 389767;
		
		int size = tract / ACRE;
		System.out.println("you have " + size + " acres of land");
	}

}
