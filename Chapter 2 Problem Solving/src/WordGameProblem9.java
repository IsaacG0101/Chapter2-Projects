import javax.swing.JOptionPane;

public class WordGameProblem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name, age, city, profession, college, animal, petsName, UserOutputString;
		
		name = javax.swing.JOptionPane.showInputDialog("Enter your name");
		age = javax.swing.JOptionPane.showInputDialog("Enter your age");
		city = javax.swing.JOptionPane.showInputDialog("what city do you live in");
		profession = javax.swing.JOptionPane.showInputDialog("What's your profession");
		college = javax.swing.JOptionPane.showInputDialog("What college did you go to");
		animal = javax.swing.JOptionPane.showInputDialog("what animal do you have");
		petsName = javax.swing.JOptionPane.showInputDialog("What's your pet's name");
		
		UserOutputString = "There once was a person is named " + name + "Who Lived in the city of " + city
				+ " at the age of " + age + " went to " + college + " college, and my proffession is " + profession + " you're animal is a "
				+ animal + " pets Name is " + petsName;
		
		JOptionPane.showMessageDialog(null, UserOutputString);
		
	}

}
